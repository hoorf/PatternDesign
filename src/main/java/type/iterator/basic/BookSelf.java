package type.iterator.basic;

public class BookSelf implements Aggregate {

	private Book[] books;
	private int length = 0;

	public BookSelf(int maxsize) {
		books = new Book[maxsize];
		length = 0;
	}

	public void addBook(Book book) {
		if (length < books.length) {
			books[length] = book;
			length++;
		}

	}

	public int getBookSelfSize() {
		return length;
	}

	public Book getBooksAt(int index) {
		return books[index];
	}
    /**
     * »ñÈ¡µü´úÆ÷
     */
	public Iterator iterator() {
		return new BookSelfIterator(this);
	}

}
