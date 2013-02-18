package net.exacode.example.infrastructure.context.app;

import net.exacode.example.infrastructure.eventbus.DeadEvent;
import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.builder.EventBusBuilder;
import net.exacode.example.infrastructure.eventbus.dispatch.AsyncDispatchStrategy.AsyncEventDescriptor;
import net.exacode.example.infrastructure.eventbus.dispatch.UniqueDispatchStrategy.UniqueEventDescriptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationContextImpl implements ApplicationContext {
	private static class EventDescriptor implements AsyncEventDescriptor,
			UniqueEventDescriptor {

		private static final boolean DEFAULT_UNIQUE = true;

		private static final boolean DEFAULT_ASYNC = false;

		@Override
		public boolean isAsync(Object event) {
			AppEvent eventAnnotation = event.getClass().getAnnotation(
					AppEvent.class);
			boolean async = DEFAULT_ASYNC;
			if (eventAnnotation != null) {
				async = eventAnnotation.async();
			}
			return async;
		}

		@Override
		public boolean isUnique(Object event) {
			AppEvent eventAnnotation = event.getClass().getAnnotation(
					AppEvent.class);
			boolean unique = DEFAULT_UNIQUE;
			if (eventAnnotation != null) {
				unique = eventAnnotation.unique();
			}
			return unique;
		}

	}

	private final EventBus eventBus;

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public ApplicationContextImpl() {
		EventDescriptor eventDescriptor = new EventDescriptor();

		eventBus = new EventBusBuilder().eventDispatchStrategy()
				.async(eventDescriptor).unique(eventDescriptor)
				.buildEventDispatchStrategy()
				.annotatedMethodHandlerFindingStrategy(AppEventListener.class)
				.buildEventBus();
	}

	@AppEventListener
	public void handleDeadEvent(DeadEvent deadEvent) {
		logger.warn("Published event with no handler!\nEvent: {}",
				deadEvent.getEvent());
	}

	public EventBus getEventBus() {
		return eventBus;
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
}