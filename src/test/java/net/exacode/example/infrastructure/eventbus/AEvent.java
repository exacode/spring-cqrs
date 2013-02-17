package net.exacode.example.infrastructure.eventbus;

public class AEvent {
	private final String message;

	public AEvent(String message) {
		this.message = message;
	}

	protected String getMessage() {
		return message;
	}

}