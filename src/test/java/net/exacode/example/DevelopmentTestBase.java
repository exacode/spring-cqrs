package net.exacode.example;

import net.exacode.example.config.ApplicationProfiles;
import net.exacode.example.config.LogicConfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

// @RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { LogicConfiguration.class }, loader = AnnotationConfigContextLoader.class)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class })
@ActiveProfiles(profiles = { ApplicationProfiles.DEVELOPMENT })
public abstract class DevelopmentTestBase {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

}
