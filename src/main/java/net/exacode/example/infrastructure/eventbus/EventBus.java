package net.exacode.example.infrastructure.eventbus;

import java.util.Set;

import net.exacode.example.infrastructure.eventbus.dispatch.EventDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.SimpleEventDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.handler.AnnotatedMethodHandlerFinder;
import net.exacode.example.infrastructure.eventbus.handler.EventHandler;
import net.exacode.example.infrastructure.eventbus.handler.EventHandlerRegistry;
import net.exacode.example.infrastructure.eventbus.handler.MethodHandler;
import net.exacode.example.infrastructure.eventbus.handler.MethodHandlerFindingStrategy;


public class EventBus {

	private EventHandlerRegistry handlerRegistry = new EventHandlerRegistry(
			new AnnotatedMethodHandlerFinder<EventHandler>(EventHandler.class));

	private EventDispatchStrategy eventDispatchStrategy = new SimpleEventDispatchStrategy();

	public EventBus() {
	}

	public EventBus(MethodHandlerFindingStrategy methodHandlerFinder) {
		this.handlerRegistry = new EventHandlerRegistry(methodHandlerFinder);
	}

	public EventBus(EventDispatchStrategy eventDispatchStrategy) {
		this.eventDispatchStrategy = eventDispatchStrategy;
	}

	public EventBus(MethodHandlerFindingStrategy methodHandlerFinder,
			EventDispatchStrategy eventDispatchStrategy) {
		this.handlerRegistry = new EventHandlerRegistry(methodHandlerFinder);
		this.eventDispatchStrategy = eventDispatchStrategy;
	}

	public void publish(Object event) {
		Set<MethodHandler> handlerMethods = handlerRegistry
				.findEventHandlerMethods(event.getClass());
		boolean dispatched = false;
		if (handlerMethods != null && !handlerMethods.isEmpty()) {
			dispatched = true;
			eventDispatchStrategy.dispatchEvent(event, handlerMethods, this);
		}

		if (!dispatched && !(event instanceof DeadEvent)) {
			publish(new DeadEvent(event));
		}
	}

	public void subscribe(Object handler) {
		handlerRegistry.addHandler(handler);
	}

	public void unsubscribe(Object handler) {
		handlerRegistry.removeHandler(handler);
	}

	public Set<Object> getEventHandlers(Class<?> eventType) {
		return handlerRegistry.findEventHandlers(eventType);
	}

	protected void setMethodHandlerFindingStrategy(
			MethodHandlerFindingStrategy methodHandlerFinder) {
		this.handlerRegistry = new EventHandlerRegistry(methodHandlerFinder);
	}

	protected void setEventDispatchStrategy(
			EventDispatchStrategy eventDispatchStrategy) {
		this.eventDispatchStrategy = eventDispatchStrategy;
	}

}
