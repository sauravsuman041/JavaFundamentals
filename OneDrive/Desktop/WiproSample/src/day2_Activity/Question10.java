package day2_Activity;

//10. Write a Java program to counts occurrences of a certain character in a given string.

import java.util.Scanner;

public class Question10 {
	
	public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char targetChar = scanner.next().charAt(0);

        int count = countOccurrences(inputString, targetChar);

        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");

        scanner.close();
    }


}
