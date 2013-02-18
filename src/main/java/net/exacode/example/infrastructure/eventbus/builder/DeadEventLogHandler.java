package net.exacode.example.infrastructure.eventbus.builder;

import net.exacode.example.infrastructure.eventbus.DeadEvent;
import net.exacode.example.infrastructure.eventbus.EventHandler;

public class DeadEventLogHandler {
	@EventHandler
	public void handle(DeadEvent deadEvent) {

	}
}
