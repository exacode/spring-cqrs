package net.exacode.example.infrastructure.eventbus.handler;

import java.lang.reflect.Method;

/**
 * An event published when {@link HandlerMethod}'s exception is suppressed.
 * 
 * @see SuppressedHandlerMethod
 * 
 * @author mendlik
 * 
 */
public class HandlerInvocationExceptionEvent {
	private final Object handler;
	private final Method method;
	private final Object event;
	private final Throwable cause;

	public HandlerInvocationExceptionEvent(Object handler, Method method,
			Object event, Throwable cause) {
		this.handler = handler;
		this.method = method;
		this.event = event;
		this.cause = cause;
	}

	public Throwable getCause() {
		return cause;
	}

	public Object getHandler() {
		return handler;
	}

	public Method getMethod() {
		return method;
	}

	public Object getEvent() {
		return event;
	}

}
