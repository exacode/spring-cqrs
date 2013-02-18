package net.exacode.example.infrastructure.eventbus.mock;

public class AEvent {
	private final String message;

	public AEvent() {
		this.message = "AEvent";
	}

	public AEvent(String message) {
		this.message = message;
	}

	protected String getMessage() {
		return message;
	}

}