package net.exacode.example.infrastructure.eventbus;

class BEvent {
	private final String message;

	public BEvent(String message) {
		this.message = message;
	}

	protected String getMessage() {
		return message;
	}

}