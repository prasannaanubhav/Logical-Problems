package VikasBook;

public class BookBO {

	Book[] book;

	public BookBO() {

	}

	public BookBO(Book[] book) {
		this.book = book;
	}

	public Book[] getBook() {
		return book;
	}

	public void setBook(Book[] book) {
		this.book = book;
	}

	public boolean searchBook(int bookid) {
		
		for(int i=0;i<book.length;i++) {
			if(book[i].getBook_id()==bookid) {
				System.out.print(book[i].getBook_id());
				System.out.print(" ");
				System.out.print(book[i].getBook_name());
				System.out.print(" ");
				System.out.print(book[i].getBook_price());
				System.out.print(" ");
				System.out.print(book[i].getBook_write());
				System.out.println();
			}else
					System.out.println("Book Not Found");
				break;
		}
		return true;
		
	}
	
}
