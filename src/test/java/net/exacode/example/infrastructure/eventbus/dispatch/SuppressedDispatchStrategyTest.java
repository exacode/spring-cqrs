package net.exacode.example.infrastructure.eventbus.dispatch;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;
import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.builder.EventBusBuilder;
import net.exacode.example.infrastructure.eventbus.dispatch.SuppressedDispatchStrategy.SuppressedEventDescriptor;
import net.exacode.example.infrastructure.eventbus.mock.AEvent;
import net.exacode.example.infrastructure.eventbus.mock.AEventHandler;
import net.exacode.example.infrastructure.eventbus.mock.AEventHandlerThatThrows;
import net.exacode.example.infrastructure.eventbus.mock.InvocationExceptionEventHandler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * The class <code>SuppressedDispatchStrategyTest</code> contains tests for the
 * class <code>{@link SuppressedDispatchStrategy}</code>.
 * 
 * @author mendlik
 */
@RunWith(value = Parameterized.class)
public class SuppressedDispatchStrategyTest {

	private final DispatchStrategy dispatchStrategy;

	public SuppressedDispatchStrategyTest(DispatchStrategy dispatchStrategy) {
		this.dispatchStrategy = dispatchStrategy;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { new SyncDispatchStrategy() } };
		return Arrays.asList(data);
	}

	@Test(expected = RuntimeException.class)
	public void shouldThrowException() throws Exception {
		// given
		SuppressedDispatchStrategy strategy = new SuppressedDispatchStrategy(
				new SuppressedEventDescriptor() {

					@Override
					public boolean isSupressed(Object event) {
						return false;
					}
				}, dispatchStrategy);
		AEvent event = new AEvent();
		AEventHandlerThatThrows handler = new AEventHandlerThatThrows();
		InvocationExceptionEventHandler invocationExceptionHandler = new InvocationExceptionEventHandler();
		EventBus eventBus = new EventBusBuilder().eventDispatchStrategy(
				strategy).buildEventBus(handler, invocationExceptionHandler);

		// then
		eventBus.publish(event);
	}

	@Test
	public void shouldEmitExceptionEvent() throws Exception {
		// given
		SuppressedDispatchStrategy strategy = new SuppressedDispatchStrategy(
				dispatchStrategy);
		AEvent event = new AEvent();
		AEventHandlerThatThrows handler = new AEventHandlerThatThrows();
		InvocationExceptionEventHandler invocationExceptionHandler = new InvocationExceptionEventHandler();
		EventBus eventBus = new EventBusBuilder().eventDispatchStrategy(
				strategy).buildEventBus(handler, invocationExceptionHandler);

		// when
		eventBus.publish(event);

		// then
		Assert.assertEquals(1, invocationExceptionHandler.getReceivedEvents()
				.size());
		Assert.assertEquals(event, invocationExceptionHandler
				.getReceivedEvents().get(0).getEvent());
		Assert.assertEquals(handler, invocationExceptionHandler
				.getReceivedEvents().get(0).getHandler());
	}

	@Test
	public void shouldDispatchEvent() throws Exception {
		// given
		UniqueDispatchStrategy strategy = new UniqueDispatchStrategy(
				dispatchStrategy);
		AEvent event = new AEvent();
		AEventHandler handler = new AEventHandler();
		InvocationExceptionEventHandler invocationExceptionHandler = new InvocationExceptionEventHandler();
		EventBus eventBus = new EventBusBuilder().eventDispatchStrategy(
				strategy).buildEventBus(handler, invocationExceptionHandler);

		// when
		eventBus.publish(event);

		// then
		Assert.assertEquals(1, handler.getReceivedEvents().size());
		Assert.assertEquals(event, handler.getReceivedEvents().get(0));
		Assert.assertEquals(0, invocationExceptionHandler.getReceivedEvents()
				.size());

	}

}