package mydemosamples;

/*
 * /*
Initialisations blocks can be:
    * Static block
    * Instance block(non static block)
--Static Initialisation blocks run only once when the class is first loaded. 
Used to initialize only static variables.
--Instance Initialisation blocks run each time BEFORE the object of the class 
is created. Used to initalize only instance variables.
The Compiler copies instance initializer block into every constructor. 
Therefore, this can be used to share a block of code between multiple 
constructors.
--The instance initializer block comes in the order in which they appear.

When to use:
When you need to perform an action each time an object is created, such as logging or conditional initialization.
When you want to ensure that some code executes before the constructor logic without repeating it in every constructor.

 *this keyword cannot be used in static block in java.
 *this keyword can be used in instance block in java.
 *

 *CLASS ORDER::
 *STATIC BLOCK=>INSTANCE BLOCK=>CONSTRUCTOR=>METHOD

 *the static blocks of the parent class are executed, followed by the static blocks of the subclass.

 */
class Sites
{
	//instance block
	{
		System.out.println("Online Shopping Sites Loaded - PARENT CLASS INSTANCE BLOCK!!");
	}
	Sites()
	{
		System.out.println("ShoppersStop,Myntra,Faballey... - PARENT CLASS INSTANCE BLOCK");
	}
	static
	{
		System.out.println("Static Block Sites! - PARENT CLASS STATIC BLOCK");
	}

}
class Purchase extends Sites
{
	//2 instance block
	{
		System.out.println("Before purchase read the terms&conditions-SUB CLASS INSTANCE BLOCK");
	}
	{
		System.out.println("Timing,Charges and reporting to audit - SUB CLASS INSTANCE BLOCK");
	}
	Purchase(String pname)
	{
	System.out.println("Prod Name:: "+pname);	
	}
	static
	{
		System.out.println("Shopping App Loaded - SUB CLASS STATIC BLOCK!!!");
	}
}
public class InstanceBlockDemo {
	static int b=1000;
	InstanceBlockDemo()
	{
		System.out.println("Default Constructor Loaded!");
	}
	//instance  block(NO NAME)
	{
		System.out.println("Preloading the object-FIRST INSTANCE BLOCK!");
		System.out.println(b);//static variable
	}
	{//instance  block(NO NAME)
		System.out.println("Preloading the object again - SECOND INSTANCE BLOCK!");
	}
	static//TOP HIGHER  PRIORITY
	{
		System.out.println("Preloading the class - STATIC BLOCK!");
	}
	
	public static void main(String[] args) {
		InstanceBlockDemo obj=new InstanceBlockDemo();//2*4=8times instance block output
		InstanceBlockDemo obj1=new InstanceBlockDemo();
		InstanceBlockDemo obj2=new InstanceBlockDemo();
		InstanceBlockDemo obj3=new InstanceBlockDemo();

		/*
		 * 1.Parent class Static block then derived class static block
		 2.Parent class instance block,sub class instance block then DERIVED CLASS  constructor
		 */

		Purchase p1=new Purchase("Kurtis");
		Purchase p2=new Purchase("Party wear dresses");

	}

}
/*
Preloading the class - STATIC BLOCK!
Preloading the object-FIRST INSTANCE BLOCK!
1000
Preloading the object again - SECOND INSTANCE BLOCK!
Default Constructor Loaded!
Preloading the object-FIRST INSTANCE BLOCK!
1000
Preloading the object again - SECOND INSTANCE BLOCK!
Default Constructor Loaded!
Preloading the object-FIRST INSTANCE BLOCK!
1000
Preloading the object again - SECOND INSTANCE BLOCK!
Default Constructor Loaded!
Preloading the object-FIRST INSTANCE BLOCK!
1000
Preloading the object again - SECOND INSTANCE BLOCK!
Default Constructor Loaded!
Static Block Sites! - PARENT CLASS STATIC BLOCK
Shopping App Loaded - SUB CLASS STATIC BLOCK!!!
Online Shopping Sites Loaded - PARENT CLASS INSTANCE BLOCK!!
ShoppersStop,Myntra,Faballey... - PARENT CLASS INSTANCE BLOCK
Before purchase read the terms&conditions-SUB CLASS INSTANCE BLOCK
Timing,Charges and reporting to audit - SUB CLASS INSTANCE BLOCK
Prod Name:: Kurtis
Online Shopping Sites Loaded - PARENT CLASS INSTANCE BLOCK!!
ShoppersStop,Myntra,Faballey... - PARENT CLASS INSTANCE BLOCK
Before purchase read the terms&conditions-SUB CLASS INSTANCE BLOCK
Timing,Charges and reporting to audit - SUB CLASS INSTANCE BLOCK
Prod Name:: Party wear dresses
*/