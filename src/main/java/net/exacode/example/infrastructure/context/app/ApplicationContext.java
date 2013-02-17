package net.exacode.example.infrastructure.context.app;

public interface ApplicationContext {
	void publish(Object event);

	void subscribe(Object handler);

	void unsubscribe(Object handler);
}
