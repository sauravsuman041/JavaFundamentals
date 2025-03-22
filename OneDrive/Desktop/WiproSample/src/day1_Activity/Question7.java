package day1_Activity;

import java.util.Scanner;

//7.A student will not be allowed to sit in exam if his/her attendence is less than 70%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Total Marks : ");
		int totalClass = s1.nextInt() ;
		
		System.out.println("Enter the Your Marks : ");
		int yourAttendance = s1.nextInt() ;
		
		float percent = (float)yourAttendance/totalClass * 100;
		
		if(percent<70) {
			System.out.println("You are not allowed to sit in the exam");
		}
		else {
			System.out.println("You are allowed to sit in the exam");
		}
	}

}
