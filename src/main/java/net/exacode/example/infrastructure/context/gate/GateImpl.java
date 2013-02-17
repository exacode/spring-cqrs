package net.exacode.example.infrastructure.context.gate;

import net.exacode.example.infrastructure.eventbus.DeadEvent;
import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.dispatch.AsyncEventDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.UniqueEventDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.AsyncEventDispatchStrategy.AsyncEventDescriptor;
import net.exacode.example.infrastructure.eventbus.dispatch.UniqueEventDispatchStrategy.UniqueEventDescriptor;
import net.exacode.example.infrastructure.eventbus.handler.AnnotatedMethodHandlerFinder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GateImpl extends EventBus implements Gate {

	private static class EventDescriptor implements AsyncEventDescriptor,
			UniqueEventDescriptor {

		private static final boolean DEFAULT_UNIQUE = true;

		private static final boolean DEFAULT_ASYNC = false;

		@Override
		public boolean isAsync(Object event) {
			Command command = event.getClass().getAnnotation(Command.class);
			boolean async = DEFAULT_ASYNC;
			if (command != null) {
				async = command.async();
			}
			return async;
		}

		@Override
		public boolean isUnique(Object event) {
			Command command = event.getClass().getAnnotation(Command.class);
			boolean unique = DEFAULT_UNIQUE;
			if (command != null) {
				unique = command.unique();
			}
			return unique;
		}

	}

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public GateImpl() {
		EventDescriptor eventDescriptor = new EventDescriptor();
		AsyncEventDispatchStrategy asyncDispatch = new AsyncEventDispatchStrategy(
				new EventDescriptor());
		UniqueEventDispatchStrategy uniqueDispatch = new UniqueEventDispatchStrategy(
				eventDescriptor, asyncDispatch);
		setMethodHandlerFindingStrategy(new AnnotatedMethodHandlerFinder<Command>(
				Command.class));
		setEventDispatchStrategy(uniqueDispatch);
	}

	@CommandHandler
	private void handleDeadEvent(DeadEvent deadEvent) {
		logger.warn("Published event with no handler!\nEvent: {}",
				deadEvent.getEvent());
	}
}
