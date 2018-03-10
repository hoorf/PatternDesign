package type.iterator.basic;

public class BookSelfIterator implements Iterator {

	private BookSelf self;

	private int index = 0;

	public BookSelfIterator(BookSelf self) {
		this.self = self;
		this.index = 0;
	}

	public Boolean hasNext() {
		if (index < self.getBookSelfSize()) {
			return true;
		} else {
			return false;
		}
	}

	public Object next() {
		return self.getBooksAt(index++);
	}

}
