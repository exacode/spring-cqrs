package net.exacode.example.infrastructure;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjector {

	@Autowired
	protected AutowireCapableBeanFactory injector;

	public void inject(Object entity) {
		injector.autowireBean(entity);
	}

	public <C extends Collection<?>> void inject(C entities) {
		for (Object entity : entities) {
			inject(entity);
		}
	}

}
