package day1_Activity;

import java.util.Scanner;

//9.A shopkeeper sells three products whose retail prices are as follows: 
//   Product 1 - 22.50
//   Product 2 - 44.50 
//   Product 3 - 9.98
//Write an application that reads a series of pairs of numbers as follows:
// a) Product number 
// b) Quantity sold
//
//The application should use a switch statement to determine the retail price for each product. 
//It should calculate and display the total retail value of all products sold. 

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float price1 = 22.50f;
		float price2 = 44.50f;
		float price3 = 9.98f;
		
		Scanner s1=new Scanner(System.in);
		
		//int Quantity[] = new int[3] ;
		
		System.out.println("Enter the Product No : ");
		int productNo = s1.nextInt() ;
			
		System.out.println("Enter the Quantity Sold : ");
		int Quantity = s1.nextInt() ;
		
//		System.out.println("Enter the Product No : ");
//		int productNo = s1.nextInt() ;
		
		switch(productNo) {
			default:
				System.out.println("Enter a Valid Product No!!");
				break;
			case 1:
				System.out.println("Toatl retail value of this Product is : "+ price1*Quantity);
				break;
			case 2:
				System.out.println("Toatl retail value of this Product is : "+ price2*Quantity);
				break;
			case 3:
				System.out.println("Toatl retail value of this Product is : "+ price3*Quantity);
				break;
				
		}
		
	}

}
