package net.exacode.example.config;

import net.exacode.example.config.database.DatabaseConfiguration;
import net.exacode.example.infrastructure.context.SpringEventBusPostProcessor;
import net.exacode.example.infrastructure.context.domain.DomainContextImpl;
import net.exacode.example.infrastructure.context.gate.GateImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ DatabaseConfiguration.class, CommandConfiguration.class,
		QueryConfiguration.class, SecurityConfiguration.class })
@ComponentScan(LogicConfiguration.APP_PACKAGE)
public class LogicConfiguration {

	public static final String APP_PACKAGE = "net.exacode.example";

	@Bean
	public GateImpl gateContext() {
		return new GateImpl();
	}

	@Bean
	public DomainContextImpl domainContext() {
		return new DomainContextImpl();
	}

	@Bean
	public SpringEventBusPostProcessor gateContextPostProcessor() {
		return new SpringEventBusPostProcessor(gateContext().getEventBus());
	}

	@Bean
	public SpringEventBusPostProcessor domainContextPostProcessor() {
		return new SpringEventBusPostProcessor(domainContext().getEventBus());
	}
}
