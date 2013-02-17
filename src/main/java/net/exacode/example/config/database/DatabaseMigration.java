package net.exacode.example.config.database;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.googlecode.flyway.core.Flyway;

/**
 * Application extension of Flyway database migration system.
 * 
 * @author pmendelski
 * 
 */
public class DatabaseMigration extends Flyway {

	private static final String DEFAULT_HISTORY_TABLE = "schema_history";

	private static final String DEFAULT_LOCATION_ROOT = "sql/migration/";

	private static final String DEFAULT_LOCATION = DEFAULT_LOCATION_ROOT
			+ "common";

	private static final String DEFAULT_SCHEMA = "PUBLIC";

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public DatabaseMigration(DataSource dataSource) {
		super();
		super.setDataSource(dataSource);
		super.setTable(DEFAULT_HISTORY_TABLE);
		super.setLocations(DEFAULT_LOCATION);
		super.setSchemas(DEFAULT_SCHEMA);
	}

	@SuppressWarnings("deprecation")
	public boolean safeInit() {
		boolean dbInitialized = super.status() == null;
		if (dbInitialized) {
			logger.info("Flyway initialization");
			super.init();
		} else {
			logger.info("Flyway already initialized");
		}
		super.migrate();
		return dbInitialized;
	}

	public void setApplicationLocation(String... locations) {
		List<String> applicationLocations = new ArrayList<String>(
				locations.length + 1);
		applicationLocations.add(DEFAULT_LOCATION);
		for (String l : locations) {
			applicationLocations.add(DEFAULT_LOCATION_ROOT + l);
		}
		super.setLocations(applicationLocations
				.toArray(new String[applicationLocations.size()]));
	}
}
