package net.exacode.example.infrastructure.eventbus.handler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import net.exacode.example.infrastructure.Invariant;

/**
 * Represents simple handler method.
 * 
 * @author mendlik
 * 
 */
public class SimpleHandlerMethod implements HandlerMethod {

	/**
	 * Handler object.
	 */
	private final Object target;

	/**
	 * Handler method.
	 */
	private final Method method;

	/**
	 * Creates a new EventHandler to wrap {@code method} on @{code target}.
	 * 
	 * @param target
	 *            object to which the method applies.
	 * @param method
	 *            handler method.
	 */
	public SimpleHandlerMethod(Object target, Method method) {
		Invariant.notNull(target, "EventHandler target cannot be null.");
		Invariant.notNull(method, "EventHandler method cannot be null.");

		this.target = target;
		this.method = method;
		method.setAccessible(true);
	}

	/**
	 * 
	 * @return handler object
	 */
	@Override
	public Object getTarget() {
		return target;
	}

	/**
	 * 
	 * @return handler method
	 */
	@Override
	public Method getMethod() {
		return method;
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
			method.invoke(target, new Object[] { event });
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException("Method became inaccessible: "
					+ event, e);
		} catch (InvocationTargetException e) {
			throw (Error) e.getCause();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((method == null) ? 0 : method.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
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
		SimpleHandlerMethod other = (SimpleHandlerMethod) obj;
		if (method == null) {
			if (other.method != null)
				return false;
		} else if (!method.equals(other.method))
			return false;
		if (target == null) {
			if (other.target != null)
				return false;
		} else if (!target.equals(other.target))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MethodHandler [target=" + target + ", method=" + method + "]";
	}

}
