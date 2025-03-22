package mydemosamples;

/*
 * There are two ways to achieve or implement abstraction in java program. 
 * They are as follows:

Abstract class (0 to 100%)
Interface (100%)
 */

/*
 * Final classes cannot be inhertied, 
 * Abstract classes cannot be instantiated/can be subclassed!!
 Abstract class may have final methods.	Final class does not have abstract methods or final methods.
 */

/*
 * A concrete class cannot contain an abstract method. An abstract class may or may not contain abstract methods.
 * A concrete class is a subclass of an abstract class, which implements all its abstract method. 
 
Abstract methods cannot have body. 
 
Abstract class can have static fields and static method, like other classes. 
 
An abstract class cannot be declared as final. 
 
Only abstract class can have abstract methods. 
 
A private, final, static method cannot be abstract, as it cannot be overridden in a subclass. 
 
Abstract class cannot have abstract constructors. 
 
Abstract class cannot have abstract static methods. 
 
If a class extends an abstract class, then it should define all the abstract methods (override) of the base abstract class. 
If not, the subclass(the class extending abstract class) must also be defined as abstract class. 
 * 
 */


//Abstract class MAY OR MAY NOT include  abstract methods
//RESTRICTING OBJECT CREATION
abstract class Admin57
{
	//non abstract method/CONCRETE METHOD
	void disp() 
	{ 
	}
}


//RESTRICTING OBJECT CREATION
abstract class Shopping1_4
{
	//void disp();//cannot declare methods in a NORMAL CLASS/CONCRETE CLASS!
		//non abstract method/concrete methods can be defined!
		void offers()
		{
			System.out.println("10-30% discount");
		}
		abstract void paymentgateway();//no implementation=>abstract method
		abstract void delivery();
		/*
		 * We cannot create an object of abstract class but we can create an object of 
		 * subclass of abstract class. 
		 * When we create an object of subclass of an abstract class, it calls the 
		 * constructor of subclass.

	This subclass constructor has super in the first line that calls constructor of an 
	abstract class. Thus, the constructors of an abstract class are used from 
	constructor of its subclass.
		 */
		
		Shopping1_4()
		{
			System.out.println("Abstract class Default Constructor!");
		}
}//An abstract concept is not applicable to variables.
//Abstract methods not to be implemented compulsory in sub classes!we can skip!
//this class not eligible for Object creation
abstract class Amazon extends Shopping1_4
{
	//skipped delivery method!!! so that my sub class is also declared as Abstract!!
	@Override
	void paymentgateway() {
		System.out.println("Amazon::paytm,paypal!");				
	}
	/*	@Override
	void delivery() {
		// TODO Auto-generated method stub
		
	}*/
}
class Myntra1 extends Shopping1_4
{
	@Override
	void paymentgateway() {
		System.out.println("Myntra::paytm,paypal!");	
	}
	@Override
	void delivery() {
		System.out.println("10days notice!");		
	}
	void feedback()//belong to Myntra1
	{
		System.out.println("Good!");
	}	
}
//non abstract class/concrete class
public class AbstractClassesDemo {
	public static void main(String[] args) {
		//abstract classes cannot be instantiated!
		/*
		Shopping1_4 obj=new Shopping1_4();
		Amazon obj1=new Amazon();
		*/
		Myntra1 obj=new Myntra1();//Non abstract class/concrete class!
		obj.paymentgateway();
		obj.delivery();
		obj.feedback();
		obj.offers();//..non abstract method...Shopping1_4

		Shopping1_4 obj1=new Myntra1();//polymorphic object
		obj1.paymentgateway();
		obj1.delivery();
		obj1.offers();//Shopping1_4	concrete method
		//obj1.feedback();//invalid
		((Myntra1)obj1).feedback();

	}

}
/*
 * Abstract class Default Constructor!
Myntra::paytm,paypal!
10days notice!
Good!
10-30% discount
Abstract class Default Constructor!
Myntra::paytm,paypal!
10days notice!
10-30% discount
Good!
*/