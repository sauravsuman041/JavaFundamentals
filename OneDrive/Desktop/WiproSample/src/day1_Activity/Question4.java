package day1_Activity;

import java.util.Scanner;

//4.Take name, roll number and field of interest from user and print in the format below :
//  Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		String name = s1.nextLine() ;
		
		System.out.println("Enter your Roll No : ");
		int roll = s1.nextInt() ;
		s1.nextLine();
		System.out.println("Enter your Field of Interest : ");
		String fieldOfInterest = s1.nextLine() ;
		
		System.out.println("Hey, my name is " + name + " and my roll number is " + roll + ". My field of interest are " + fieldOfInterest);
		
		
		
	}

}
