package net.exacode.example.infrastructure.eventbus;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

import net.exacode.example.infrastructure.eventbus.handler.AnnotatedHandlerMethodFinder;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethod;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethodFinder;

public final class EventBusTestUtil {

	public static EventBus getSimpleEventBus(Object... handlers) {
		EventBus eventBus = new EventBus();
		for (Object handler : handlers) {
			eventBus.subscribe(handler);
		}
		return eventBus;
	}

	public static <A extends Annotation> Set<HandlerMethod> getHandlerMethods(
			Class<A> annotationType, Object... handlers) {
		Set<HandlerMethod> handlerMethods = new HashSet<HandlerMethod>();
		HandlerMethodFinder finder = new AnnotatedHandlerMethodFinder<A>(
				annotationType);
		for (Object handler : handlers) {
			for (Set<HandlerMethod> methods : finder
					.findHandlerMethods(handler).values()) {
				handlerMethods.addAll(methods);
			}
		}
		return handlerMethods;
	}
}
