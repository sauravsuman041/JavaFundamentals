package day3_Activity;

//5.Write a Java program to create an abstract class Person with abstract methods eat() 
//and exercise(). Create subclasses Athlete and LazyPerson that extend the Person 
//class and implement the respective methods to describe how each person eats and 
//exercises.

//Abstract class Person
abstract class Person {
 // Abstract methods to be implemented by subclasses
 abstract void eat();
 abstract void exercise();
}

//Subclass Athlete
class Athlete extends Person {
 @Override
 void eat() {
     System.out.println("Athlete eats a balanced diet");
 }

 @Override
 void exercise() {
     System.out.println("Athlete exercises every day");
 }
}

//Subclass LazyPerson
class LazyPerson extends Person {
 @Override
 void eat() {
     System.out.println("LazyPerson eats junk food");
 }

 @Override
 void exercise() {
     System.out.println("LazyPerson avoids exercise");
 }
}



public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person athlete = new Athlete();
	     System.out.println("Athlete:");
	     athlete.eat();
	     athlete.exercise();

	     // Create a LazyPerson object
	     Person lazyPerson = new LazyPerson();
	     System.out.println("\nLazyPerson:");
	     lazyPerson.eat();
	     lazyPerson.exercise();
	}

}
