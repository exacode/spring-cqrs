package net.exacode.example.utils;

import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SqlScriptRunner {

	private static final String CLEAR_DB_SCRIPT_FILE_PATH = "sql/before/clear-db.sql";

	private String cleanDatabaseSql;

	@Autowired
	@Qualifier("commandJdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@PostConstruct
	private void loadScript() {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(this.getClass().getClassLoader()
				.getResourceAsStream(CLEAR_DB_SCRIPT_FILE_PATH));
		while (scanner.hasNextLine()) {
			sb.append(scanner.nextLine());
			sb.append("\n");
		}
		scanner.close();
		cleanDatabaseSql = sb.toString();
	}

	public void cleanDatabase() {
		jdbcTemplate.execute(cleanDatabaseSql);
	}
}
