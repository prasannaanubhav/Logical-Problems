package VikasBook;

public class Book {

	private int book_id;
	private String book_name;
	private double book_price;
	private String book_write;

	public Book() {

	}

	public Book(int book_id, String book_name, double book_price, String book_write) {

		this.book_id = book_id;
		this.book_name = book_name;
		this.book_price = book_price;
		this.book_write = book_write;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public double getBook_price() {
		return book_price;
	}

	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}

	public String getBook_write() {
		return book_write;
	}

	public void setBook_write(String book_write) {
		this.book_write = book_write;
	}

}
