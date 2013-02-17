package net.exacode.example.domain.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.SystemWideSaltSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderServiceImpl implements PasswordEncoderService {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private SystemWideSaltSource saltSource;

	@Override
	public String encodePassword(String password) {
		return passwordEncoder.encodePassword(password,
				saltSource.getSystemWideSalt());
	}

	@Override
	public boolean isPasswordValid(String encPass, String rawPass) {
		return passwordEncoder.isPasswordValid(encPass, rawPass,
				saltSource.getSystemWideSalt());
	}

}
