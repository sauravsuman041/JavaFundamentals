package day1_Activity;


//11. Create a class called Calculator which has 4 different methods add, diff, mul and div which 
//accepts two numbers as parameters. Create an object to access these methods and invoke 
//these methods with two numbers and display the result in the corresponding methods. 

class Calculator {
	void add(float a, float b) {
		System.out.println("The addtion of "+ a+ " and "+ b +" is : "+ (a+b));
	}
	void diff(float a, float b) {
		System.out.println("The substraction of "+ a+ " and "+ b +" is : "+ (a-b));
	}
	void mul(float a, float b) {
		System.out.println("The multiplication of "+ a+ " and "+ b +" is : "+ (a*b));
	}
	void div(float a, float b) {
		System.out.println("The division of "+ a+ " and "+ b +" is : "+ (a/b));
	}
}

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj = new Calculator();
		obj.add(2.2f, 3.2f);
		obj.diff(3.2f, 2.2f);
		obj.mul(2.2f, 3.2f);
		obj.div(3.2f, 2.2f);
	}

}
