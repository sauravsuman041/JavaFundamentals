package day6_Activity;

//11.Write a program that reads in a series of first names and stores them in a LinkedList. 
//Do not store duplicate names. Allow the user to search for a first name.


import java.util.LinkedList;
import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> namesList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
        	System.out.print("To Add a name Enter 1 else to Exit Enter 2: ");
        	
        	int num = sc.nextInt();
        	if (num==2) {
                break;
            }
        	else if(num==1) {
        		sc.nextLine();
                System.out.print("Enter a name: ");
                String name = sc.nextLine();

                if (namesList.contains(name)) {
                    System.out.println("Name is already in the list. Please enter a unique name.");
                } else {
                    namesList.add(name);
                    System.out.println("Name added successfully.");
                }
        	}
        	else {
        		System.out.println("Please Enter 1 or 2 only!! ");
        	}
        	
        }
        
        System.out.println("Names in the list: " + namesList);

        sc.nextLine();
        System.out.print("Enter a name to search: ");
        String searchName = sc.nextLine();

        if (namesList.contains(searchName)) {
            System.out.println("The name " + searchName + " is found in the list.");
        } else {
            System.out.println("The name " + searchName + " is not found in the list.");
        }
        
        sc.close();

	}

}
