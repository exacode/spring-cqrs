package net.exacode.example.infrastructure.context.app;

import net.exacode.example.infrastructure.eventbus.DeadEvent;
import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.dispatch.AsyncEventDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.UniqueEventDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.AsyncEventDispatchStrategy.AsyncEventDescriptor;
import net.exacode.example.infrastructure.eventbus.dispatch.UniqueEventDispatchStrategy.UniqueEventDescriptor;
import net.exacode.example.infrastructure.eventbus.handler.AnnotatedMethodHandlerFinder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationContextImpl extends EventBus implements
		ApplicationContext {
	private static class EventDescriptor implements AsyncEventDescriptor,
			UniqueEventDescriptor {

		private static final boolean DEFAULT_UNIQUE = true;

		private static final boolean DEFAULT_ASYNC = false;

		@Override
		public boolean isAsync(Object event) {
			ApplicationEvent eventAnnotation = event.getClass().getAnnotation(
					ApplicationEvent.class);
			boolean async = DEFAULT_ASYNC;
			if (eventAnnotation != null) {
				async = eventAnnotation.async();
			}
			return async;
		}

		@Override
		public boolean isUnique(Object event) {
			ApplicationEvent eventAnnotation = event.getClass().getAnnotation(
					ApplicationEvent.class);
			boolean unique = DEFAULT_UNIQUE;
			if (eventAnnotation != null) {
				unique = eventAnnotation.unique();
			}
			return unique;
		}

	}

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public ApplicationContextImpl() {
		EventDescriptor eventDescriptor = new EventDescriptor();
		AsyncEventDispatchStrategy asyncDispatch = new AsyncEventDispatchStrategy(
				new EventDescriptor());
		UniqueEventDispatchStrategy uniqueDispatch = new UniqueEventDispatchStrategy(
				eventDescriptor, asyncDispatch);
		setEventDispatchStrategy(uniqueDispatch);
		setMethodHandlerFindingStrategy(new AnnotatedMethodHandlerFinder<ApplicationEvent>(
				ApplicationEvent.class));
	}

	@AppEventListener
	public void handleDeadEvent(DeadEvent deadEvent) {
		logger.warn("Published event with no handler!\nEvent: {}",
				deadEvent.getEvent());
	}
}