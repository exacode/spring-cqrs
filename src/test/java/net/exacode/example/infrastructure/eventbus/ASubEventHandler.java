package net.exacode.example.infrastructure.eventbus;

import java.util.ArrayList;
import java.util.List;

import net.exacode.example.infrastructure.eventbus.handler.EventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ASubEventHandler {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final List<ASubEvent> receivedEvents = new ArrayList<ASubEvent>();

	@EventHandler
	public void handle(ASubEvent event) {
		logger.trace("Received event. Reference: {}, message: {}", event,
				event.getMessage());
		receivedEvents.add(event);
	}

	public List<ASubEvent> getReceivedEvents() {
		return receivedEvents;
	}

}