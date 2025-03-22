package day2_Assignment;

import java.util.Scanner;

//2.3. Write a Java program for following grading system.
//Note: Percentage>=90% : Grade A
//Percentage>=80% : Grade B
//Percentage>=70% : Grade C
//Percentage>=60% : Grade D
//Percentage>=40% : Grade E
//Percentage<40% : Grade F

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Total Marks : ");
		int totalMarks = s1.nextInt() ;
		
		System.out.println("Enter the Your Marks : ");
		int yourMarks = s1.nextInt() ;
		
		float percent = (float)yourMarks/totalMarks * 100;
		
		if(percent>=90) {
			System.out.println("Your Grade is A");
		}
		else if(percent>=80) {
			System.out.println("Your Grade is B");
		}
		else if(percent>=70) {
			System.out.println("Your Grade is C");
		}
		else if(percent>=60) {
			System.out.println("Your Grade is D");
		}
		else if(percent>=40) {
			System.out.println("Your Grade is E");
		}
		else {
			System.out.println("Your Grade is F");
		}
	}

}
