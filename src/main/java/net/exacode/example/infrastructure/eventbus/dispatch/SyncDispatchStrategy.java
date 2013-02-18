package net.exacode.example.infrastructure.eventbus.dispatch;

import java.util.Set;

import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethod;

/**
 * Dispatches events in synchronous way.
 * <p>
 * It is default {@link DispatchStrategy} used by {@link EventBus}.
 * 
 * @author mendlik
 * 
 */
public class SyncDispatchStrategy implements DispatchStrategy {

	@Override
	public void dispatchEvent(Object event, Set<HandlerMethod> handlerMethods,
			EventBus eventBus) {
		for (HandlerMethod wrapper : handlerMethods) {
			wrapper.handleEvent(event);
		}
	}

}
