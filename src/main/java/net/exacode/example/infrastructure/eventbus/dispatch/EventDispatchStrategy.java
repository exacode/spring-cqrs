package net.exacode.example.infrastructure.eventbus.dispatch;

import java.util.Set;

import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.handler.MethodHandler;


/**
 * Defines event dispatch startegy.
 * 
 * @author mendlik
 * 
 */
public interface EventDispatchStrategy {

	/**
	 * Defines event dispatch startegy.
	 * 
	 * @param event
	 *            - event to be dispatched
	 * @param handlerMethods
	 *            - handlerMethods connected with event
	 * @param eventBus
	 *            - source eventBus
	 */
	void dispatchEvent(Object event, Set<MethodHandler> handlerMethods,
			EventBus eventBus);
}
