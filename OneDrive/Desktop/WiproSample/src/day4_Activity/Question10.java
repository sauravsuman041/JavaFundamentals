package day4_Activity;
//
//10.Write a program to demonstrate the knowledge of students in Java Exception handling. Ans
//Eg., Read the Register Number and Mobile Number of a student. If the Register Number does not 
//contain exactly 9 characters or if the Mobile Number does not contain exactly 10 characters, 
//throw an IllegalArgumentException. If the Mobile Number contains any character other than a 
//digit, raise a NumberFormatException. If the Register Number contains any character other than 
//digits and alphabets, throw a NoSuchElementException. If they are valid, print the message 
//‘valid’ else ‘invalid’.

import java.util.Scanner;
import java.util.NoSuchElementException;
import java.lang.NumberFormatException;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        try {
            // Read Register Number
            System.out.print("Enter Register Number: ");
            String registerNumber = scanner.nextLine();

            // Read Mobile Number
            System.out.print("Enter Mobile Number: ");
            String mobileNumber = scanner.nextLine();

            // Validate Register Number
            if (registerNumber.length() != 9) {
                throw new IllegalArgumentException("Register Number must contain exactly 9 characters.");
            }
            for (char c : registerNumber.toCharArray()) {
                if (!Character.isLetterOrDigit(c)) {
                    throw new NoSuchElementException("Register Number must only contain alphabets and digits.");
                }
            }

            // Validate Mobile Number
            if (mobileNumber.length() != 10) {
                throw new IllegalArgumentException("Mobile Number must contain exactly 10 characters.");
            }
            for (char c : mobileNumber.toCharArray()) {
                if (!Character.isDigit(c)) {
                    throw new NumberFormatException("Mobile Number must only contain digits.");
                }
            }

            // If validations pass
            System.out.println("Valid");

        }
        catch(NumberFormatException e){
        	System.out.println("Invalid: " + e.getMessage());
        }       
        catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("Invalid: " + e.getMessage());
           
        }        
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }

	}

}
