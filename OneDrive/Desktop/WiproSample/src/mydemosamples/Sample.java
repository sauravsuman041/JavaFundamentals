package mydemosamples;

//import java.lang.*;//OPTIONAL - default package in java. import all the classes packages.

import java.lang.System;//import specific classes! improves the performance of the JVM!
import java.lang.String;


//Compiler :: convert the java code(.java) to byte code(.class)

//Interpreter(JIT(JUST-IN-TIME COMPILER)):: convert the byte code to machine(os specific) code

//2 types of error:: compilation(silly programming mistakes) , runtime(logical mistakes) 

//Outer classes/top level classes cannot be private and protected/static!!!!


/*
 * Package:
 * group of similar types  of classes , interfaces and sub-packages.
 * --used for preventing naming conflicts!
 * 
 * void::the particular method does not return any value
 * main: entry point method for java 
 * static::doesn't require any object! used for memory management!
 * memory allocated by default by the JVM
*/

//class Sample //class default access specifier is "default"(package)!!!=>Sample.class

//public class Sample extends Object


//public access specifier:: filename and classname must be same!!


//public class Sample12//compilation Error =>Sample.class but at the runtime it will lookup Sample12.class

 //class Sample111//valid- //Bytecode filename:: Sample111.class
public class Sample
 {
	//System,String =>Built in class

	/*
	 * class System
	 * {
	 * static PrintStream out;
	 * }
	 */

	//System is a built in java-class
	//out is a STATIC reserved object of java.io.PrintStream class
	//println is a method of PrintStream class
	
	// class empty=>NO OBJECT

	public static void main(String[] args) //Command line arguments(String array!)
	{
		System.out.println("Hello Java");
	}

}
