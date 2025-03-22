package day5_Activity;

//2. Write a program that will accept 10 numbers from the user as input and store it in a 
//collection. The numbers should not be duplicated. Also get the index position along with 
//the number where it has to be stored.

import java.util.Scanner;


public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = {0,0,0,0,0,0,0,0,0,0,};

		 int count = 0;
	        while (count < 10) {

	            System.out.print("Enter the index position (0 to 9): ");
	            int index = sc.nextInt();

	            if (index < 0 || index > 9) {
	                System.out.println("Invalid index. Please enter a number between 0 and 9.");
	                continue;
	            }

	            System.out.print("Enter the number: ");
	            int number = sc.nextInt();

	            boolean isDuplicate = false;
	            for (int i = 0; i < 10; i++) {
	                if (numbers[i] != 0 && numbers[i] == number) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (isDuplicate) {
	                System.out.println("Duplicate numbers are not allowed. Try again.");
	            } else if (numbers[index] != 0) {
	                System.out.println("The index " + index + " is already occupied. Try again.");
	            } else {
	            	
	                numbers[index] = number;
	                count++;
	            }

	        }

	        System.out.println("Final Numbers in Array:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Index " + i + ": " + numbers[i]);
	        }

	        sc.close();

	}

}
