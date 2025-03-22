package day6_Activity;

//2.Write a program to implement a telephone directory. Display the details.(Use Map Interface)

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number of contacts you want to add: ");
	        int count = sc.nextInt();
	        
	        Map<String, String> directory = new HashMap<>();
	        
	        sc.nextLine();

	        for (int i = 0; i < count; i++) {
	            System.out.println("Enter name: ");
	            String name = sc.nextLine();
	            System.out.println("Enter phone number: ");
	            String phoneNumber = sc.nextLine();

	            directory.put(name, phoneNumber);
	        }

	        System.out.println("\nTelephone Directory:");
	        for (Map.Entry<String, String> entry : directory.entrySet()) {
	            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
	        }

	}

}
