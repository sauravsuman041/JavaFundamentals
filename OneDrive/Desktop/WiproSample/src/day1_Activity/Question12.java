package day1_Activity;

import java.util.Scanner;

//12.Create a class called shape with the following methods
//1. area
//2. perimeter
//
//     Overload the area and perimeter method to calculate for both square and rectangle.
//     Create a main class and invoke the area method to calculate the area of the square and 
//     rectangle. Also invoke the perimeter method to calculate the perimeter of the square 
//     and rectangle.

class Shape {
	public double area(double side) {
		return side*side;
	}
	public double area(double side1, double side2) {
		return side1*side2;
	}
	
	public double perimeter(double side) {
		return side*4;
	}
	public double perimeter(double side1, double side2) {
		return (side1+side2)*2;
	}
}

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj = new Shape();
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the side of the Square : ");
		int side = s1.nextInt() ;
		
		System.out.println("Enter the length of the Rectangle : ");
		int length = s1.nextInt() ;
		
		System.out.println("Enter the breadth of the Rectangle : ");
		int breadth = s1.nextInt() ;
		
		System.out.println("Area of the Square with side "+ side + " is : "+ obj.area(side));
		System.out.println("Perimeter of the Square with side "+ side + " is : "+ obj.perimeter(side));
		
		System.out.println("Area of the Rectangle with length "+  length + " and breadth " + breadth + " is : "+ obj.area(length,breadth));
		System.out.println("Perimeter of the Rectangle with length "+ length +" and breadth "+ breadth+ " is : "+ obj.perimeter(length,breadth));
		

	}

}
