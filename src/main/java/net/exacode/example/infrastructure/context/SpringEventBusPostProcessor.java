package net.exacode.example.infrastructure.context;

import net.exacode.example.infrastructure.eventbus.EventBus;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * EventBusPostProcessor registers Spring beans with EventBus.
 * 
 * @author pmendelski
 */
public class SpringEventBusPostProcessor implements BeanPostProcessor {

	private final EventBus eventBus;

	public SpringEventBusPostProcessor(EventBus eventBus) {
		this.eventBus = eventBus;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		eventBus.subscribe(bean);
		return bean;
	}

}