package net.exacode.example.infrastructure.context.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.exacode.example.infrastructure.eventbus.EventHandler;

@EventHandler
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AppEvent {
	boolean unique() default true;

	boolean async() default false;
}
