package day6_Activity;

//6.Create a class called BookStore with fields Bookid and Bookname.  Sort using comparator and 
//display the output by sorting based on book name and book id.


import java.util.*;

class BookStore {
    int bookId;
    String bookName;

    public BookStore(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
    
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName;
    }
}


public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<BookStore> books = new ArrayList<>();
        books.add(new BookStore(101, "Java Programming"));
        books.add(new BookStore(102, "Data Structures"));
        books.add(new BookStore(100, "Algorithms"));
        books.add(new BookStore(105, "Database Management"));

        Collections.sort(books,(b1, b2) -> b1.bookName.compareTo(b2.bookName));
        System.out.println("Books sorted by Name:");
        for (BookStore book : books) {
            System.out.println(book);
        }

        Collections.sort(books,(b1, b2) -> (b1.bookId < b2.bookId) ? -1 : (b1.bookId > b2.bookId) ? 1 : 0);
        System.out.println("\nBooks sorted by ID:");
        for (BookStore book : books) {
            System.out.println(book);
        }

	}

}
