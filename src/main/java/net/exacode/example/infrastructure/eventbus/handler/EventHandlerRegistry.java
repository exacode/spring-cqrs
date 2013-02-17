package net.exacode.example.infrastructure.eventbus.handler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * Stores and organizes {@link MethodHandler}s.
 * 
 * @author mendlik
 * 
 */
public class EventHandlerRegistry {

	private final Map<Class<?>, Set<MethodHandler>> eventHandlerMethods = new HashMap<Class<?>, Set<MethodHandler>>();

	private final MethodHandlerFindingStrategy finder;

	private final Map<Class<?>, Set<Class<?>>> flattenHierarchyCache = new WeakHashMap<Class<?>, Set<Class<?>>>();

	public EventHandlerRegistry(MethodHandlerFindingStrategy finder) {
		this.finder = finder;
	}

	/**
	 * Adds {@link MethodHandler}s extracted from handler object.
	 * 
	 * @param handler
	 */
	synchronized public void addHandler(Object handler) {
		eventHandlerMethods.putAll(finder.findAllHandlers(handler));
	}

	/**
	 * Removes {@link MethodHandler}s extracted from handler object.
	 * 
	 * @param handler
	 */
	synchronized public void removeHandler(Object handler) {
		Map<Class<?>, Set<MethodHandler>> methodsInListener = finder
				.findAllHandlers(handler);
		for (Entry<Class<?>, Set<MethodHandler>> entry : methodsInListener
				.entrySet()) {
			Set<MethodHandler> currentHandlers = eventHandlerMethods.get(entry
					.getKey());
			Set<MethodHandler> eventMethodsInListener = entry.getValue();

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
	 * Finds all handler objects that has {@link MethodHandler}s connected with
	 * given eventType.
	 * 
	 * @param handler
	 */
	public Set<Object> findEventHandlers(Class<?> eventType) {
		Set<MethodHandler> handlerMethods = findEventHandlerMethods(eventType);
		Set<Object> handlers = new HashSet<Object>();
		for (MethodHandler methodHandler : handlerMethods) {
			handlers.add(methodHandler.getTarget());
		}
		return handlers;
	}

	/**
	 * Finds all {@link MethodHandler}s connected with given eventType.
	 * 
	 * @param handler
	 */
	public Set<MethodHandler> findEventHandlerMethods(Class<?> eventType) {
		Set<MethodHandler> handlerMethods = new HashSet<MethodHandler>();
		Set<Class<?>> eventFlattenedTypes = flattenEventHierarchy(eventType);
		for (Class<?> eventFlattenedType : eventFlattenedTypes) {
			Set<MethodHandler> handlers = eventHandlerMethods
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
