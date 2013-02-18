package net.exacode.example.infrastructure.eventbus;

import junit.framework.Assert;
import net.exacode.example.infrastructure.eventbus.mock.AEvent;
import net.exacode.example.infrastructure.eventbus.mock.AEventHandler;
import net.exacode.example.infrastructure.eventbus.mock.BEvent;
import net.exacode.example.infrastructure.eventbus.mock.DeadEventHandler;
import net.exacode.example.suite.UnitTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(UnitTest.class)
public class DeadEventTest {

	@Test
	public void shouldDeliverDeadBEvent() {
		// given
		EventBus eventBus = new EventBus();
		AEventHandler handler = new AEventHandler();
		DeadEventHandler deadEventHandler = new DeadEventHandler();
		AEvent eventA = new AEvent("simple event a");
		BEvent eventB = new BEvent("simple event b");
		eventBus.subscribe(deadEventHandler);
		eventBus.subscribe(handler);

		// when
		eventBus.publish(eventA);
		eventBus.publish(eventB);

		// then
		Assert.assertEquals(1, handler.getReceivedEvents().size());
		Assert.assertEquals(eventA, handler.getReceivedEvents().get(0));
		Assert.assertEquals(1, deadEventHandler.getReceivedEvents().size());
		Assert.assertEquals(eventB, deadEventHandler.getReceivedEvents().get(0)
				.getEvent());
	}

	@Test
	public void shouldPublishDeadEvent() {
		// given
		EventBus eventBus = new EventBus();
		DeadEventHandler handler = new DeadEventHandler();
		AEvent event = new AEvent("simple event");
		eventBus.subscribe(handler);

		// when
		eventBus.publish(event);

		// then
		Assert.assertEquals(1, handler.getReceivedEvents().size());
		Assert.assertEquals(event, handler.getReceivedEvents().get(0)
				.getEvent());
	}
}
