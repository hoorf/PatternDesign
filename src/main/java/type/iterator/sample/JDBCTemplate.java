package type.iterator.sample;

public class JDBCTemplate<T> implements Template<T> {

	public void save(T t) {
		System.out.println("jdbc save");
	}

	public T getById() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(T t) {
		// TODO Auto-generated method stub

	}

}
