package net.exacode.example.infrastructure.eventbus.dispatch;

import java.util.Set;

import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethod;

/**
 * Checks if passed event has not more than one handler connected.
 * <p>
 * Otherwise throws {@link IllegalStateException}
 * 
 * 
 * @author mendlik
 * 
 */
public class UniqueDispatchStrategy implements DispatchStrategy {

	static public interface UniqueEventDescriptor {
		boolean isUnique(Object event);
	}

	public static final UniqueEventDescriptor DEFAULT_EVENT_DESCRIPTOR = new UniqueEventDescriptor() {

		@Override
		public boolean isUnique(Object event) {
			return true;
		}

	};

	public UniqueEventDescriptor eventDescriptor = DEFAULT_EVENT_DESCRIPTOR;

	private DispatchStrategy dispatchStrategy = new SyncDispatchStrategy();

	public UniqueDispatchStrategy(UniqueEventDescriptor eventDescriptor,
			DispatchStrategy dispatchStrategy) {
		this.eventDescriptor = eventDescriptor;
		this.dispatchStrategy = dispatchStrategy;
	}

	public UniqueDispatchStrategy(UniqueEventDescriptor eventDescriptor) {
		this.eventDescriptor = eventDescriptor;
	}

	public UniqueDispatchStrategy(DispatchStrategy dispatchStrategy) {
		this.dispatchStrategy = dispatchStrategy;
	}

	public UniqueDispatchStrategy() {
	}

	@Override
	public void dispatchEvent(Object event, Set<HandlerMethod> handlerMethods,
			EventBus eventBus) {
		if (handlerMethods.size() > 1 && eventDescriptor.isUnique(event)) {
			throw new IllegalStateException(
					"More than one handlers subscribed to unique event. \nEvent: "
							+ event + "\nHandlers: " + handlerMethods);
		}
		dispatchStrategy.dispatchEvent(event, handlerMethods, eventBus);
	}
}
