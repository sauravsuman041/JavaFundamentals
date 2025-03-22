package mydemosamples;

/*
 * JDK 8 FEATURE::
 * An Interface that contains exactly one abstract method is known as 
 * functional interface. 
   Functional Interface is also known as Single Abstract Method Interfaces 
   or SAM Interfaces. 
 ex:Comparator,Comparable,Runnable(run)
*/
//A normal interface can have 'N' number of abstract method!

@FunctionalInterface
//this is functional interface!
interface proj2
{  
	void display();//public abstract void display();
}
//@FunctionalInterface//invalid
interface proj3//non functional interface! 2 abstract methods!
{
	void test1();
	void test2();
}
interface proj//1 STATIC + 2 DEFAULT (NO ABSTRACT METHOD)=>NON-FUNCTIONAL INTERFACE
{
	/*
	 * error bcos no static and default!!!
	 * void dis()
	{
		
	}*/

	/*
	   * Important points about java interface static method:

	  1.Java interface static method is part of interface, we can t use it 
	  for implementation class objects.
	  2.Java interface static method helps us in providing security by not 
	  allowing implementation classes to override them.
	  /*
	   * Suppose you want to provide some implementation in your interface and you 
	   * don t want this implementation 
	   * to be overridden 
	   * in the implementing class, then you can declare the method as static.
	   */

	static void show()
	{
		System.out.println("Proj Interface static method!");
	}
	/*
	 *  If you have default method in an interface, it is "not mandatory" to 
	 *  override (provide body) 
	 *  it in the classes that are already implementing this interface.
	 */
	default void disp()
    {  
        System.out.println("Proj Interface Default Method Loaded!");  
    }
    default void disp12()
    {  
        System.out.println("Proj Interface Default Method Loaded!");  
    }

}
/*@FunctionalInterface
interface demo344 extends proj3//proj3 contains 2 abstract methods so demo344 cannot be functional interface
{
	
}*/
//A functional interface can extends another interface only when 
//it does not have any abstract method.

/*
* a functional interface(demo123) is extending to a non-functional interface(proj).
*/

@FunctionalInterface//only one abstract method
interface demo123 extends proj//2 default,1 static,1 abstract
{
	void disp67();		
}
public class FunctionalInterfacesDemo implements demo123 {

	public static void main(String[] args) {
		FunctionalInterfacesDemo obj1=new FunctionalInterfacesDemo();
		obj1.disp67();//abstract method
		obj1.disp();//default method
		obj1.disp12();//default method

		//since a static method is hidden, we can t call it from the object of the implementing class.
		//obj1.show();//error
		proj.show();//interfacename.staticmethodname
		}

	@Override
	public void disp67() {
		System.out.println("Demo interface abstract method!");			
	}
	//we cannot override the interface static method in implementation classes
			/*
			  @Override
			public static void show() 
			{
				System.out.println("Demo interface abstract method (overridden)!");		
			}*/
	//we can ALSO override the default method in implementation classes but its optional!	
	  @Override
	public void disp12() 
	{
		System.out.println("Demo interface default method (overridden)!");		
	}

}
/*
Demo interface abstract method!
Proj Interface Default Method Loaded!
Demo interface default method (overridden)!
Proj Interface static method!
*/
