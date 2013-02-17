package net.exacode.example.infrastructure.eventbus;

/**
 * Wraps an event that was posted, but which had no subscribers and thus could
 * not be delivered.
 * <p>
 * Subscribing a DeadEvent handler is useful for debugging or logging, as it can
 * detect misconfigurations in a system's event distribution.
 */
public class DeadEvent {

	private final Object event;

	/**
	 * Creates a new DeadEvent.
	 * 
	 * @param event
	 *            the event that could not be delivered.
	 */
	public DeadEvent(Object event) {
		this.event = event;
	}

	/**
	 * Returns the wrapped, 'dead' event, which the system was unable to deliver
	 * to any registered handler.
	 * 
	 * @return the 'dead' event that could not be delivered.
	 */
	public Object getEvent() {
		return event;
	}

}