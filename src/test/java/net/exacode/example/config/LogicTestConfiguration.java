package net.exacode.example.config;

import net.exacode.example.config.ApplicationProfiles;
import net.exacode.example.config.LogicConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@Import({ DatabaseTestConfiguration.class, LogicConfiguration.class })
@Profile({ ApplicationProfiles.TEST })
public class LogicTestConfiguration {

}
