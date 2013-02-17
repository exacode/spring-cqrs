package net.exacode.example.infrastructure.eventbus;

import java.util.ArrayList;
import java.util.List;

import net.exacode.example.infrastructure.eventbus.handler.EventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ABEventHandler {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final List<AEvent> receivedAEvents = new ArrayList<AEvent>();

	private final List<BEvent> receivedBEvents = new ArrayList<BEvent>();

	@EventHandler
	public void handlea(AEvent event) {
		logger.trace("Received event. Reference: {}, message: {}", event,
				event.getMessage());
		receivedAEvents.add(event);
	}

	@EventHandler
	public void handle(BEvent event) {
		logger.trace("Received event. Reference: {}, message: {}", event,
				event.getMessage());
		receivedBEvents.add(event);
	}

	public List<AEvent> getReceivedAEvents() {
		return receivedAEvents;
	}

	protected List<BEvent> getReceivedBEvents() {
		return receivedBEvents;
	}

}