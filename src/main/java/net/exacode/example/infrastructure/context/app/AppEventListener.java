package net.exacode.example.infrastructure.context.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.exacode.example.infrastructure.eventbus.handler.EventHandler;

@EventHandler
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AppEventListener {

}
