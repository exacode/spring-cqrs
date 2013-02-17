package net.exacode.example.infrastructure.specification;

/**
 * Specification - DDD building block.
 * @author pmendelski
 * @param <T> candidate type
 */
public class DisjunctionSpecification<T> extends CompositeSpecification<T> {

	private final Specification<T>[] disjunction;

	@SafeVarargs
	public DisjunctionSpecification(Specification<T>... disjunction) {
		this.disjunction = disjunction;
	}

	@Override
	public boolean isSatisfiedBy(T candidate) {
		for (Specification<T> spec : disjunction) {
			if (spec.isSatisfiedBy(candidate)) {
				return true;
			}
		}

		return false;
	}
}
