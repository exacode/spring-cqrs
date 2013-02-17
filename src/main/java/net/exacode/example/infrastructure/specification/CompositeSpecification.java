package net.exacode.example.infrastructure.specification;

/**
 * Specification - DDD building block.
 * @author pmendelski
 * @param <T> candidate type
 */
public abstract class CompositeSpecification<T> implements Specification<T> {

	@Override
	public Specification<T> and(Specification<T> other) {
		return new AndSpecification<T>(this, other);
	}

	@Override
	public Specification<T> or(Specification<T> other) {
		return new OrSpecification<T>(this, other);
	}

	@Override
	public Specification<T> not() {
		return new NotSpecification<T>(this);
	}
}
