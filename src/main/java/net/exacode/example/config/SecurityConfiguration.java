package net.exacode.example.config;

import org.jasypt.util.text.StrongTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.dao.SystemWideSaltSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.crypto.encrypt.TextEncryptor;

@Configuration
@PropertySource("classpath:security.properties")
public class SecurityConfiguration {

	@Autowired
	private Environment environment;

	@Bean
	public TextEncryptor textEncryptor(SystemWideSaltSource systemWideSaltSource) {
		String password = environment.getProperty("textEncryptor.password");
		final String salt = systemWideSaltSource.getSystemWideSalt();
		final StrongTextEncryptor jasyptTextEncryptor = new StrongTextEncryptor();
		jasyptTextEncryptor.setPassword(password);
		return new TextEncryptor() {

			@Override
			public String encrypt(String text) {
				return jasyptTextEncryptor.encrypt(text);
			}

			@Override
			public String decrypt(String encryptedText) {
				return jasyptTextEncryptor.decrypt(encryptedText);
			}

		};
	}

	@Bean
	public PasswordEncoder passwordEncryptor() {
		return new org.jasypt.springsecurity3.authentication.encoding.PasswordEncoder();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new org.jasypt.springsecurity3.authentication.encoding.PasswordEncoder();
	}

	@Bean
	public SystemWideSaltSource systemWideSaltSource() {
		String salt = environment.getProperty("textEncryptor.salt");
		SystemWideSaltSource systemWideSaltSource = new SystemWideSaltSource();
		systemWideSaltSource.setSystemWideSalt(salt);
		return systemWideSaltSource;
	}

}
