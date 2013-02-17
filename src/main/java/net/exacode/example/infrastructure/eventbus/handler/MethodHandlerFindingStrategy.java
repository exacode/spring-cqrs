package net.exacode.example.infrastructure.eventbus.handler;

import java.util.Map;
import java.util.Set;

import net.exacode.example.infrastructure.eventbus.EventBus;


/**
 * A method for finding event handler methods in objects, for use by
 * {@link EventBus}.
 * 
 * @author Paweł Mendelski
 */
public interface MethodHandlerFindingStrategy {

	/**
	 * Finds all suitable event handler methods in {@code source}, organizes
	 * them by the type of event they handle, and wraps them in
	 * {@link MethodHandler}s.
	 * 
	 * @param source
	 *            object whose handlers are desired.
	 */
	Map<Class<?>, Set<MethodHandler>> findAllHandlers(Object source);

}