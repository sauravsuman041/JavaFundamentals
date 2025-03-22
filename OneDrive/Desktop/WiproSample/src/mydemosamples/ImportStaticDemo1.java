package mydemosamples;

/*
With the help of import, we are able to access classes and interfaces which are present 
in any package.

But using "static import", we can access all the static members (variables and methods) 
of a class directly without explicitly calling class name
*/
/*
 *import static::
 *--With the help of ""import static"", we can access the static methods 
 *without a classname!
 * 
 */
import java.lang.Math.*;//general import

import static java.lang.Math.*;
import static java.lang.System.*;

public class ImportStaticDemo1 {

	public static void main(String[] args) 
	{
		//sqrt is a static method(classname.methodname)
		out.println("Sqrt(900):: "+Math.sqrt(900));//Here Math class is optional bcos of import static!
		out.println("Sqrt(900):: "+sqrt(900));//ignoring Math class BCOS of IMPORT STATIC !
	
		//out is a static data member(present in System class!)
				/*
				 * class System
				 * {
				 * static PrintStream out;
				 * }
				 */
		out.println("Hello Java!");//ignoring System class BCOS of IMPORT STATIC !
		out.printf("Sqrt(900):: %.2f ",sqrt(900));

	}

}
/*
Sqrt(900):: 30.0
Sqrt(900):: 30.0
Hello Java!
Sqrt(900):: 30.00 */
