package net.exacode.example.infrastructure.eventbus;

import junit.framework.Assert;
import net.exacode.example.suite.UnitTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(UnitTest.class)
public class EventBusTest {

	@Test
	public void shouldDeliverEvent() {
		// given
		EventBus eventBus = new EventBus();
		AEventHandler handler = new AEventHandler();
		AEvent event = new AEvent("simple event");
		eventBus.subscribe(handler);

		// when
		eventBus.publish(event);

		// then
		Assert.assertEquals(1, handler.getReceivedEvents().size());
		Assert.assertEquals(event, handler.getReceivedEvents().get(0));
	}

	@Test
	public void shouldDeliverTwoEventsToOneHandler() {
		// given
		EventBus eventBus = new EventBus();
		ABEventHandler handler = new ABEventHandler();
		AEvent eventA = new AEvent("simple event a");
		BEvent eventB = new BEvent("simple event b");
		eventBus.subscribe(handler);

		// when
		eventBus.publish(eventA);
		eventBus.publish(eventB);

		// then
		Assert.assertEquals(1, handler.getReceivedAEvents().size());
		Assert.assertEquals(eventA, handler.getReceivedAEvents().get(0));

		Assert.assertEquals(1, handler.getReceivedBEvents().size());
		Assert.assertEquals(eventB, handler.getReceivedBEvents().get(0));
	}

	@Test
	public void shouldDeliverTwoEvents() {
		// given
		EventBus eventBus = new EventBus();
		AEventHandler handlerA = new AEventHandler();
		BEventHandler handlerB = new BEventHandler();
		AEvent eventA = new AEvent("simple event a");
		BEvent eventB = new BEvent("simple event b");
		eventBus.subscribe(handlerA);
		eventBus.subscribe(handlerB);

		// when
		eventBus.publish(eventA);
		eventBus.publish(eventB);

		// then
		Assert.assertEquals(1, handlerA.getReceivedEvents().size());
		Assert.assertEquals(eventA, handlerA.getReceivedEvents().get(0));
		Assert.assertEquals(1, handlerB.getReceivedEvents().size());
		Assert.assertEquals(eventB, handlerB.getReceivedEvents().get(0));
	}

	@Test
	public void shouldDeliverSubEventA() {
		// given
		EventBus eventBus = new EventBus();
		AEventHandler handler = new AEventHandler();
		ASubEventHandler subhandler = new ASubEventHandler();
		ASubEvent subEventA = new ASubEvent("simple sub event a");
		eventBus.subscribe(handler);
		eventBus.subscribe(subhandler);

		// when
		eventBus.publish(subEventA);

		// then
		Assert.assertEquals(1, handler.getReceivedEvents().size());
		Assert.assertEquals(subEventA, subhandler.getReceivedEvents().get(0));
		Assert.assertEquals(1, subhandler.getReceivedEvents().size());
		Assert.assertEquals(subEventA, subhandler.getReceivedEvents().get(0));
	}

	@Test
	public void shouldDeliverEventAToSubHandler() {
		// given
		EventBus eventBus = new EventBus();
		AEventHandler handler = new AEventHandler();
		ASubEventHandler subhandler = new ASubEventHandler();
		AEvent eventA = new AEvent("simple sub event a");
		eventBus.subscribe(handler);
		eventBus.subscribe(subhandler);

		// when
		eventBus.publish(eventA);

		// then
		Assert.assertEquals(1, handler.getReceivedEvents().size());
		Assert.assertEquals(eventA, handler.getReceivedEvents().get(0));
		Assert.assertEquals(0, subhandler.getReceivedEvents().size());
	}

}
