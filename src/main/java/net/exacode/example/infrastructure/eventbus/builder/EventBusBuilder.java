package net.exacode.example.infrastructure.eventbus.builder;

import java.lang.annotation.Annotation;

import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.EventHandler;
import net.exacode.example.infrastructure.eventbus.dispatch.DispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.SyncDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.handler.AnnotatedHandlerMethodFinder;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethodFinder;

/**
 * {@link EventBus} builder.
 * 
 * @author mendlik
 * 
 */
public class EventBusBuilder {

	private DispatchStrategy eventDispatchStrategy;

	private HandlerMethodFinder methodHandlerFindingStrategy;

	private String logId;

	private DeadEventLogHandler deadEventLogHandler;

	private InvocationExceptionLogHandler invocationExceptionLogHandler;

	public EventDispatchStrategyBuilder eventDispatchStrategy() {
		return new EventDispatchStrategyBuilder(this);
	}

	public EventBusBuilder eventDispatchStrategy(
			DispatchStrategy eventDispatchStrategy) {
		this.eventDispatchStrategy = eventDispatchStrategy;
		return this;
	}

	public EventBusBuilder methodHandlerFindingStrategy(
			HandlerMethodFinder methodHandlerFindingStrategy) {
		this.methodHandlerFindingStrategy = methodHandlerFindingStrategy;
		return this;
	}

	public EventBusBuilder logId(String logId) {
		this.logId = logId;
		return this;
	}

	public <A extends Annotation> EventBusBuilder annotatedMethodHandlerFindingStrategy(
			Class<A> annotationType) {
		this.methodHandlerFindingStrategy = new AnnotatedHandlerMethodFinder<A>(
				annotationType);
		return this;
	}

	public EventBusBuilder withDeadEventLogHandler() {
		this.deadEventLogHandler = new DeadEventLogHandler();
		return this;
	}

	public EventBusBuilder withHadnlerInvocationExceptionLogHandler() {
		this.invocationExceptionLogHandler = new InvocationExceptionLogHandler();
		return this;
	}

	/**
	 * Builds {@link EventBus} from components.
	 * 
	 * @return new instance of {@link EventBus}
	 */
	public EventBus buildEventBus(Object... handlers) {
		if (methodHandlerFindingStrategy == null) {
			methodHandlerFindingStrategy = new AnnotatedHandlerMethodFinder<EventHandler>(
					EventHandler.class);
		}
		if (eventDispatchStrategy == null) {
			eventDispatchStrategy = new SyncDispatchStrategy();
		}
		if (logId == null) {
			logId = "EventBus";
		}
		EventBus eventBus = new EventBus(logId, methodHandlerFindingStrategy,
				eventDispatchStrategy);
		if (invocationExceptionLogHandler != null) {
			eventBus.subscribe(invocationExceptionLogHandler);
		}
		if (deadEventLogHandler != null) {
			eventBus.subscribe(deadEventLogHandler);
		}
		for (Object handler : handlers) {
			eventBus.subscribe(handler);
		}
		return eventBus;
	}
}
