package net.exacode.example.infrastructure.eventbus.handler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * Stores and organizes {@link HandlerMethod}s.
 * <p>
 * Thread safe.
 * 
 * @author mendlik
 * 
 */
public class HandlerRegistry {

	private final Map<Class<?>, Set<HandlerMethod>> eventHandlerMethods = new HashMap<Class<?>, Set<HandlerMethod>>();

	private final HandlerMethodFinder finder;

	private final Map<Class<?>, Set<Class<?>>> flattenHierarchyCache = new WeakHashMap<Class<?>, Set<Class<?>>>();

	public HandlerRegistry(HandlerMethodFinder finder) {
		this.finder = finder;
	}

	/**
	 * Adds {@link HandlerMethod}s extracted from handler object.
	 * 
	 * @param handler
	 */
	synchronized public void addHandler(Object handler) {
		eventHandlerMethods.putAll(finder.findHandlerMethods(handler));
	}

	/**
	 * Removes {@link HandlerMethod}s extracted from handler object.
	 * 
	 * @param handler
	 */
	synchronized public void removeHandler(Object handler) {
		Map<Class<?>, Set<HandlerMethod>> methodsInListener = finder
				.findHandlerMethods(handler);
		for (Entry<Class<?>, Set<HandlerMethod>> entry : methodsInListener
				.entrySet()) {
			Set<HandlerMethod> currentHandlers = eventHandlerMethods.get(entry
					.getKey());
			Set<HandlerMethod> eventMethodsInListener = entry.getValue();

			if (currentHandlers == null
					|| !currentHandlers.containsAll(entry.getValue())) {
				throw new IllegalArgumentException(
						"missing event handler for an annotated method. Is "
								+ handler + " registered?");
			}
			currentHandlers.removeAll(eventMethodsInListener);
		}
	}

	/**
	 * Finds all handler objects that has {@link HandlerMethod}s connected with
	 * given eventType.
	 * 
	 * @param eventType
	 * @return handlers
	 */
	public Set<Object> findEventHandlers(Class<?> eventType) {
		Set<HandlerMethod> handlerMethods = findEventHandlerMethods(eventType);
		Set<Object> handlers = new HashSet<Object>();
		for (HandlerMethod methodHandler : handlerMethods) {
			handlers.add(methodHandler.getTarget());
		}
		return handlers;
	}

	/**
	 * Finds all {@link HandlerMethod}s connected with given eventType.
	 * 
	 * @param eventType
	 * @return handlerMethods
	 */
	public Set<HandlerMethod> findEventHandlerMethods(Class<?> eventType) {
		Set<HandlerMethod> handlerMethods = new HashSet<HandlerMethod>();
		Set<Class<?>> eventFlattenedTypes = flattenEventHierarchy(eventType);
		for (Class<?> eventFlattenedType : eventFlattenedTypes) {
			Set<HandlerMethod> handlers = eventHandlerMethods
					.get(eventFlattenedType);
			if (handlers != null) {
				handlerMethods.addAll(handlers);
			}
		}
		return handlerMethods;
	}

	private Set<Class<?>> flattenEventHierarchy(Class<?> concreteClass) {
		Set<Class<?>> hierarchy = flattenHierarchyCache.get(concreteClass);
		if (hierarchy == null) {
			synchronized (flattenHierarchyCache) {
				hierarchy = new HashSet<Class<?>>();
				Class<?> currentClass = concreteClass;
				while (currentClass != null) {
					hierarchy.add(currentClass);
					hierarchy
							.addAll(Arrays.asList(currentClass.getInterfaces()));
					currentClass = currentClass.getSuperclass();
				}
				flattenHierarchyCache.put(concreteClass, hierarchy);
			}
		}
		return hierarchy;
	}
}
