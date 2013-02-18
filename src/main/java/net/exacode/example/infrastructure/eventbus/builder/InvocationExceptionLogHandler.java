package net.exacode.example.infrastructure.eventbus.builder;

import net.exacode.example.infrastructure.eventbus.EventHandler;
import net.exacode.example.infrastructure.eventbus.handler.HandlerInvocationExceptionEvent;

public class InvocationExceptionLogHandler {
	@EventHandler
	public void handle(HandlerInvocationExceptionEvent deadEvent) {

	}
}
