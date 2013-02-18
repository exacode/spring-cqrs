package net.exacode.example.infrastructure.eventbus.handler;

import java.lang.reflect.Method;

/**
 * Represents handler method.
 * 
 * @author mendlik
 * 
 */
public interface HandlerMethod {

	/**
	 * Invokes the wrapped handler method to handle an {@code event}.
	 * 
	 * @param event
	 *            event to handle
	 */
	void handleEvent(Object event);

	/**
	 * 
	 * @return handler object
	 */
	Object getTarget();

	/**
	 * 
	 * @return handler method
	 */
	Method getMethod();

}
