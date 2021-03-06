package net.exacode.example.infrastructure.eventbus.handler;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A {@link HandlerMethodFinder} for collecting all event handler
 * methods that are marked with an appropriate annotation.
 * 
 * @author Paweł Mendelski
 */
public class AnnotatedHandlerMethodFinder<A extends Annotation> implements
		HandlerMethodFinder {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final Class<A> annotationType;

	public AnnotatedHandlerMethodFinder(Class<A> annotationType) {
		this.annotationType = annotationType;
	}

	@Override
	public Map<Class<?>, Set<HandlerMethod>> findHandlerMethods(Object listener) {
		Map<Class<?>, Set<HandlerMethod>> methodsInListener = new HashMap<Class<?>, Set<HandlerMethod>>();
		Class<?> clazz = listener.getClass();

		for (Method method : clazz.getMethods()) {
			A eventHandlerAnnotation = findMethodAnnotation(method,
					annotationType);
			if (eventHandlerAnnotation != null) {
				Class<?>[] parameterTypes = method.getParameterTypes();
				if (parameterTypes.length != 1) {
					throw new IllegalArgumentException(
							"Method "
									+ method
									+ " has @EventHandler annotation, but requires "
									+ parameterTypes.length
									+ " arguments.  Event handler methods must require a single argument.");
				}
				Class<?> eventType = parameterTypes[0];
				HandlerMethod handler = new SimpleHandlerMethod(listener,
						method);

				Set<HandlerMethod> handlers = methodsInListener.get(eventType);
				if (handlers == null) {
					handlers = new HashSet<HandlerMethod>();
					methodsInListener.put(eventType, handlers);
				}
				handlers.add(handler);
				logger.trace(
						"Connected handler with event.\nHandler: {}\nEvent: {}",
						handler, eventType);
			}
		}
		return methodsInListener;
	}

	private A findMethodAnnotation(Method method, Class<A> annotationType) {
		return recursivelyFindAnnotation(new ArrayList<Annotation>(),
				method.getDeclaredAnnotations(), annotationType);
	}

	@SuppressWarnings("unchecked")
	private A recursivelyFindAnnotation(List<Annotation> checkedAnnotations,
			Annotation[] annotations, Class<A> annotationTargetType) {
		for (Annotation annotation : annotations) {
			if (!checkedAnnotations.contains(annotation)) {
				if (annotationTargetType.isInstance(annotation)) {
					return (A) annotation;
				}
				checkedAnnotations.add(annotation);
				return recursivelyFindAnnotation(checkedAnnotations, annotation
						.annotationType().getDeclaredAnnotations(),
						annotationTargetType);
			}
		}
		return null;
	}
}
