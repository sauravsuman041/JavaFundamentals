package day1_Activity;

import java.util.Scanner;

//8.Modify the above question to allow student to sit if he/she has medical cause.
//Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Total Marks : ");
		int totalClass = s1.nextInt() ;
		
		System.out.println("Enter the Your Marks : ");
		int yourAttendance = s1.nextInt() ;
		
		System.out.println("Medical cause or not (Enter 'Y' or 'N' ) : ");
		String medical = s1.next();	
		
		float percent = (float)yourAttendance/totalClass * 100;
		
		if(percent<70 && medical=="N") {
			System.out.println("You are not allowed to sit in the exam");
		}
		else {
			System.out.println("You are allowed to sit in the exam");
		}
	}

}
