package day1_Activity;

import java.util.Scanner;

//6.A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Total Marks : ");
		int totalMarks = s1.nextInt() ;
		
		System.out.println("Enter the Your Marks : ");
		int yourMarks = s1.nextInt() ;
		
		float percent = (float)yourMarks/totalMarks * 100;
		
		if(percent>=80) {
			System.out.println("Your Grade is A");
		}
		else if(percent>=60) {
			System.out.println("Your Grade is B");
		}
		else if(percent>=50) {
			System.out.println("Your Grade is C");
		}
		else if(percent>=45) {
			System.out.println("Your Grade is D");
		}
		else if(percent>=25) {
			System.out.println("Your Grade is E");
		}
		else {
			System.out.println("Your Grade is F");
		}

	}

}
