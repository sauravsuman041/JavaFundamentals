package day6_Activity;


//7.
//Map:::
//
//Hendry is a librarian, he has ordered and received the following books from Logic 
//Infosec Company,
//➔ 2 java books
//➔ 1 servlet book 
//➔ 2 JSF books
//Display the books issued by the vendor.
//2) If customer need a JSF book, help Hendry to check and respond, by listing the different 
//types of books available in library.
//If JSF book is found issue the book to the customer by printing the message "Book 
//issued".
// 3) Hendry is placing an order for new set of books, he got the book with book name and price 
//{Hibernate-500, Spring-300, Struts-600, AngularJS-800}
//->Find the total he must pay to the vendor
//->Display all the book which cost above Rs.500 {book name & price}


import java.util.HashMap;
import java.util.Map;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, Integer> library = new HashMap<>();

        library.put("Java", 2);
        library.put("Servlet", 1);
        library.put("JSF", 2);

        System.out.println("Books issued by the vendor:");
        for (Map.Entry<String, Integer> entry : library.entrySet()) {
            System.out.println("Book: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

        String book = "JSF";
        if (library.containsKey(book) && library.get(book) > 0) {
            library.put(book, library.get(book) - 1);
            System.out.println("Book issued: " + book);
        } else {
            System.out.println("Sorry, " + book + " is not available.");
        }

        Map<String, Integer> newBooks = new HashMap<>();
        newBooks.put("Hibernate", 500);
        newBooks.put("Spring", 300);
        newBooks.put("Struts", 600);
        newBooks.put("AngularJS", 800);

        int total = 0;
        for (int price : newBooks.values()) {
            total += price;
        }
        
        System.out.println("\nTotal amount Hendry must pay: Rs." + total);
        

        System.out.println("\nBooks with price above Rs.500:");
        for (Map.Entry<String, Integer> entry : newBooks.entrySet()) {
            if (entry.getValue() > 500) {
                System.out.println("Book: " + entry.getKey() + ", Price: Rs." + entry.getValue());
            }
        }
		
		

	}

}
