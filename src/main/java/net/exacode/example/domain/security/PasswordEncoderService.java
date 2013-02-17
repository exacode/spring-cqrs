package net.exacode.example.domain.security;

public interface PasswordEncoderService {

	String encodePassword(String password);

	boolean isPasswordValid(String encPass, String rawPass);

}
