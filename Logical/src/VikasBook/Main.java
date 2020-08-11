package VikasBook;

public class Main {

	public static void main(String[] args) {
		
		Book book[] = new Book[5];
	
		Book b1 = new Book(101, "altered", 156, "Kuwaiti");
		Book b2 = new Book(102, "bltered", 160, "Luwaiti");
		Book b3 = new Book(103, "cltered", 147, "Muwaiti");
		Book b4 = new Book(104, "dltered", 194, "Nuwaiti");
		Book b5 = new Book(105, "eltered", 130, "Ouwaiti");
		
		book[0]=b1;
		book[1]=b2;
		book[2]=b3;
		book[3]=b4;
		book[4]=b5;
		
		
		BookBO bookbo = new BookBO();
		bookbo.setBook(book);
		Book book2[] = bookbo.getBook();
//		for(int i=0;i<book2.length;i++) {
//			System.out.print(book2[i].getBook_id());
//			System.out.print(" ");
//			System.out.print(book2[i].getBook_name());
//			System.out.print(" ");
//			System.out.print(book2[i].getBook_price());
//			System.out.print(" ");
//			System.out.print(book2[i].getBook_write());
//			System.out.println();
//		}
		bookbo.searchBook(106);
		
	}

}
