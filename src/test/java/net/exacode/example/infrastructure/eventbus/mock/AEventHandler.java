package net.exacode.example.infrastructure.eventbus.mock;

import java.util.ArrayList;
import java.util.List;

import net.exacode.example.infrastructure.eventbus.EventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AEventHandler {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final List<AEvent> receivedEvents = new ArrayList<AEvent>();

	@EventHandler
	public void handle(AEvent event) {
		logger.trace("Received event. Reference: {}, message: {}", event,
				event.getMessage());
		receivedEvents.add(event);
	}

	public List<AEvent> getReceivedEvents() {
		return receivedEvents;
	}

}