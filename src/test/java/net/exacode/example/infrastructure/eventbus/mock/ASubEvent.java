package net.exacode.example.infrastructure.eventbus.mock;

public class ASubEvent extends AEvent {

	public ASubEvent() {
		super("ASubEvent");
	}

	public ASubEvent(String message) {
		super(message);
	}

}