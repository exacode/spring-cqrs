package net.exacode.example.infrastructure.specification;

/**
 * Specification - DDD building block.
 * @author pmendelski
 * @param <T> candidate type
 */
public class OrSpecification<T> extends CompositeSpecification<T> {

	private final Specification<T> a;

	private final Specification<T> b;

	public OrSpecification(Specification<T> a, Specification<T> b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public boolean isSatisfiedBy(T candidate) {
		return a.isSatisfiedBy(candidate) || b.isSatisfiedBy(candidate);
	}
}
