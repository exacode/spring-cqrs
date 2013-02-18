package net.exacode.example.infrastructure.eventbus.dispatch;

import java.util.Set;

import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethod;


/**
 * Defines event dispatch startegy.
 * 
 * @author mendlik
 * 
 */
public interface DispatchStrategy {

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
	void dispatchEvent(Object event, Set<HandlerMethod> handlerMethods,
			EventBus eventBus);
}
