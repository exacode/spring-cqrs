package net.exacode.example.application.command.user;

public class RegisterUserCommand {

	private final String email;

	private final String password;

	private final String login;

	public RegisterUserCommand(String login, String email, String password) {
		super();
		this.email = email;
		this.password = password;
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getLogin() {
		return login;
	}

}
