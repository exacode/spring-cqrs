package net.exacode.example.infrastructure.eventbus.handler;

import java.util.Map;
import java.util.Set;

import net.exacode.example.infrastructure.eventbus.EventBus;

/**
 * A method for finding event handler methods in objects, for use by
 * {@link EventBus}.
 * 
 * @author mendlik
 */
public interface HandlerMethodFinder {

	/**
	 * Finds all suitable event handler methods in {@code handler}, organizes
	 * them by the type of event they handle, and wraps them in
	 * {@link HandlerMethod}s.
	 * 
	 * @param handler
	 *            object whose methods are handle events.
	 */
	Map<Class<?>, Set<HandlerMethod>> findHandlerMethods(Object handler);

}