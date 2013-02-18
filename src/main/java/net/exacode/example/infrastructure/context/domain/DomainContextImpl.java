package net.exacode.example.infrastructure.context.domain;

import net.exacode.example.infrastructure.eventbus.DeadEvent;
import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.builder.EventBusBuilder;
import net.exacode.example.infrastructure.eventbus.dispatch.AsyncDispatchStrategy.AsyncEventDescriptor;
import net.exacode.example.infrastructure.eventbus.dispatch.UniqueDispatchStrategy.UniqueEventDescriptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DomainContextImpl implements DomainContext {
	private static class EventDescriptor implements AsyncEventDescriptor,
			UniqueEventDescriptor {

		private static final boolean DEFAULT_UNIQUE = true;

		private static final boolean DEFAULT_ASYNC = false;

		@Override
		public boolean isAsync(Object event) {
			DomainEvent eventAnnotation = event.getClass().getAnnotation(
					DomainEvent.class);
			boolean async = DEFAULT_ASYNC;
			if (eventAnnotation != null) {
				async = eventAnnotation.async();
			}
			return async;
		}

		@Override
		public boolean isUnique(Object event) {
			DomainEvent eventAnnotation = event.getClass().getAnnotation(
					DomainEvent.class);
			boolean unique = DEFAULT_UNIQUE;
			if (eventAnnotation != null) {
				unique = eventAnnotation.unique();
			}
			return unique;
		}

	}

	private final EventBus eventBus;

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public DomainContextImpl() {
		EventDescriptor eventDescriptor = new EventDescriptor();
		eventBus = new EventBusBuilder()
				.eventDispatchStrategy()
				.async(eventDescriptor)
				.unique(eventDescriptor)
				.buildEventDispatchStrategy()
				.annotatedMethodHandlerFindingStrategy(
						DomainEventListener.class).buildEventBus();
	}

	@DomainEventListener
	public void handleDeadEvent(DeadEvent deadEvent) {
		logger.warn("Published event with no handler!\nEvent: {}\nSource: {}",
				deadEvent.getEvent());
	}

	@Override
	public void publish(Object event) {
		eventBus.publish(event);
	}

	@Override
	public void subscribe(Object handler) {
		eventBus.subscribe(handler);
	}

	@Override
	public void unsubscribe(Object handler) {
		eventBus.unsubscribe(handler);
	}

	public EventBus getEventBus() {
		return eventBus;
	}

}
