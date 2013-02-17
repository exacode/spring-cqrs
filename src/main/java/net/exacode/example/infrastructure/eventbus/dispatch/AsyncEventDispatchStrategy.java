package net.exacode.example.infrastructure.eventbus.dispatch;

import java.util.Set;

import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.handler.MethodHandler;


/**
 * Enables asynchronous events dispatching. Decorates other
 * {@link EventDispatchStrategy}.
 * <p>
 * 
 * If exception (Throwable) occurs during event dispatching then
 * {@link AsyncInvocationExceptionEvent} is published in source eventBus.
 * 
 * @author mendlik
 * 
 */
public class AsyncEventDispatchStrategy implements EventDispatchStrategy {

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

	private AsyncEventDescriptor eventDescriptor = new AsyncEventDescriptor() {

		@Override
		public boolean isAsync(Object event) {
			return true;
		}

	};

	public AsyncEventDispatchStrategy(AsyncEventDescriptor eventDescriptor) {
		this.eventDescriptor = eventDescriptor;
	}

	public AsyncEventDispatchStrategy() {
	}

	@Override
	public void dispatchEvent(Object event, Set<MethodHandler> handlerMethods,
			EventBus eventBus) {
		if (eventDescriptor.isAsync(event)
				&& !(event instanceof AsyncInvocationExceptionEvent)) {
			asyncDispatch(event, handlerMethods, eventBus);
		} else {
			syncDispatch(event, handlerMethods);
		}
	}

	private void asyncDispatch(final Object event,
			Set<MethodHandler> handlerMethods, final EventBus eventBus) {
		for (final MethodHandler wrapper : handlerMethods) {
			Thread eventDispatchThread = new Thread() {
				@Override
				public void run() {
					try {
						wrapper.handleEvent(event);
					} catch (Throwable e) {
						eventBus.publish(new AsyncInvocationExceptionEvent(e,
								event));
					}
				}
			};
			eventDispatchThread.setPriority(Thread.MIN_PRIORITY);
			eventDispatchThread.start();
		}
	}

	private void syncDispatch(Object event, Set<MethodHandler> handlerMethods) {
		for (MethodHandler wrapper : handlerMethods) {
			wrapper.handleEvent(event);
		}
	}

}
