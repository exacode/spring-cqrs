package net.exacode.example.infrastructure.eventbus.dispatch;

import java.util.HashSet;
import java.util.Set;

import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethod;
import net.exacode.example.infrastructure.eventbus.handler.SuppressedHandlerMethod;

/**
 * Suppresses all exceptions (of type {@link Throwable}) thrown by
 * {@link HandlerMethod}.
 * 
 * @see SuppressedHandlerMethod
 * @author mendlik
 * 
 */
public class SuppressedDispatchStrategy implements DispatchStrategy {

	static public interface SuppressedEventDescriptor {
		boolean isSupressed(Object event);
	}

	public static final SuppressedEventDescriptor DEFAULT_EVENT_DESCRIPTOR = new SuppressedEventDescriptor() {

		@Override
		public boolean isSupressed(Object event) {
			return true;
		}

	};

	private SuppressedEventDescriptor eventDescriptor = DEFAULT_EVENT_DESCRIPTOR;

	private DispatchStrategy dispatchStrategy = new SyncDispatchStrategy();

	public SuppressedDispatchStrategy(
			SuppressedEventDescriptor eventDescriptor,
			DispatchStrategy dispatchStrategy) {
		this.eventDescriptor = eventDescriptor;
		this.dispatchStrategy = dispatchStrategy;
	}

	public SuppressedDispatchStrategy(SuppressedEventDescriptor eventDescriptor) {
		this.eventDescriptor = eventDescriptor;
	}

	public SuppressedDispatchStrategy(DispatchStrategy dispatchStrategy) {
		this.dispatchStrategy = dispatchStrategy;
	}

	public SuppressedDispatchStrategy() {
	}

	@Override
	public void dispatchEvent(Object event, Set<HandlerMethod> handlerMethods,
			EventBus eventBus) {
		if (eventDescriptor.isSupressed(event)) {
			Set<HandlerMethod> suppressedHadnlerMethods = new HashSet<HandlerMethod>();
			for (HandlerMethod methodHandler : handlerMethods) {
				suppressedHadnlerMethods.add(new SuppressedHandlerMethod(
						methodHandler, eventBus));
			}
			handlerMethods = suppressedHadnlerMethods;
		}
		dispatchStrategy.dispatchEvent(event, handlerMethods, eventBus);
	}
}
