package mydemosamples;

/*
 * Anonymous can be created in two ways:

Class(can also be Abstract)
Interface
*/
/*
 * Difference Between Regular and Anonymous Inner Class:::
We can implement multiple numbers of interfaces by using normal class but, 
with an anonymous inner class, we can only 
implement one interface.

With regular class we can extend a class and also implement multiple interfaces but, 
with an anonymous inner class, we can either extend a class or implement an interface 
but not both at the same time.
 */
abstract class Data1 
{
	public abstract void show();
	public abstract void show222();
}
interface inter1 {
	public void disp();
}
//inside a class also, we can create interfaces!!!!!!!!!!!!!!!!!!!!!!
class Data2 {
	interface inter2 {
		void calling();
	}
}
public class AnonymousClasses {
	public static void main(String[] args) {
		//Data1 obj=new Data1();
		//inter1 obj2 =new inter1();
		
		//abstract class/interface  is instantiated by using ANONYMOUS SYNTAX!
				/*
				 * A obj=new A()
				 * {
				 * };
				 *
				 */
		//NO EXTENDS KEYWORD USED FOR ABSTRACT METHODS
		Data1 obj=new Data1()//#1
		{
			@Override
			public void show() {
				System.out.println("Anonymous type:: abstract class object!");		
			}
			@Override
			public void show222() {
				System.out.println("Anonymous type:: abstract class object!");		
			}
		};//closed
		obj.show();
		obj.show222();
			
		//WITHOUT IMPLEMENTS KEYWORD, OVERRIDE THE INTERFACE METHODS USING ANONYMOUS SYNTAX!
		inter1 obj1=new inter1()//#2
		{
			@Override
			public void disp() {
				System.out.println("Anonymous type:: interface object");					
			}
		};
		obj1.disp();

		Data2.inter2 s=new Data2.inter2()//#3
		{
			@Override
			public void calling() {
				System.out.println("Class inside interface!");	
			}
		};
		s.calling();

	}

}
/*
Anonymous type:: abstract class object!
Anonymous type:: abstract class object!
Anonymous type:: interface object
Class inside interface!
*/
