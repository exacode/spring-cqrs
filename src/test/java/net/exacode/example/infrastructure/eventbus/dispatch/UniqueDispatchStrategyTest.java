package net.exacode.example.infrastructure.eventbus.dispatch;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

import junit.framework.Assert;
import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.EventBusTestUtil;
import net.exacode.example.infrastructure.eventbus.EventHandler;
import net.exacode.example.infrastructure.eventbus.builder.EventBusBuilder;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethod;
import net.exacode.example.infrastructure.eventbus.mock.AEvent;
import net.exacode.example.infrastructure.eventbus.mock.AEventHandler;
import net.exacode.example.infrastructure.eventbus.mock.ASubEvent;
import net.exacode.example.infrastructure.eventbus.mock.ASubEventHandler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * The class <code>UniqueDispatchStrategyTest</code> contains tests for the
 * class <code>{@link UniqueDispatchStrategy}</code>.
 * 
 * @author mendlik
 */
@RunWith(value = Parameterized.class)
public class UniqueDispatchStrategyTest {

	private final DispatchStrategy dispatchStrategy;

	public UniqueDispatchStrategyTest(DispatchStrategy dispatchStrategy) {
		this.dispatchStrategy = dispatchStrategy;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { new SyncDispatchStrategy() },
				{ new SuppressedDispatchStrategy(new SyncDispatchStrategy()) } };
		return Arrays.asList(data);
	}

	@Test(expected = IllegalStateException.class)
	public void shouldThrowException() throws Exception {
		// given
		UniqueDispatchStrategy strategy = new UniqueDispatchStrategy(
				dispatchStrategy);
		AEvent event = new AEvent();
		AEventHandler handler = new AEventHandler();
		AEventHandler handler2 = new AEventHandler();
		Set<HandlerMethod> handlerMethods = EventBusTestUtil.getHandlerMethods(
				EventHandler.class, handler, handler2);

		// then
		strategy.dispatchEvent(event, handlerMethods, null);
	}

	@Test
	public void shouldDispatchUniqueEvent() throws Exception {
		// given
		UniqueDispatchStrategy strategy = new UniqueDispatchStrategy(
				dispatchStrategy);
		AEvent event = new AEvent();
		AEventHandler handler = new AEventHandler();
		Set<HandlerMethod> handlerMethods = EventBusTestUtil.getHandlerMethods(
				EventHandler.class, handler);

		// when
		strategy.dispatchEvent(event, handlerMethods, null);

		// then
		Assert.assertEquals(1, handler.getReceivedEvents().size());
		Assert.assertEquals(event, handler.getReceivedEvents().get(0));
	}

	@Test
	public void shouldDispatchUniqueBaseEvent() throws Exception {
		// given
		UniqueDispatchStrategy strategy = new UniqueDispatchStrategy(
				dispatchStrategy);
		ASubEventHandler subhandler = new ASubEventHandler();
		AEvent event = new AEvent();
		AEventHandler handler = new AEventHandler();
		EventBus eventBus = new EventBusBuilder().eventDispatchStrategy(
				strategy).buildEventBus(handler, subhandler);

		// when
		eventBus.publish(event);

		// then
		Assert.assertEquals(1, handler.getReceivedEvents().size());
		Assert.assertEquals(event, handler.getReceivedEvents().get(0));
	}

	@Test(expected = IllegalStateException.class)
	public void shouldNotDispatchSubEvent() throws Exception {
		// given
		UniqueDispatchStrategy strategy = new UniqueDispatchStrategy(
				dispatchStrategy);
		ASubEvent subevent = new ASubEvent();
		ASubEventHandler subhandler = new ASubEventHandler();
		AEventHandler handler = new AEventHandler();
		EventBus eventBus = new EventBusBuilder().eventDispatchStrategy(
				strategy).buildEventBus(handler, subhandler);

		// then
		eventBus.publish(subevent);
	}
}