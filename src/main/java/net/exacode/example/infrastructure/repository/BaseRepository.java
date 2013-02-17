package net.exacode.example.infrastructure.repository;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.exacode.example.infrastructure.DependencyInjector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mysema.query.jpa.impl.JPAQuery;

@Transactional
public abstract class BaseRepository<E, K> {

	@PersistenceContext
	protected EntityManager entityManager;

	@Autowired
	protected DependencyInjector injector;

	protected final Class<E> clazz;

	@SuppressWarnings("unchecked")
	public BaseRepository() {
		Class<?> cl = getClass();
		while (!BaseRepository.class.getSimpleName().equals(
				cl.getSuperclass().getSimpleName())) {
			if (cl.getGenericSuperclass() instanceof ParameterizedType) {
				break;
			}
			cl = cl.getSuperclass();
		}
		if (cl.getGenericSuperclass() instanceof ParameterizedType) {
			clazz = (Class<E>) ((ParameterizedType) cl.getGenericSuperclass())
					.getActualTypeArguments()[0];
		} else {
			throw new IllegalArgumentException(
					"Could not instantiate base repository.");
		}
	}

	protected JPAQuery getQuery() {
		return new JPAQuery(entityManager);
	}

	@Transactional(readOnly = true)
	public E findById(K id) {
		E entity = entityManager.find(clazz, id);
		injector.inject(entity);
		return entity;
	}

	public void remove(K id) {
		entityManager.remove(findById(id));
	}

	public E persist(E entity) {
		entityManager.persist(entity);
		return entity;
	}

	public E merge(E entity) {
		return entityManager.merge(entity);
	}
}
