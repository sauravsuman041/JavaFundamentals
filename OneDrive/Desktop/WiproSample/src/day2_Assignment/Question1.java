package day2_Assignment;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the no of students : ");
		int studentNo = s1.nextInt() ;
		
		//s1.nextLine();
		
		int[] mathsMarks = new int[studentNo] , chemMarks = new int[studentNo], phyMarks = new int[studentNo];
		
		for(int i=0;i<studentNo;i++) {
			
			s1.nextLine();
			System.out.println("Enter Students's Name : ");
			String name = s1.nextLine() ;
			
			System.out.println("Enter the marks in Maths : ");
			mathsMarks[i] = s1.nextInt() ;
			//marks[i][0] = mathsMarks;
			
			System.out.println("Enter the marks in Chemistry : ");
			chemMarks[i] = s1.nextInt() ;
			//marks[i][1] = chemMarks;
			
			System.out.println("Enter the marks in Physics : ");
			phyMarks[i] = s1.nextInt() ;
			//marks[i][2] = phyMarks;
			
			if((mathsMarks[i]>=60 && chemMarks[i]>=40 && phyMarks[i]>=50) || (mathsMarks[i] + phyMarks[i] >=150)) {
				System.out.println("Congratulations! "+ name + " is Eligible for Admission!!");
			}
			else {
				System.out.println("Oops! "+ name + " is not Eligible for Admission!!");
			}
			
		}
		
		
		
		

	}

}
