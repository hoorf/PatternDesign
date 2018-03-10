package type.iterator.basic;

public class IteratorMain {

	public static void main(String[] args) {
		BookSelf self = new BookSelf(4);
		self.addBook(new Book("book a"));
		self.addBook(new Book("book b"));
		self.addBook(new Book("book c"));
		self.addBook(new Book("book d"));
		self.addBook(new Book("book e"));

		Iterator iterator = self.iterator();
		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book);
		}

	}

}
