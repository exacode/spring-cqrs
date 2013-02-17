package net.exacode.example.domain.user;

import net.exacode.example.infrastructure.repository.BaseRepository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends BaseRepository<User, Long> {

	public User findByLogin(String login) {
		User user = getQuery().from(CUser.user)
				.where(CUser.user.login.eq(login)).uniqueResult(CUser.user);
		injector.inject(user);
		return user;
	}

	public User findByEmail(String email) {
		User user = getQuery().from(CUser.user)
				.where(CUser.user.email.eq(email)).uniqueResult(CUser.user);
		injector.inject(user);
		return user;
	}

	public User findByLoginOrEmail(String loginOrEmail) {
		User user = getQuery()
				.from(CUser.user)
				.where(CUser.user.email.eq(loginOrEmail).or(
						CUser.user.login.eq(loginOrEmail)))
				.uniqueResult(CUser.user);
		injector.inject(user);
		return user;
	}

}
