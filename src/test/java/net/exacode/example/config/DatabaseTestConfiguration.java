package net.exacode.example.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import net.exacode.example.config.database.DatabaseMigration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Configuration of database for full data set.
 * 
 * @author pmendelski
 * 
 */
@Configuration
@Profile(ApplicationProfiles.TEST)
@PropertySource("classpath:sql/db/test-db.properties")
public class DatabaseTestConfiguration {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource commandDataSource() throws SQLException {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment
				.getProperty("db.command.driver"));
		dataSource.setUrl(environment.getProperty("db.command.url"));
		dataSource.setUsername(environment.getProperty("db.command.username"));
		dataSource.setPassword(environment.getProperty("db.command.password"));
		return dataSource;
	}

	@Bean
	public DataSource queryDataSource() throws SQLException {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment
				.getProperty("db.query.driver"));
		dataSource.setUrl(environment.getProperty("db.query.url"));
		dataSource.setUsername(environment.getProperty("db.query.username"));
		dataSource.setPassword(environment.getProperty("db.query.password"));
		return dataSource;
	}

	@Bean
	@Autowired
	public DatabaseMigration applicationFlyway(
			@Qualifier("commandDataSource") DataSource dataSource) {
		DatabaseMigration flyway = new DatabaseMigration(dataSource);
		flyway.setApplicationLocation("test");
		flyway.safeInit();
		return flyway;
	}
}
