package net.exacode.example.infrastructure.eventbus.mock;

import java.util.ArrayList;
import java.util.List;

import net.exacode.example.infrastructure.eventbus.EventHandler;
import net.exacode.example.infrastructure.eventbus.handler.HandlerInvocationExceptionEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvocationExceptionEventHandler {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final List<HandlerInvocationExceptionEvent> receivedEvents = new ArrayList<HandlerInvocationExceptionEvent>();

	@EventHandler
	public void handle(HandlerInvocationExceptionEvent event) {
		logger.trace("Received invocation exception event. Event: {}", event);
		receivedEvents.add(event);
	}

	public List<HandlerInvocationExceptionEvent> getReceivedEvents() {
		return receivedEvents;
	}

}