package day4_Activity;

//1.Instance block:
//
//Create a class Library with a static variable bookCount (int) and an instance variable bookTitle.
//Use a static initialization block to initialize bookCount to a fixed value (e.g., 100).
//Use an instance block to set the bookTitle to a default value.
//Create a constructor that allows setting the bookTitle to a user-defined value.
//In the main method, print the bookCount and the bookTitle of each Library object.


class Library {
 
    static int bookCount;
    String bookTitle;

    static {
        bookCount = 100;
    }

    {
        bookTitle = "Death Note";
    }
    
    public Library() {
    	
    }

    public Library(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    
}


public class Question1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book1 = new Library("Half Girlfriend");
        Library book2 = new Library("Atomic Habit");
        Library book3 = new Library();

        System.out.println("No of books in the library: " + Library.bookCount);
        System.out.println("Book 1: " + book1.bookTitle);
        System.out.println("Book 2: " + book2.bookTitle);
        System.out.println("Book 3(default): " + book3.bookTitle);

	}

}
