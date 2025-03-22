package mydemosamples;

/*
 * In the Multilevel inheritance, a derived class will inherit a base class and as well as the
 *  derived class also act as the base class to other class.
 */
//Object is the super classes for all the classes in java!

//Constructor order:: Base class to derived class
//Default constructor of base class is automatically loaded in derived class

//class Level1//valid
class Level1 extends Object//valid
{
	//Java enforces the super keyword must be ""first statement"" in constructor!
	Level1()
	{
		//super();//calls Object class default constructor=>OPTIONAL
		System.out.println("Level1 Constructor()");
		//super();//invalid=>super keyword must be ""first statement"" in constructor!
	}
}
class Level2 extends Level1
{
	Level2()
	{
		super();//Calls Level1 Default constructor=>OPTIONAL
		System.out.println("Level2 Constructor()");
	}
}
class Level3 extends Level2
{
	Level3()
	{
		super();//Calls Level2 Default constructor=>OPTIONAL
		System.out.println("Level3 Constructor()");		
	}
}
public class Inheritance2 {
	public static void main(String[] args) {
		Level3 obj=new Level3();
	}
}
/*
Level1 Constructor()
Level2 Constructor()
Level3 Constructor()
*/
