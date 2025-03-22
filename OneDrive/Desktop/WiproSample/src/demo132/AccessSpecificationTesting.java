package demo132;

//import mywiprodemos.AccessSpecifiers;

public class AccessSpecificationTesting extends mydemosamples.AccessSpecifiers
{
	public static void main(String[] args) 
	{
		//AccessSpecifiers obj=new AccessSpecifiers();//valid but import statement is mandatory!
		
		//packagename.classname
		mydemosamples.AccessSpecifiers obj=new mydemosamples.AccessSpecifiers();//import statement is not required!

		obj.show();//public method
		//obj.send();//bcos it is default! not visible here		
		//obj.show1();//bcos it is private method

		System.out.println("Public final data member:: "+obj.x);
		
		//obj.disp();	//The method disp() from the type AccessSpecifiers is not visible
		
		AccessSpecificationTesting obj1=new AccessSpecificationTesting();
		obj1.disp();//protected method visible bcos inheritance
		System.out.println("Protected data member:: "+obj1.code);
	
		//If you make any constructor protected, you cannot create the instance of 
		//that class from outside the package.


	}
}
/*
Public Method called!
Public final data member:: 100
Protected Method called!
Protected data member:: 4600
*/
