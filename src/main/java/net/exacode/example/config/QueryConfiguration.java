package net.exacode.example.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.query.QueryDslJdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class QueryConfiguration {

	@Bean
	@Autowired
	public QueryDslJdbcTemplate queryQueryDslJdbcTemplate(
			@Qualifier("queryDataSource") DataSource dataSource) {
		return new QueryDslJdbcTemplate(dataSource);
	}

	@Bean
	@Autowired
	public JdbcTemplate queryJdbcTemplate(
			@Qualifier("queryDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
