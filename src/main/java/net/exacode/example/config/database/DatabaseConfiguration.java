package net.exacode.example.config.database;

import net.exacode.example.config.ApplicationProfiles;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

/**
 * Configuration of database for full data set.
 * 
 * @author pmendelski
 * 
 */
@Configuration
@Import({ DevelopmentDBConfiguration.class, ProductionDBConfiguration.class })
@Profile({ ApplicationProfiles.DEVELOPMENT, ApplicationProfiles.PRODUCTION })
public class DatabaseConfiguration {

}
