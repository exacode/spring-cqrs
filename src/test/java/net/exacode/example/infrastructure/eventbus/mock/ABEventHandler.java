package net.exacode.example.infrastructure.eventbus.mock;

import java.util.ArrayList;
import java.util.List;

import net.exacode.example.infrastructure.eventbus.EventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ABEventHandler {
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

	public List<BEvent> getReceivedBEvents() {
		return receivedBEvents;
	}

}