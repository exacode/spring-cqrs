package net.exacode.example.infrastructure.eventbus.dispatch;

import java.util.Set;

import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.handler.MethodHandler;


/**
 * Simple (synchronous) events dispatching.
 * 
 * @author mendlik
 * 
 */
public class SimpleEventDispatchStrategy implements EventDispatchStrategy {

	@Override
	public void dispatchEvent(Object event, Set<MethodHandler> handlerMethods,
			EventBus eventBus) {
		for (MethodHandler wrapper : handlerMethods) {
			wrapper.handleEvent(event);
		}
	}

}
