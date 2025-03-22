package mydemosamples;

//Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.

/*Polymorphism(many forms)::
* Method Overloading(If a class has multiple methods having same name but different in parameters, 
* it is known as 
* Method Overloading)::
*--number of arguments
-- order of arguments
--data type of arguments

Method overloading is not possible by changing the "return type" of the method
only!!!!

*/


public class MethodOverloadingDemo {
	// instance variable
	int a, b;

	String personname;
	long contact1;
	long contact2;

	void showrec(String x,long y)//2 args
	{
				//personname=x;//valid
				//contact1=y;//valid
				//here this keyword is optional
				this.personname=x;
				this.contact1=y;	
				System.out.println("Res:: "+personname+ " "+contact1);			
	}
	void showrec(String x,long y,long z)
	{
		this.personname=x;//here optional
		contact1=y;
		contact2=z;
		System.out.println("Res:: "+personname+ " "+contact1+ " "+contact2);
	}
	void showrec(long y,String x,long z)
	{
		//empty		
	}
	void showrec(long x,long y,String z)
	{
		contact1=x;
		contact2=y;
		personname=z;
		System.out.println("Res:: "+personname+ " "+contact1+ " "+contact2);	
	}
	
	/*Duplicate method-return type not considered.
	 * int showrec(long x,long y,String z)//3 args
	{
	}*/
	void testing() {
		System.out.println("Testing Method loaded!");
	}
	//this keyword=>refers current class instance variable or method or constructor
	//this keyword eliminate confusion between instance and local variable names, if same!
	void calc(int a, int b)// local variable!!Shadowing!!!
	{
		testing();	//one method calling another method	
		
		//LHS=>INSTANCE VARIABLE,RHS=>LOCAL VARIABLE
		this.testing();//optional but it is valid

		this.a=a;
		this.b=b;
	}
	public static void main(String[] args)
	{
		MethodOverloadingDemo obj1 = new MethodOverloadingDemo();
		System.out.println("Before calc():: " + obj1.a + " " + obj1.b);
		obj1.calc(12, 10);// calc() internally calls testing()!!
		System.out.println("After calc():: " + obj1.a + " " + obj1.b);

		obj1.showrec("Devi", 9789962180L,98404045003L);//String,long,long
		obj1.showrec("Devi", 9789962180L);//String,long
		obj1.showrec(9789962180l, 9840405003L, "Thananya");//long,long,String
		
	}

}
/*
Before calc():: 0 0
Testing Method loaded!
Testing Method loaded!
After calc():: 12 10
Res:: Devi 9789962180 98404045003
Res:: Devi 9789962180
Res:: Thananya 9789962180 9840405003
*/
