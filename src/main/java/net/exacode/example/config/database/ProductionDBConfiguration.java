package net.exacode.example.config.database;

import java.sql.SQLException;

import javax.sql.DataSource;

import net.exacode.example.config.ApplicationProfiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jndi.JndiObjectFactoryBean;

/**
 * Configuration of database for full data set.
 * 
 * @author pmendelski
 * 
 */
@Configuration
@Profile(ApplicationProfiles.PRODUCTION)
@PropertySource("classpath:sql/db/production-db.properties")
public class ProductionDBConfiguration {

	@Autowired
	private Environment environment;

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Bean
	public DataSource commandDataSource() throws SQLException {
		logger.info("Creating command datasource");
		JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
		jndiObjectFactoryBean.setJndiName(environment
				.getProperty("db.command.jndi"));
		try {
			jndiObjectFactoryBean.afterPropertiesSet();
		} catch (Exception ex) {
			throw new RuntimeException("JNDI DS lookup failed!");
		}
		DataSource commandDataSource = (DataSource) jndiObjectFactoryBean
				.getObject();
		logger.info("Command datasource: {}", commandDataSource);
		return commandDataSource;
	}

	@Bean
	public DataSource queryDataSource() throws SQLException {
		logger.info("Creating query datasource");
		JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
		jndiObjectFactoryBean.setJndiName(environment
				.getProperty("db.command.jndi"));
		try {
			jndiObjectFactoryBean.afterPropertiesSet();
		} catch (Exception ex) {
			throw new RuntimeException("JNDI DS lookup failed!");
		}
		DataSource queryDataSource = (DataSource) jndiObjectFactoryBean
				.getObject();
		logger.info("Query datasource: {}", queryDataSource);
		return queryDataSource;
	}

	@Bean
	@Autowired
	public DatabaseMigration applicationFlyway(
			@Qualifier("commandDataSource") DataSource dataSource) {
		DatabaseMigration flyway = new DatabaseMigration(dataSource);
		flyway.setApplicationLocation("production");
		flyway.safeInit();
		return flyway;
	}

}
