package net.exacode.example.infrastructure;

import java.lang.reflect.Constructor;

/**
 * Generic invariant helper.
 * @author pmendelski
 */
public class Invariant {

	public static final String LOGIN_PATTERN = "[A-Za-z0-9\\-\\+\\.\\_]+";

	public static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/**
	 * Generic invariant check.
	 * @param correct
	 * @param exceptionClass
	 * @throws Throwable
	 */
	public static void check(boolean correct, String message, Class<RuntimeException> exceptionClass) throws Throwable {
		if (!correct) {
			Constructor<RuntimeException> constructor = exceptionClass.getConstructor(new Class[] {
				String.class
			});
			throw constructor.newInstance(new Object[] {
				message
			});
		}
	}

	/**
	 * Generic invariant check.
	 * @param correct
	 * @param exceptionClass
	 * @throws Throwable
	 */
	public static void check(boolean correct, Class<RuntimeException> exceptionClass) throws Throwable {
		if (!correct) {
			throw exceptionClass.getConstructor().newInstance();
		}
	}

	/**
	 * Checks if an object is null.
	 * @param object being tested
	 * @param message in case of null object
	 * @throws NullPointerException
	 */
	public static void notNull(Object object, String message) throws NullPointerException {
		if (object == null) {
			throw new NullPointerException(message);
		}
	}

	/**
	 * Checks if an object is null or empty.
	 * @param object being tested
	 * @param message in case of null object or (trimmed) empty string
	 * @throws NullPointerException
	 */
	public static void notNullAndNotEmpty(String text, String message)
			throws NullPointerException,
			IllegalArgumentException {
		Invariant.notNull(text, message);
		if (text.trim().isEmpty()) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * Checks if length of the string is in the given interval (inclusive).
	 * @param text
	 * @param lengthMin
	 * @param lengthMax
	 * @param message applied to all declared exceptions thrown from this method
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public static void lengthInterval(String text, int lengthMin, int lengthMax, String message)
			throws NullPointerException,
			IllegalArgumentException {
		Invariant.notNull(text, message);
		int length = text.length();
		if (length < lengthMin || length > lengthMax) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * Checks if length of the string is longer than given value (inclusive).
	 * @param text
	 * @param lengthMax
	 * @param message applied to all declared exceptions thrown from this method
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public static void longerThan(String text, int lengthMax, String message)
			throws NullPointerException,
			IllegalArgumentException {
		Invariant.notNull(text, message);
		int length = text.length();
		if (length <= lengthMax) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * Checks the length of the string.
	 * @param text
	 * @param length
	 * @param message applied to all declared exceptions thrown from this method
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public static void ofLength(String text, int length, String message)
			throws NullPointerException,
			IllegalArgumentException {
		Invariant.notNull(text, message);
		if (text.length() != length) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * Checks if the text matches the regex pattern.
	 * @param text
	 * @param regex
	 * @param message applied to all declared exceptions thrown from this method
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public static void matchesPattern(String text, String regex, String message)
			throws NullPointerException,
			IllegalArgumentException {
		Invariant.notNull(text, message);
		if (!text.matches(regex)) {
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * Checks some arithmetic expression.
	 * @param correct result of logical arithmetic expression
	 * @param message applied to ArithmeticException exception thrown from this method
	 * @throws ArithmeticException thrown when first parameter is false
	 */
	public static void check(boolean correct, String message) throws ArithmeticException {
		if (!correct) {
			throw new ArithmeticException(message);
		}
	}
}
