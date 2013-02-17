package net.exacode.example.infrastructure.specification;

/**
 * Specification - DDD building block.
 * @author pmendelski
 * @param <T> candidate type
 */
public class ConjunctionSpecification<T> extends CompositeSpecification<T> {

	private final Specification<T>[] conjunction;

	@SafeVarargs
	public ConjunctionSpecification(Specification<T>... conjunction) {
		this.conjunction = conjunction;
	}

	@Override
	public boolean isSatisfiedBy(T candidate) {
		for (Specification<T> spec : conjunction) {
			if (!spec.isSatisfiedBy(candidate)) {
				return false;
			}
		}
		return true;
	}
}
