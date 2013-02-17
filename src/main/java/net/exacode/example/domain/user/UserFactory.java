package net.exacode.example.domain.user;

import net.exacode.example.infrastructure.DependencyInjector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

	@Autowired
	protected DependencyInjector injector;

	private String email;

	private String login;

	private String password;

	public UserFactory setEmail(String email) {
		this.email = email;
		return this;
	}

	public UserFactory setLogin(String login) {
		this.login = login;
		return this;
	}

	public UserFactory setPassword(String password) {
		this.password = password;
		return this;
	}

	public User build() {
		User user = new User();
		injector.inject(user);
		user.setEmail(email);
		user.setLogin(login);
		user.setPassword(password);
		return user;
	}
}
