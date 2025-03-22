package day1_Activity;

import java.util.Scanner;

//14.Write a program that prompts user for the mark (between 0-100 in int) of 3 students;
//computes the average (in double); and prints the result rounded to 2 decimal places. 
//Your program needs to perform input validation. 
// For examples,

//  Enter the mark (0-100) for student 1: 56
//  Enter the mark (0-100) for student 2: 101
//  Invalid input, try again...
//  Enter the mark (0-100) for student 2: -1
//  Invalid input, try again...
//  Enter the mark (0-100) for student 2: 99
//  Enter the mark (0-100) for student 3: 45
//The average is: 66.67

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the mark (0-100) for student 1: ");
		int s1Marks = s1.nextInt() ;
		
		while(!(s1Marks>=0 && s1Marks<=100)) {
			System.out.println("Invalid input, try again...");
			System.out.println("Enter the mark (0-100) for student 1: ");
			s1Marks = s1.nextInt() ;
		}
		
		System.out.println("Enter the mark (0-100) for student 2: ");
		int s2Marks = s1.nextInt() ;
		
		while(!(s2Marks>=0 && s2Marks<=100)) {
			System.out.println("Invalid input, try again...");
			System.out.println("Enter the mark (0-100) for student 2: ");
			s2Marks = s1.nextInt() ;
		}
		
		System.out.println("Enter the mark (0-100) for student 3: ");
		int s3Marks = s1.nextInt() ;
		
		while(!(s3Marks>=0 && s3Marks<=100)) {
			System.out.println("Invalid input, try again...");
			System.out.println("Enter the mark (0-100) for student 3: ");
			s3Marks = s1.nextInt() ;
		}
		
		float average = (float)(s1Marks + s2Marks + s3Marks)/3;
		System.out.println("The average is: "+ average);
	}

}
