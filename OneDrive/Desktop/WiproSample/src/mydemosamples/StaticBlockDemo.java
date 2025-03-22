package mydemosamples;

/*
 * Static Block(Compiletime(WORKS FOR A CLASS NOT FOR A OBJECT)::
 * --It will be AUTOMATICALLY executed when a class is first loaded into the JVM
 * --static block is Used to initialize only the static data memeber!
 * (constructors(Runtime)=>instance variables(NON STATIC))
 * --Before the main method,STATIC BLOCK is loaded!
 * --****************Executed only once in the lifetime of the class!
 * --No arguments,no return types,no access specifier */
class Block1
{
	//Multiple static block gets executed in the order of top to bottom!
	static
	{
		System.out.println("Static Block 1 in another class!");	
	}
	static
	{
		System.out.println("Static Block 2 in another class!");	
	}
	Block1()
	{
		System.out.println("Default Constructor of Block1 class!");
	}
}
public class StaticBlockDemo {
	static String ipaddress="192.168.4.657";
	int a=100;//non static=>instance variable
	//Multiple static block gets executed in the order of top to bottom!

	//static block
	/*
	 * It is mostly used for changing default value of static variables.
It is used to initialize static variables of the class.	
	 */
	static
	{
		System.out.println("Static Block :::: 1");
		System.out.println("Ip:: "+ipaddress);
		//System.out.println("Ip:: "+a);//invalid
	}
	//static block
	static
	{
	System.out.println("Static Block :::: 2");
	}
	//static block
	static
	{
	System.out.println("Static Block :::: 3");	
	}
	public static void main(String[] args) {
		System.out.println("Main Method Loaded now!!!!");

		//Before the object is created, static block will be loaded!
		// static blocks are executed first, followed by constructors

		Block1 obj=new Block1();//loading the class, so static block referred automatically
		Block1 obj1=new Block1();//loading the class, so static block referred automatically
		Block1 obj2=new Block1();//loading the class, so static block referred automatically

	}

}
/*
Static Block :::: 1
Ip:: 192.168.4.657
Static Block :::: 2
Static Block :::: 3
Main Method Loaded now!!!!
Static Block 1 in another class!
Static Block 2 in another class!
Default Constructor of Block1 class!
Default Constructor of Block1 class!
Default Constructor of Block1 class!
*/
