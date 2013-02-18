package net.exacode.example.infrastructure.eventbus.handler;

import java.lang.reflect.Method;

import net.exacode.example.infrastructure.eventbus.EventBus;

/**
 * Represents handler method that doeasn't propagate exceptions (of type
 * {@link Throwable}).
 * <p>
 * The information about exception is propagated in {@link EventBus} by
 * {@link HandlerInvocationExceptionEvent}.
 * 
 * @author mendlik
 * 
 */
public class SuppressedHandlerMethod implements HandlerMethod {

	private final HandlerMethod methodHandler;

	private final EventBus eventBus;

	public SuppressedHandlerMethod(HandlerMethod methodHandler,
			EventBus eventBus) {
		this.methodHandler = methodHandler;
		this.eventBus = eventBus;
	}

	/**
	 * 
	 * @return handler object
	 */
	@Override
	public Object getTarget() {
		return methodHandler.getTarget();
	}

	/**
	 * 
	 * @return handler method
	 */
	@Override
	public Method getMethod() {
		return methodHandler.getMethod();
	}

	/**
	 * Invokes the wrapped handler method to handle an {@code event}.
	 * 
	 * @param event
	 *            event to handle
	 */
	@Override
	public void handleEvent(Object event) {
		try {
			methodHandler.handleEvent(event);
		} catch (Throwable e) {
			eventBus.publish(new HandlerInvocationExceptionEvent(methodHandler
					.getTarget(), methodHandler.getMethod(), event, e));
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((eventBus == null) ? 0 : eventBus.hashCode());
		result = prime * result
				+ ((methodHandler == null) ? 0 : methodHandler.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuppressedHandlerMethod other = (SuppressedHandlerMethod) obj;
		if (eventBus == null) {
			if (other.eventBus != null)
				return false;
		} else if (!eventBus.equals(other.eventBus))
			return false;
		if (methodHandler == null) {
			if (other.methodHandler != null)
				return false;
		} else if (!methodHandler.equals(other.methodHandler))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SuppressedHandlerMethod [methodHandler=" + methodHandler + "]";
	}

}
