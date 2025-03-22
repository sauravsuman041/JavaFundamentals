package day5_Activity;

//6.Create a class Supplier with name and other attributes. Populate an ArrayList with 5 Suppliers. 
//Print the contents of the retrieved supplier object on the screen. Use Scanner to get a suppliername 
//from the keyboard and retrieve the supplier data if it exists.

import java.util.ArrayList;
import java.util.Scanner;

class Supplier {
    private String name;
    private String product;

    public Supplier(String name, String product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Product: " + product;
    }
}

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Supplier> suppliers = new ArrayList<>();

        suppliers.add(new Supplier("Saurav", "Electronics"));
        suppliers.add(new Supplier("Aman", "Furniture"));
        suppliers.add(new Supplier("Rohit", "Clothing"));
        suppliers.add(new Supplier("Abhay", "Books"));
        suppliers.add(new Supplier("Vishal", "Toys"));

        System.out.println("List of Suppliers:");
        for (Supplier supplier : suppliers) {
            System.out.println(supplier);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Supplier Name to search: ");
        String namee = sc.nextLine();

        boolean found = false;
        for (Supplier s : suppliers) {
            if (s.getName().equalsIgnoreCase(namee)) {
            	System.out.println(s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Supplier not found.");
        }

        sc.close();

	}

}
