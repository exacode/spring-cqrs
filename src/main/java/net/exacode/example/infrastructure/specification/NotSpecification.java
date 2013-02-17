package net.exacode.example.infrastructure.specification;

/**
 * Specification - DDD building block.
 * @author pmendelski
 * @param <T> candidate type
 */
public class NotSpecification<T> extends CompositeSpecification<T> {

	private final Specification<T> wrapped;

	public NotSpecification(Specification<T> wrapped) {
		this.wrapped = wrapped;
	}

	@Override
	public boolean isSatisfiedBy(T candidate) {
		return !wrapped.isSatisfiedBy(candidate);
	}
}
