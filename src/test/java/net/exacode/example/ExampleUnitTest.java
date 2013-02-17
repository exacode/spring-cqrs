package net.exacode.example;

import net.exacode.example.suite.UnitTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Category(UnitTest.class)
public class ExampleUnitTest {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void example() {
		logger.info("Example unit test");
	}
}
