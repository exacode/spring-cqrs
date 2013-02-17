package net.exacode.example.application.command.user;

import net.exacode.example.domain.user.User;
import net.exacode.example.domain.user.UserFactory;
import net.exacode.example.domain.user.UserRepository;
import net.exacode.example.infrastructure.context.gate.CommandHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterUserCommandHandler {

	@Autowired
	private UserFactory userFactory;

	@Autowired
	private UserRepository userRepository;

	@CommandHandler
	public void handle(RegisterUserCommand command) {
		User user =
				userFactory
						.setLogin(command.getLogin())
						.setEmail(command.getEmail())
						.setPassword(command.getPassword())
						.build();
		user = userRepository.persist(user);
	}

}
