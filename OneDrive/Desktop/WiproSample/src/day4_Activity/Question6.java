package day4_Activity;

//6.Write a Java program to create a method that takes a string as input and throws an 
//exception if the string does not contain vowels.

class VowelsException extends Exception{
	public VowelsException(String message) {
		super(message);
	}
}

public class Question6 {
	
	public static void checkForVowels(String input) throws VowelsException {
        if (!input.matches(".*[aeiouAEIOU].*")) {
            throw new VowelsException("The string does not contain any vowels.");
        }
        System.out.println("The string contains vowels: " + input);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            checkForVowels("Hello"); // This will pass
            checkForVowels("Rhythm"); // This will throw an exception
        } catch (VowelsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

	}

}
