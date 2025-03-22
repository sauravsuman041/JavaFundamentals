package day1_Activity;

import java.util.Scanner;

//5.A company decided to give bonus of 10% to employee if his/her year of service is more than 6 years.
//Ask user for their salary and year of service and print the net bonus amount.

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter your salary : ");
		int salary = s1.nextInt() ;
		
		System.out.println("Enter your years of service : ");
		int yearOfService = s1.nextInt() ;
		
		if(yearOfService > 6) {
			float bonus = salary * 0.1f;
			System.out.println("Your Net Bonus : " + bonus);
		}
		else {
			System.out.println("You are not eligible for Bonus!!");
		}
	}

}
