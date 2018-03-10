package type.iterator.sample;

public interface Template<T> {

	void save(T t);

	T getById();

	void delete(T t);

}
