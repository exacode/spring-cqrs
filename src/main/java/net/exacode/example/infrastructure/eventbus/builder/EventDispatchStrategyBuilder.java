package net.exacode.example.infrastructure.eventbus.builder;

import net.exacode.example.infrastructure.eventbus.dispatch.AsyncDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.AsyncDispatchStrategy.AsyncEventDescriptor;
import net.exacode.example.infrastructure.eventbus.dispatch.DispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.SyncDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.SuppressedDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.SuppressedDispatchStrategy.SuppressedEventDescriptor;
import net.exacode.example.infrastructure.eventbus.dispatch.UniqueDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.UniqueDispatchStrategy.UniqueEventDescriptor;

public class EventDispatchStrategyBuilder {
	private AsyncEventDescriptor asyncEventDescriptor;
	private UniqueEventDescriptor uniqueEventDescriptor;
	private SuppressedEventDescriptor supressedEventDescriptor;

	private final EventBusBuilder eventBusBuilder;

	EventDispatchStrategyBuilder(EventBusBuilder eventBusBuilder) {
		this.eventBusBuilder = eventBusBuilder;
	}

	public EventDispatchStrategyBuilder async() {
		asyncEventDescriptor = AsyncDispatchStrategy.DEFAULT_EVENT_DESCRIPTOR;
		return this;
	}

	public EventDispatchStrategyBuilder async(
			AsyncEventDescriptor eventDescriptor) {
		asyncEventDescriptor = eventDescriptor;
		return this;
	}

	public EventDispatchStrategyBuilder unique() {
		uniqueEventDescriptor = UniqueDispatchStrategy.DEFAULT_EVENT_DESCRIPTOR;
		return this;
	}

	public EventDispatchStrategyBuilder unique(
			UniqueEventDescriptor eventDescriptor) {
		uniqueEventDescriptor = eventDescriptor;
		return this;
	}

	public EventDispatchStrategyBuilder suppressExceptions() {
		supressedEventDescriptor = SuppressedDispatchStrategy.DEFAULT_EVENT_DESCRIPTOR;
		return this;
	}

	public EventDispatchStrategyBuilder suppressExceptions(
			SuppressedEventDescriptor eventDescriptor) {
		supressedEventDescriptor = eventDescriptor;
		return this;
	}

	public EventBusBuilder buildEventDispatchStrategy() {
		DispatchStrategy dispatchStrategy;
		if (asyncEventDescriptor != null) {
			dispatchStrategy = new AsyncDispatchStrategy(
					asyncEventDescriptor);
		} else {
			dispatchStrategy = new SyncDispatchStrategy();
		}
		if (uniqueEventDescriptor != null) {
			dispatchStrategy = new UniqueDispatchStrategy(
					uniqueEventDescriptor, dispatchStrategy);
		}
		if (supressedEventDescriptor != null) {
			dispatchStrategy = new SuppressedDispatchStrategy(
					supressedEventDescriptor, dispatchStrategy);
		}
		eventBusBuilder.eventDispatchStrategy(dispatchStrategy);
		return eventBusBuilder;
	}
}
