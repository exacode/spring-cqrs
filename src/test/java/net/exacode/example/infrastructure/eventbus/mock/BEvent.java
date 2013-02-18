package net.exacode.example.infrastructure.eventbus.mock;

public class BEvent {
	private final String message;

	public BEvent() {
		this.message = "BEvent";
	}

	public BEvent(String message) {
		this.message = message;
	}

	protected String getMessage() {
		return message;
	}

}