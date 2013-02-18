package net.exacode.example.infrastructure.eventbus.mock;

import java.util.ArrayList;
import java.util.List;

import net.exacode.example.infrastructure.eventbus.DeadEvent;
import net.exacode.example.infrastructure.eventbus.EventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeadEventHandler {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final List<DeadEvent> receivedEvents = new ArrayList<DeadEvent>();

	@EventHandler
	public void handle(DeadEvent event) {
		logger.trace("Received dead event. Reference: {}, soruce event: {}",
				event, event.getEvent());
		receivedEvents.add(event);
	}

	public List<DeadEvent> getReceivedEvents() {
		return receivedEvents;
	}

}