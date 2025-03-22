package mydemosamples;

import java.io.IOException;
//In the calling chain of method calls, Checked Exception has to be 
//HANDLED COMPULSORY with the 
//help of throws keyword/TRY-CATCH BLOCK

/*
* Throws keyword::
* --alternative of try---catch block
* --throws followed by classnames!(NO NEW KEYWORD!)
* --throws used in the METHOD SIGNATURES!NOT INSIDE THE METHOD BODY
* --contains multiple exception also
* ex: 
* public void disp() throws IOException,SQLException,ArithmeticException
* {
* }
*/


public class ExceptionPropagationDemo2 {
	void test3()throws IOException //no try catch block in test3()=>//MANUALLY PROPAGATIONG
	{
		throw new IOException();//CheckedException generated	
	}
	void test2() throws IOException,Exception//valid
	//void test2() throws IOException//MANUALLY PROPAGATIONG //no try catch block in test2()
	{
		test3();	//test2 calling test3()
	}
	void test1()
	{
		try
		{
			test2();//test1 calling test2()
		}
		catch(Exception e)
		{
			System.out.println("Exception handled only in test1()");
			e.printStackTrace();//test3() problem handled here!
		}	
	}
	public static void main(String[] args) {
		ExceptionPropagationDemo2 obj=new ExceptionPropagationDemo2();
		obj.test1();
		System.out.println("Program continue!");
	}

}
/*
Exception handled only in test1()
java.io.IOException
	at mywiprodemos.ExceptionPropagationDemo2.test3(ExceptionPropagationDemo2.java:24)
	at mywiprodemos.ExceptionPropagationDemo2.test2(ExceptionPropagationDemo2.java:29)
	at mywiprodemos.ExceptionPropagationDemo2.test1(ExceptionPropagationDemo2.java:35)
	at mywiprodemos.ExceptionPropagationDemo2.main(ExceptionPropagationDemo2.java:45)
Program continue!
*/
