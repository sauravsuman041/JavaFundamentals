package day3_Activity;

//7.Create a class with a static String field that is initialized at the point
//of definition, and another one that is initialized by the static block. Add a static method
//that prints both fields and demonstrates that they are both initialized before they are
//used.

public class Question7 {
	
	 	private static String field1 = "Something";

	    // Static field to be initialized in a static block
	    private static String field2;

	    // Static block to initialize field2
	    static {
	        field2 = "Something123";
	    }

	    // Static method to print the fields
	    public static void displayFields() {
	        System.out.println("Field1: " + field1);
	        System.out.println("Field2: " + field2);
	    }

	    public static void main(String[] args) {
	        // Call the static method to demonstrate initialization
	        Question7.displayFields();
	    }

}
