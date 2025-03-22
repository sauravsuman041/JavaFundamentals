package day4_Activity;

//9.Create a class called Employee which asks the user to input the name and the age of a 
//employee. Raise a custom defined exception when the user enters an employee name 
//that has been already entered and raise another exception if the age is negative or less
//than 18 or greater than 60. 

import java.util.Scanner;

//Custom exception for duplicate employee names
class NameException extends Exception {
 public NameException(String message) {
     super(message);
 }
}

//Custom exception for invalid age
class AgeException extends Exception {
 public AgeException(String message) {
     super(message);
 }
}

class Employee {
    private String name;
    private int age;


    private static String[] employees = {"Saurav","Rohit","Aman"};
    //private static int count = 0;


    public Employee(String name, int age) throws NameException, AgeException {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equalsIgnoreCase(name)) {
                throw new NameException("The employee name \"" + name + "\" has already been entered.");
            }
        }


        if (age < 18 || age > 60) {
            throw new AgeException("Age must be between 18 and 60.");
        }

        this.name = name;
        this.age = age;
        
//        employees[count] = name;
//        count++;

    }
    @Override
    public String toString() {
        return "Employee Name: " + name + "\nEmployee Age: " + age;
    }
}

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter employee age: ");
            int age = sc.nextInt();

            Employee emp = new Employee(name, age);
            System.out.print(emp.toString());
            
        } 
        catch (NameException | AgeException e) {
        	
            System.out.println("Error: " + e.getMessage());
        }
		

	}

}
