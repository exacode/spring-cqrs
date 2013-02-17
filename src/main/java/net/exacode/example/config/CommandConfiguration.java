package net.exacode.example.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jdbc.query.QueryDslJdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement(proxyTargetClass = false)
public class CommandConfiguration {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private Environment environment;

	@Bean
	@Autowired
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			@Qualifier("commandDataSource") DataSource dataSource)
			throws ClassNotFoundException {
		logger.info("Creating hibernate entityManagerFactory with dialect: {}",
				environment.getProperty("hibernate.dialect"));
		Map<String, Object> jpaProperties = new HashMap<String, Object>();
		jpaProperties.put("hibernate.dialect",
				environment.getProperty("hibernate.dialect"));
		jpaProperties.put("hibernate.format_sql",
				environment.getProperty("hibernate.formatSql"));
		jpaProperties.put("hibernate.show_sql",
				environment.getProperty("hibernate.showSql"));
		jpaProperties.put("hibernate.jdbc.batch_size",
				environment.getProperty("hibernate.jdbc.batchSize"));
		jpaProperties.put("hibernate.order_inserts",
				environment.getProperty("hibernate.orderInserts"));
		jpaProperties.put("hibernate.order_updates",
				environment.getProperty("hibernate.orderUpdates"));
		jpaProperties.put("hibernate.use_sql_comments",
				environment.getProperty("hibernate.useSqlComments"));

		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(dataSource);
		entityManagerFactoryBean
				.setPackagesToScan(LogicConfiguration.APP_PACKAGE);
		entityManagerFactoryBean
				.setPersistenceProviderClass(HibernatePersistence.class);
		entityManagerFactoryBean.setJpaPropertyMap(jpaProperties);
		return entityManagerFactoryBean;
	}

	@Bean
	@Autowired
	public JpaTransactionManager transactionManager(
			EntityManagerFactory entityManagerFactory)
			throws ClassNotFoundException {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}

	@Bean
	@Autowired
	public QueryDslJdbcTemplate commandQueryDslJdbcTemplate(
			@Qualifier("commandDataSource") DataSource dataSource) {
		return new QueryDslJdbcTemplate(dataSource);
	}

	@Bean
	@Autowired
	public JdbcTemplate commandJdbcTemplate(
			@Qualifier("commandDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
