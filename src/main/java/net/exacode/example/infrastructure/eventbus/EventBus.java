package net.exacode.example.infrastructure.eventbus;

import java.util.Set;

import net.exacode.example.infrastructure.eventbus.builder.EventBusBuilder;
import net.exacode.example.infrastructure.eventbus.dispatch.DispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.SyncDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.handler.AnnotatedHandlerMethodFinder;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethod;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethodFinder;
import net.exacode.example.infrastructure.eventbus.handler.HandlerRegistry;

/**
 * Dispatches events to listeners, and provides ways for listeners to register
 * themselves.
 * 
 * 
 * <h2>Receiving Events</h2> To receive events, an object should:
 * <ol>
 * <li>Expose a public method, known as the <i>event handler method</i>, which
 * accepts a single argument of the type of event desired;</li>
 * <li>Mark it with a {@link EventHandler} annotation (Annotation can be changed
 * by changing {@link HandlerMethodFinder});</li>
 * <li>Pass itself to an EventBus instance's {@link #subscribe(Object)} method.</li>
 * </ol>
 * 
 * <h2>Posting Events</h2> To post an event, simply provide the event object to
 * the {@link #publish(Object)} method. The EventBus instance will determine the
 * type of event and route it to all registered listeners.
 * 
 * <p>
 * Events are routed based on their type &mdash; an event will be delivered to
 * any handler for any type to which the event is <em>assignable.</em> This
 * includes implemented interfaces, all superclasses, and all interfaces
 * implemented by superclasses.
 * 
 * <p>
 * 
 * <h2>Handler Methods</h2> Event handler methods must accept only one argument:
 * the event.
 * 
 * <h2>Dead Events</h2>
 * If an event is posted, but no registered handlers can accept it, it is
 * considered "dead." To give the system a second chance to handle dead events,
 * they are wrapped in an instance of {@link DeadEvent} and reposted.
 * 
 * <p>
 * If a handler for a supertype of all events (such as Object) is registered, no
 * event will ever be considered dead, and no DeadEvents will be generated.
 * Accordingly, while DeadEvent extends {@link Object}, a handler registered to
 * receive any Object will never receive a DeadEvent.
 * 
 * <p>
 * This class is safe for concurrent use.
 * <p>
 * 
 * This EventBus is based on event bus from guava
 * (http://code.google.com/p/guava-libraries/wiki/EventBusExplained), but
 * eventually modified in 99%.
 * 
 * <h2>Guava EventBus modifications</h2>
 * <ol>
 * <li>Does not depend on guava library.</li>
 * <li>Uses strategy pattern for event dispatching: {@link DispatchStrategy}</li>
 * <li>Uses strategy pattern for finding handler methods:
 * {@link DispatchStrategy}</li>
 * <li>Can be easily configured and build with {@link EventBusBuilder}</li>
 * </ol>
 * 
 * <h2>Default strategies</h2>
 * <ol>
 * <li>Uses {@link SyncDispatchStrategy}. Events are dispatched synchronously.
 * Exceptions are propagated as in normal method invocation.</li>
 * <li>For finding handler methods responsible is
 * {@link AnnotatedHandlerMethodFinder}. This finder looks for annotation
 * {@link EventHandler} or annotation that is annotated with it.</li>
 * </ol>
 * 
 * @author mendlik
 * 
 */
public class EventBus {

	private String id = "EventBus";

	private HandlerRegistry handlerRegistry = new HandlerRegistry(
			new AnnotatedHandlerMethodFinder<EventHandler>(EventHandler.class));

	private DispatchStrategy dispatchStrategy = new SyncDispatchStrategy();

	public EventBus() {
	}

	public EventBus(String logId, HandlerMethodFinder methodHandlerFinder,
			DispatchStrategy eventDispatchStrategy) {
		this.id = logId;
		this.handlerRegistry = new HandlerRegistry(methodHandlerFinder);
		this.dispatchStrategy = eventDispatchStrategy;
	}

	/**
	 * Posts an event to all registered handlers. This method will return
	 * successfully after the event has been posted to all handlers.
	 * 
	 * <p>
	 * Exception handling, asynchronous invocation and others parameters depend
	 * on {@link DispatchStrategy}. By default all handlers will be invoked
	 * synchronously and exception propagation will similar to simple method
	 * invocation.
	 * 
	 * <p>
	 * If no handlers have been subscribed for {@code event}'s class, and
	 * {@code event} is not already a {@link DeadEvent}, it will be wrapped in a
	 * DeadEvent and reposted.
	 * 
	 * @param event
	 *            event to post.
	 */
	public void publish(Object event) {
		Set<HandlerMethod> handlerMethods = handlerRegistry
				.findEventHandlerMethods(event.getClass());
		boolean dispatched = false;
		if (handlerMethods != null && !handlerMethods.isEmpty()) {
			dispatched = true;
			dispatchStrategy.dispatchEvent(event, handlerMethods, this);
		}

		if (!dispatched && !(event instanceof DeadEvent)) {
			publish(new DeadEvent(event));
		}
	}

	/**
	 * Registers all handler methods on {@code object} to receive events.
	 * Handler methods are selected and classified using this EventBus's
	 * {@link HandlerMethodFinder}; the default strategy is the
	 * {@link AnnotatedHandlerFinder} that looks for {@link EventHandler}.
	 * 
	 * @param object
	 *            object whose handler methods should be registered.
	 */
	public void subscribe(Object handler) {
		handlerRegistry.addHandler(handler);
	}

	/**
	 * Unregisters all handler methods on a registered {@code object}.
	 * 
	 * @param object
	 *            object whose handler methods should be unregistered.
	 * @throws IllegalArgumentException
	 *             if the object was not previously registered.
	 */
	public void unsubscribe(Object handler) {
		handlerRegistry.removeHandler(handler);
	}

	@Override
	public String toString() {
		return "EventBus [id=" + id + "]";
	}

}
