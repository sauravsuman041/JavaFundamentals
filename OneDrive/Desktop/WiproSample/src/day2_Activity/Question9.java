package day2_Activity;

//9.String class, String immutability::::  
//
//Exercise: Write class that declares the following String.
//		 The quick brown fox jumps over the lazy dog .
//Perform the following modifications to the above string using appropriate methods.
//
//. Print the character at the 12th index.
//2. Check whether the String contains the word  is .
//3. Add the string  and killed it  to the existing string.
//4. Check whether the String ends with the word  dogs .
//5. Check whether the String is equal to  The quick brown Fox jumps over the lazy Dog .
//6. Check whether the String is equal to  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG .
//7. Find the index position of the character  a .
//8. Find the last index position of the character  e .
//9. Find the length of the String.1
//10. Check whether the String matches to  The quick brown Fox jumps over the lazy Dog .
//11. Replace the word  The  with the word  A .
//12. Split the above string into two such that two animal names do not come together.
//13. Print the animal names alone separately from the above string.
//14. Print the above string in completely lower case.
//15. Print the above string in completely upper case.

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "The quick brown fox jumps over the lazy dog";

        // 1. Print the character at the 12th index.
        System.out.println("Character at index 12: " + str.charAt(12));

        // 2. Check whether the String contains the word "is".
        System.out.println("Contains 'is': " + str.contains("is"));

        // 3. Add the string " and killed it" to the existing string.
        String modifiedStr = str + " and killed it";
        System.out.println("Modified String: " + modifiedStr);

        // 4. Check whether the String ends with the word "dogs".
        System.out.println("Ends with 'dogs': " + str.endsWith("dogs"));

        // 5. Check whether the String is equal to "The quick brown Fox jumps over the lazy Dog".
        System.out.println("Equals 'The quick brown Fox jumps over the lazy Dog': " 
                + str.equals("The quick brown Fox jumps over the lazy Dog"));

        // 6. Check whether the String is equal to "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG".
        System.out.println("Equals 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG': " 
                + str.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));

        // 7. Find the index position of the character 'a'.
        System.out.println("Index of 'a': " + str.indexOf('a'));

        // 8. Find the last index position of the character 'e'.
        System.out.println("Last index of 'e': " + str.lastIndexOf('e'));

        // 9. Find the length of the String.
        System.out.println("Length of the string: " + str.length());

        // 10. Check whether the String matches "The quick brown Fox jumps over the lazy Dog".
        System.out.println("Matches 'The quick brown Fox jumps over the lazy Dog': " 
                + str.matches("The quick brown Fox jumps over the lazy Dog"));

        // 11. Replace the word "The" with the word "A".
        System.out.println("Replaced 'The' with 'A': " + str.replaceFirst("The", "A"));

        // 12. Split the above string into two such that two animal names do not come together.
        String[] splitStr = str.split("fox");
        System.out.println("Split string parts:");
        for (String part : splitStr) {
            System.out.println(part.trim());
        }

        // 13. Print the animal names alone separately from the above string.
        System.out.println("Animal names: fox, dog");

        // 14. Print the above string in completely lower case.
        System.out.println("Lower case: " + str.toLowerCase());

        // 15. Print the above string in completely upper case.
        System.out.println("Upper case: " + str.toUpperCase());

	}

}
