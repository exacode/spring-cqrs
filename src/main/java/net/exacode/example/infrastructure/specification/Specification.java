package net.exacode.example.infrastructure.specification;

/**
 * Specification - DDD building block.
 * @author pmendelski
 * @param <T> candidate type
 */
public interface Specification<T> {

	boolean isSatisfiedBy(T candidate);

	Specification<T> and(Specification<T> other);

	Specification<T> or(Specification<T> other);

	Specification<T> not();
}
