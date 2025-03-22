package mydemosamples;

/*
 * Lambda expression::
 * --jdk 8
 * --By using lambda, we can directly provide the implementation to the 
 * interface methods
 * syntax:::
 * () -> {  
	//Body of no parameter lambda  
	}  
*/
/*
 *  * --Lambda expression are treated as a function, so the compiler
 * does not create .class file!!!!!!!!!!!!!!!!
 */
/*
 * Lambda expression can be used where a class implements a functional interface to 
 * reduce the complexity of the code.

An inner anonymous class is more powerful as we can use many methods as we want, 
whereas lambda expression can only be used where an interface has only a single 
abstract method.

For Lambda Expression at the time of compilation, no .class file fill be generated.

For the Anonymous Inner class at the time of compilation, a separate .class 
file will be generated.

The Performance of the lambda expression is better as it is pure compile-time 
activity and doesn’t incur extra cost during runtime.

However, the Performance of the anonymous inner class is lower as requires class 
loading at runtime.

If you are coding in Java 8 make sure you use lambda expression instead of anonymous
 class for implementing Comparable, Comparator,  Runnable,  Callable,  
 CommandListener,  ActionListener, and several other interfaces in Java, which got just one single method.
 */

@FunctionalInterface
interface calc
{
	public int add(int a,int b);//abstract method
	//public int add11(int a,int b);//abstract method=>INVALID 
	default int sub(int x,int y)//default method
	{
		return x-y;
	}	
}
//non functional interface
interface calc11
{
	default int sub(int a1,int b1)
	{
		return a1-b1;
	}
}
@FunctionalInterface
interface mypi
{
	double getpi();//public abstract double getpi();
}
@FunctionalInterface
interface Formula {

    double calculate(int a);

    static double sqrt11(int a) {
        return Math.sqrt(a);
    }
}
@FunctionalInterface
interface String1 
{
    String process(String input);
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		/*
		 NON FUNCTIONAL INTERFACE DOESNT SUPPORT LAMBDA SYNTAX!!!COMPILATION ERROR
		 calc11 j1;
		j1=(g,j)->(g+j);
		System.out.println("Add(Lambda syntax):: "+j1.sub(12, 12));//calc add method
*/
		//without implements keyword we r directly defining interface methods by using lambda
		//NO @OVERRIDE ANNOTATION
		/*
		 * Java version 8, Lambda expressions 
		 * reduce the code length and code complexity to a greater extent. 
		 */
				/*
				 * Lambda expressions can operate only on 
				 * functional interfaces (i.e. interface with only one abstract method).
		*/
		calc a1=(a4,b6)->(a4+b6);//no return keyword. it is optional in lambda! #VERSION1
		System.out.println("Add(Lambda syntax):: "+a1.add(12, 12));//calc add method

		calc a2=(a3,a5)->//VERSION 2
		{
			return (a3+a5);
		};
		System.out.println("Add(Lambda syntax):: "+a2.add(1, 12));//calc add method
		
		calc a3=(int a31,int a5)->//VERSION 3
		{
			return (a31+a5);
		};
		System.out.println("Add(Lambda syntax):: "+a3.add(2, 12));//calc add method

		mypi k1;
		k1=()->3.14d;
		System.out.println("Area:: "+2*2*k1.getpi());//2*2*3.14


		Formula f1 =(a) -> Formula.sqrt11(a);//static method in lambda expression
		 System.out.println(f1.calculate(100));//calculate() abstract method
	             
		 //String1 ref1=(a33)->"Hi: "+a33;//Parantheses are optional for arguments
			
		String1 ref1=a33->"Hi: "+a33;//Parantheses are optional for arguments
		System.out.println(ref1.process("HappyLearning!"));
		
	}

}
/*
Add(Lambda syntax):: 24
Add(Lambda syntax):: 13
Add(Lambda syntax):: 14
Area:: 12.56
10.0
Hi: HappyLearning!
*/
