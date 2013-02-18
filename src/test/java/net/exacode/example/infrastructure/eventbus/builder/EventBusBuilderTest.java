package net.exacode.example.infrastructure.eventbus.builder;

import static org.junit.Assert.assertNotNull;
import net.exacode.example.infrastructure.context.gate.Command;
import net.exacode.example.infrastructure.eventbus.EventBus;
import net.exacode.example.infrastructure.eventbus.EventHandler;
import net.exacode.example.infrastructure.eventbus.dispatch.AsyncDispatchStrategy;
import net.exacode.example.infrastructure.eventbus.dispatch.AsyncDispatchStrategy.AsyncEventDescriptor;
import net.exacode.example.infrastructure.eventbus.handler.AnnotatedHandlerMethodFinder;
import net.exacode.example.infrastructure.eventbus.handler.HandlerMethodFinder;
import net.exacode.example.suite.UnitTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * The class <code>EventBusBuilderTest</code> contains tests for the class
 * <code>{@link EventBusBuilder}</code>.
 * 
 * @author mendlik
 */
@Category(UnitTest.class)
public class EventBusBuilderTest {
	@Test
	public void shouldBuildEventBusWithDefaults() throws Exception {
		// given
		EventBusBuilder builder = new EventBusBuilder();

		// when
		EventBus eventBus = builder.buildEventBus();

		// then
		assertNotNull(eventBus);
	}

	@Test
	public void shouldBuildEventBusWithDefaultMethodHandlerFindingStrategy()
			throws Exception {
		// given
		EventBusBuilder builder = new EventBusBuilder().eventDispatchStrategy(
				new AsyncDispatchStrategy()).methodHandlerFindingStrategy(
				(HandlerMethodFinder) null);

		// when
		EventBus eventBus = builder.buildEventBus();

		// then
		assertNotNull(eventBus);
	}

	@Test
	public void shouldBuildEventBusWithDefaultDispatchStrategy()
			throws Exception {
		// given
		EventBusBuilder builder = new EventBusBuilder().eventDispatchStrategy(
				null).methodHandlerFindingStrategy(
				new AnnotatedHandlerMethodFinder<EventHandler>(
						EventHandler.class));
		// when
		EventDispatchStrategyBuilder eventBus = builder.eventDispatchStrategy();

		// then
		assertNotNull(eventBus);
	}

	@Test
	public void shouldBuildComplexEventBus() {
		// given
		EventBusBuilder builder = new EventBusBuilder().eventDispatchStrategy()
				.async(new AsyncEventDescriptor() {

					@Override
					public boolean isAsync(Object event) {
						return false;
					}

				}).unique().buildEventDispatchStrategy()
				.annotatedMethodHandlerFindingStrategy(Command.class);

		// when
		EventBus eventBus = builder.buildEventBus();

		// then
		assertNotNull(eventBus);
	}

}