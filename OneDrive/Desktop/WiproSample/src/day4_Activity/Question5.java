package day4_Activity;

import java.util.Scanner;
//5.Write a program to demonstrate the InputMismatchException and StringIndexOutOfBoundsException.

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();
            
        } 
		catch (java.util.InputMismatchException e) {
			
            System.out.println("Please enter a valid integer.");
        }

		
        try {
        	
            String sample = "Hello";
            char ch = sample.charAt(10); 
            
        } 
        catch (StringIndexOutOfBoundsException e) {
        	
            System.out.println("Invalid index access in string.");
        }

	}

}
