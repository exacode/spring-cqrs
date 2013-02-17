package net.exacode.example;

import net.exacode.example.domain.user.User;
import net.exacode.example.domain.user.UserFactory;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ExampleSpringTest extends SpringTestBase {

	@Autowired
	private UserFactory userFactory;

	@Test
	public void example() {
		logger.info("Example spring test");
		User user = userFactory.setLogin("abzdgsgc").setEmail("abc@def.pl").setPassword("xxx").build();
	}

}
