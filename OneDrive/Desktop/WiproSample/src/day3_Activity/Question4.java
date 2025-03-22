package day3_Activity;

//4.Write a Java program to create an abstract class Vehicle with abstract methods startEngine() 
//and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and 
//implement the respective methods to start and stop the engines for each vehicle type.


abstract class Vehicle {
 
 abstract void startEngine();
 abstract void stopEngine();
}


class Car extends Vehicle {
 @Override
 void startEngine() {
     System.out.println("Car engine started.");
 }

 @Override
 void stopEngine() {
     System.out.println("Car engine stopped.");
 }
}

class Motorcycle extends Vehicle {
 @Override
 void startEngine() {
     System.out.println("Motorcycle engine started.");
 }

 @Override
 void stopEngine() {
     System.out.println("Motorcycle engine stopped.");
 }
}



public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car();
	     car.startEngine();
	     car.stopEngine();

	     // Create a Motorcycle object
	     Vehicle motorcycle = new Motorcycle();
	     motorcycle.startEngine();
	     motorcycle.stopEngine();
	}

}
