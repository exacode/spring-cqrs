package net.exacode.example.infrastructure.eventbus.dispatch;

import java.util.Set;

import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.handler.MethodHandler;


/**
 * Checks if passed event has not more than one connected handlers.
 * <p>
 * Otherwise throws {@link IllegalStateException}
 * 
 * 
 * @author mendlik
 * 
 */
public class UniqueEventDispatchStrategy implements EventDispatchStrategy {

	static public interface UniqueEventDescriptor {
		boolean isUnique(Object event);
	}

	private UniqueEventDescriptor eventDescriptor = new UniqueEventDescriptor() {

		@Override
		public boolean isUnique(Object event) {
			return true;
		}

	};

	private EventDispatchStrategy dispatchStrategy = new SimpleEventDispatchStrategy();

	public UniqueEventDispatchStrategy(UniqueEventDescriptor eventDescriptor,
			EventDispatchStrategy dispatchStrategy) {
		this.eventDescriptor = eventDescriptor;
		this.dispatchStrategy = dispatchStrategy;
	}

	public UniqueEventDispatchStrategy(UniqueEventDescriptor eventDescriptor) {
		this.eventDescriptor = eventDescriptor;
	}

	public UniqueEventDispatchStrategy(EventDispatchStrategy dispatchStrategy) {
		this.dispatchStrategy = dispatchStrategy;
	}

	public UniqueEventDispatchStrategy() {
	}

	@Override
	public void dispatchEvent(Object event, Set<MethodHandler> handlerMethods,
			EventBus eventBus) {
		if (handlerMethods.size() > 1 && eventDescriptor.isUnique(event)) {
			throw new IllegalStateException(
					"More than one handlers subscribed to unique event. \nEvent: "
							+ event + "\nHandlers: " + handlerMethods);
		}
		dispatchStrategy.dispatchEvent(event, handlerMethods, eventBus);
	}
}
