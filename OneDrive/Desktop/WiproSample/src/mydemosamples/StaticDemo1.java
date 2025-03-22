package mydemosamples;

/*
 * Static data member:
 * ex: static int x;
 * --Only a SINGLE copy is created and shared among all the objects
 * --Gives importance to CLASS rather than OBJECT!
 * --We can access static data member or method without OBJECT !
 * --also called as "CLASS VARIABLE"
 * --static data member default values are SAME as instance variables!!!
 * 
 * Non static data member::
 * --Object is mandatory
 * --also called as "INSTANCE VARIABLE"
 * --gives more importance to OBJECT!!
 * --Each object having their own COPY references!
 */
class Counter
{
	/*
	 * Static variables are shared among all instances of a class.
	 *  Non static variables are specific to that instance of a class. 
	 */

	//int count;//non static data member=>default value is 0
	 static int count;//default value is 0
		//static variable(class variable)

	public Counter()//DEFAULT CONSTRUCTOR
		{
			count++;
		}
			public int totalhits()
			{
				return count;
			}
}
public class StaticDemo1 {
	public static void main(String[] args) {
		/*
		 * Counter c1=new Counter();	
		System.out.println("Count:: "+c1.totalhits());
		Counter c2=new Counter();
		System.out.println("Count:: "+c2.totalhits());
		Counter c3=new Counter();
		System.out.println("Count:: "+c3.totalhits());

	Count:: 1
Count:: 2
Count:: 3

		 */
		Counter c1=new Counter();	//1
		Counter c2=new Counter();	//2
		Counter c3=new Counter();	//3(LATEST)
		System.out.println("Count:: "+c1.totalhits());
		System.out.println("Count:: "+c2.totalhits());
		System.out.println("Count:: "+c3.totalhits());
/*
 * Count:: 3
Count:: 3
Count:: 3

 */
	}

}
