package day5_Activity;

//1.Write a Java program that implements a stack. Your program will ask users to input a word 
//letter-by-letter and then displays the word backward. Please note that you are working 
//with letters to build the stack, thus when you read the word, you will push the letters 
//onto the stack and when you write them, you will pop those letters one-by-one.

import java.util.Scanner;
import java.util.Stack;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        Stack<Character> obj = new Stack<>();

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        for (char ch : word.toCharArray()) {
            obj.push(ch);
        }

        System.out.print("The word backward is: ");
        while (!obj.isEmpty()) {
            System.out.print(obj.pop());
        }
        
        sc.close();

	}

}
