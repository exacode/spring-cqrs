package net.exacode.example.application.query.user;

import java.util.List;

import net.exacode.example.SpringTestBase;
import net.exacode.example.domain.user.User;
import net.exacode.example.domain.user.UserFactory;
import net.exacode.example.domain.user.UserRepository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserFinderTest extends SpringTestBase {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserFinder userFinder;

	@Autowired
	private UserFactory userFactory;

	@Test
	public void shouldFindUsers() {
		// given
		User user1 = userFactory.setEmail("john.smith@gmail.com")
				.setLogin("john.smith").setPassword("q1w2e3r4").build();
		User user2 = userFactory.setEmail("bruce.waine@gmail.com")
				.setLogin("bruce.waine").setPassword("q1w2e3r4").build();

		// when
		userRepository.persist(user1);
		userRepository.persist(user2);

		// then
		List<UserDto> users = userFinder.findByCriteria(new UserPageCriteria(0,
				10));
		Assert.assertEquals(2, users.size());
	}

	@Test
	public void shouldFindUsersByCriteria() {
		// given
		User user1 = userFactory.setEmail("john.smith@gmail.com")
				.setLogin("john.smith").setPassword("q1w2e3r4").build();
		User user2 = userFactory.setEmail("bruce.waine@gmail.com")
				.setLogin("bruce.waine").setPassword("q1w2e3r4").build();
		User user3 = userFactory.setEmail("john.travolta@gmail.com")
				.setLogin("john.travolta").setPassword("q1w2e3r4").build();

		// when
		userRepository.persist(user1);
		userRepository.persist(user2);
		userRepository.persist(user3);

		// then
		List<UserDto> users = userFinder.findByCriteria(new UserPageCriteria(0,
				10, "john"));
		Assert.assertEquals(2, users.size());
	}
}