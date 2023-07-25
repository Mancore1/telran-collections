package telran.util;

public interface Set<T> extends Collection<T> {
	T get(Object pattern);

	@SuppressWarnings("unchecked")
	default boolean setEqualsTo(Object other) {
		// TODO Checks other is Set containing the same elements (no checks of order)
		try {
			return this.equalsTo((Set<T>) other);
		} catch (ClassCastException e) {
			return false;
		}
	}
}
