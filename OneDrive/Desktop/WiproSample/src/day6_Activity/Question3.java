package day6_Activity;

//3.Create a program to depict the usage of the dictionary where words along with the meanings 
//are stored. When the user gives a word, its meaning should be displayed.

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Map<String, String> dictionary = new HashMap<>();

			dictionary.put("Apple", "A fruit.");
	        dictionary.put("Car", "A vehicle.");
	        dictionary.put("Dog", "A domestic animal.");
	        dictionary.put("House", "A building to live in.");

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a word to look up its meaning: ");
	        String word = sc.nextLine();

	        if (dictionary.containsKey(word)) {
	            System.out.println("Meaning of '" + word + "': " + dictionary.get(word));
	        } else {
	            System.out.println("Sorry, the word '" + word + "' is not found in the dictionary.");
	        }

	        sc.close();
	}

}
