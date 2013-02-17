package net.exacode.example;

import net.exacode.example.config.ApplicationProfiles;
import net.exacode.example.config.LogicTestConfiguration;
import net.exacode.example.utils.SqlScriptRunner;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { LogicTestConfiguration.class }, loader = AnnotationConfigContextLoader.class)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class })
@ActiveProfiles(profiles = { ApplicationProfiles.TEST })
public abstract class SpringTestBase {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	public SqlScriptRunner databaseCleaner;

	@Before
	public void setup() {
		databaseCleaner.cleanDatabase();
	}
}
