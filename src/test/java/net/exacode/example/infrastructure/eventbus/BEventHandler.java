package net.exacode.example.infrastructure.eventbus;

import java.util.ArrayList;
import java.util.List;

import net.exacode.example.infrastructure.eventbus.handler.EventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BEventHandler {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final List<BEvent> receivedEvents = new ArrayList<BEvent>();

	@EventHandler
	public void handle(BEvent event) {
		logger.trace("Received event. Reference: {}, message: {}", event,
				event.getMessage());
		receivedEvents.add(event);
	}

	public List<BEvent> getReceivedEvents() {
		return receivedEvents;
	}

}