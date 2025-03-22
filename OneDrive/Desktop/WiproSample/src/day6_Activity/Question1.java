package day6_Activity;

//1.Write a program that gets a name (name appended with surname) as a input and
//Computes the initials (First letter of each word) from the full name and displays them.(use String Class)
//
//Solution Guidance (if applicable): For E.g.: If the name is James Gosling,  Then the Output should be: JG

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        String[] nameParts = fullName.split(" ");

        String initials = "";

        for (String part : nameParts) {
        	initials += part.charAt(0);
        }

        System.out.println("Initials: " + initials.toUpperCase());

        sc.close();

	}

}
