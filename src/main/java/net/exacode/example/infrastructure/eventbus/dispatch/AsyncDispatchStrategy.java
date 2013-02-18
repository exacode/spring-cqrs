package net.exacode.example.infrastructure.eventbus.dispatch;

import java.util.Set;

import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethod;
import net.exacode.example.infrastructure.eventbus.handler.SuppressedHandlerMethod;

/**
 * Enables asynchronous events dispatching. Decorates other
 * {@link DispatchStrategy}.
 * <p>
 * 
 * If exception (Throwable) occurs during event dispatching then
 * {@link AsyncInvocationExceptionEvent} is published in source eventBus.
 * 
 * @author mendlik
 * 
 */
public class AsyncDispatchStrategy implements DispatchStrategy {

	static public interface AsyncEventDescriptor {
		boolean isAsync(Object event);
	}

	@SuppressWarnings("serial")
	static public class AsyncInvocationExceptionEvent extends RuntimeException {

		private final Throwable cause;

		private Object event;

		public AsyncInvocationExceptionEvent(Throwable cause, Object event) {
			this.cause = cause;
			this.event = event;
		}

		@Override
		public Throwable getCause() {
			return cause;
		}

		protected Object getEvent() {
			return event;
		}

		protected void setEvent(Object event) {
			this.event = event;
		}

	}

	public static final AsyncEventDescriptor DEFAULT_EVENT_DESCRIPTOR = new AsyncEventDescriptor() {

		@Override
		public boolean isAsync(Object event) {
			return true;
		}

	};

	public AsyncEventDescriptor eventDescriptor = DEFAULT_EVENT_DESCRIPTOR;

	public AsyncDispatchStrategy(AsyncEventDescriptor eventDescriptor) {
		this.eventDescriptor = eventDescriptor;
	}

	public AsyncDispatchStrategy() {
	}

	@Override
	public void dispatchEvent(Object event, Set<HandlerMethod> handlerMethods,
			EventBus eventBus) {
		if (eventDescriptor.isAsync(event)
				&& !(event instanceof AsyncInvocationExceptionEvent)) {
			asyncDispatch(event, handlerMethods, eventBus);
		} else {
			syncDispatch(event, handlerMethods);
		}
	}

	private void asyncDispatch(final Object event,
			Set<HandlerMethod> handlerMethods, final EventBus eventBus) {
		for (final HandlerMethod methodHandler : handlerMethods) {
			Thread eventDispatchThread = new Thread() {
				@Override
				public void run() {
					new SuppressedHandlerMethod(methodHandler, eventBus)
							.handleEvent(event);
				}
			};
			eventDispatchThread.setPriority(Thread.MIN_PRIORITY);
			eventDispatchThread.start();
		}
	}

	private void syncDispatch(Object event, Set<HandlerMethod> handlerMethods) {
		for (HandlerMethod wrapper : handlerMethods) {
			wrapper.handleEvent(event);
		}
	}

}
