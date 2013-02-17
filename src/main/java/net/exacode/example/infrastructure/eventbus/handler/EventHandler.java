package net.exacode.example.infrastructure.eventbus.handler;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.exacode.example.infrastructure.eventbus.EventBus;

/**
 * Simple event method handler annotation used by default be {@link EventBus}.
 * 
 * @author mendlik
 * 
 */
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface EventHandler {

}
