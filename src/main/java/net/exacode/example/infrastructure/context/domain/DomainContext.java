package net.exacode.example.infrastructure.context.domain;

public interface DomainContext {
	void publish(Object event);

	void subscribe(Object handler);

	void unsubscribe(Object handler);
}
