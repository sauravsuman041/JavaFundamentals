package mydemosamples;

/*
 * CommandLineArguments:
 * -Passing some argument or input during the execution(runtime) of the program
 * --Runtime input(Array of Strings)
 * --default delimiter is white space!
 * 
 *ex:ping 192.168.133.232
*/

//Rightclick->Run as ->Run configurations->Click Arguments tab->In program arguments give value=>click run button!

//String ->class int->Primitive

/*
* Primitive Type	Wrapper classes
* 
	boolean			Boolean
	char			Character
	byte			Byte
	short			Short
	int				Integer
	long			Long
	float			Float
	double			Double
*/

public class CommandLineArguments {

	public static void main(String[] a) //a is a Object of String class
	{
		System.out.println("CmdLine Length:: "+a.length);//objectname.datamember
		if(a.length==0)
		{
			System.out.println("No Inputs passed!");
		}
		else
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.println("Argument["+i+"]:"+a[i]);
			}
		}		
		System.out.println("Add:: "+(a[0]+a[1]));//STRING CONCATENATION

		//Integer Wrapper classes:: Convert String Object to Integer Object(int PRIMITIVE)
		//parseInt is a static method
				//NON STATIC METHOD :: OBJECTNAME.METHODNAME
				//STATIC METHOD :: CLASSNAME.METHODNAME

		System.out.println("Add:: "+(((Integer.parseInt(a[0]))+(Integer.parseInt(a[1])))));//classname.methodname

	}

}
/*
CmdLine Length:: 2
Argument[0]:100
Argument[1]:100
Add:: 100100
Add:: 200
*/
