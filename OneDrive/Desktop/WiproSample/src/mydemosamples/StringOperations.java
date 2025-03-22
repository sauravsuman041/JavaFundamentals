package mydemosamples;

/*
 * Class String::
 * --java.lang package
 * --ALL String values are stored in a area called "String Pool"
 * --String intern pool or String constant pool is one of the storage area in heap memory.
 * --From Java 7 onwards, String pool values are eligible for GC process.
 * --String a=new String("Chennai")=>String object created in non pool(heap) memory 
 * but value will be moved into String pool memory
 */
/*String Literal::
 * String objects are stored in a special memory area known as the "string constant pool".
 * String name="Devi"
 * Each time you create a string literal, the JVM checks the "string constant pool" first.
 *  If the string already exists in the pool, a reference to the pooled instance is returned. 
 * If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
*/
/*
 * By new keyword:::
 * String a=new String("Chennai")
 * In such case, JVM will create a new string object in normal (non-pool) heap memory, 
 * and the literal "Chennai" will be placed in the string constant pool. 
 * The variable a will refer to the object in a heap (non-pool).
 */
public class StringOperations {
	public static void main(String[] args) {
		String name="Abi";//String pool
		String name1=new String("Abi");//Heap memory+StringPool
		String name2="abi";//String pool
		String name3="Abi";//String pool
		
		//equals=>(content/value comparison)check the value only not the address
		System.out.println("Equals:::"+name.equals(name1));//T
		System.out.println("Equals:::"+name1.equals(name3));//T
		System.out.println("Equals:::"+name.equals(name3));//T
		System.out.println("Equals:::"+name.equals(name2));//F
		System.out.println("EqualsIgnoreCase:::"+name.equalsIgnoreCase(name2));//T

		//==:: Strict comparison operator
		//Check the value +address(type of memory)
		System.out.println("==:: "+(name==name1));//F
		System.out.println("==:: "+(name1==name3));//F
		System.out.println("==:: "+(name==name3));//T
		System.out.println("==:: "+(name==name2));//F
		
		/*
		 * Compareto::
		 * Comparison based on Unicode value
		 * <0	== the invoking string is less than str
		 * >0 	==	the invoking string is greater than str
		 * 0	==	strings are equal
		 * A-Z 65-90,a-z 97-122
		 */
		System.out.println("Compareto::"+name.compareTo(name1));
		System.out.println("Compareto::"+name1.compareTo(name3));
		System.out.println("Compareto::"+name.compareTo(name3));
		System.out.println("Compareto::"+name.compareTo(name2));
		System.out.println("Compareto::"+name2.compareTo(name));

		String dept="Training Finance Insurance Hr";
		System.out.println("Contains:: "+dept.contains("Hr"));
		System.out.println("Contains:: "+dept.contains("Pitstop"));

		String a="Java";
		String b="JSP" +a + "PHP"+ "Python";//3 values in string pool
		String c=a+b;
		System.out.println("Concat:: "+c);
		System.out.println("Length:: "+a.length());
		System.out.println("CharAt:: "+a.charAt(2));//starts from 0
		System.out.println("Concat:: "+a.concat(b));

		//convert any primitive to String=>valueOf
		String i=String.valueOf(65656.545f);
		String i1=String.valueOf(3343.6565d);
		System.out.println("ValueOf():: "+i + " "+i1);

		String lang="Java,Jsp,Servlets,Oracle,Mysql";
		System.out.println("Before Split():: "+lang.length());
		String[] list4343=lang.split(",");//, is a delimiter
		for(String s:list4343)
		{
			System.out.println(s);
			System.out.println(s.length());
		}
		String dt = "01-23-2014";
		String dateParts[] = dt.split("-");
		String month  = dateParts[0];
		String day  = dateParts[1];
		String year = dateParts[2];
		System.out.println(month + " "+day + " "+year);
		
		System.out.println("StartsWith:: "+lang.startsWith("Java"));
		System.out.println("StartsWith:: "+lang.startsWith("Jsp"));
		System.out.println("EndsWith:: "+lang.endsWith("Java"));
		System.out.println("Indexof()::"+lang.indexOf("S"));
		System.out.println("Indexof()::"+lang.indexOf("a",5));//searching starts from 5th index
		System.out.println("LastIndexof:: "+lang.lastIndexOf("r"));
		//13 is the starting index
		System.out.println("LastIndexof()::"+lang.lastIndexOf("s",13));// searching backward starting at the specified index. 

		String addr="        C he n nai         ";
		System.out.println("Length:: "+addr.length());
		System.out.println("Before Trim() :: "+addr);
		String addr1=addr.trim();//remove leading and trailing blank spaces!The trim() in Java does not remove middle spaces.
		System.out.println("After Trim:: "+addr1);
		System.out.println("After Trim Length :: "+addr1.length());
		/*
		 * String pool is possible only because String is immutable in Java. This way Java Runtime saves a 
		 * lot of heap space because different String variables can refer to the same String 
		 * variable in the pool. If String would not have been immutable, then String interning would not have 
		 * been possible because if any variable would have changed the value, it would have been reflected in 
		 * the other variables too.

If String is not immutable then it would cause a severe security threat to the application. 
For example, database username, password are passed as String to get database connection and in socket 
programming host and port details passed as String. Since String is immutable, its value can t be changed 
otherwise any hacker could change the referenced value to cause security issues in the application.

Since String is immutable, it is safe for multithreading. A single String instance can be shared across 
different threads. This avoids the use of synchronization for thread safety. Strings are implicitly thread-safe.
		 */

		String str1="India";
		str1.toUpperCase();
		System.out.println("String(Immutable):: "+str1);
		System.out.println("String:: "+str1.toUpperCase());
		System.out.println("String(Immutable):: "+str1);

		/*
		 * In the String constant pool, a String object is likely to have one or many references. 
		 * If several references point to the same String without even knowing it, it would be bad if one 
		 * of the references modified that String value. That's why String objects are immutable.
		 */
	
		String str2=str1.toUpperCase();
		System.out.println(str2 + " "+str1);

		
		
		

	}

}
/*
Equals:::true
Equals:::true
Equals:::true
Equals:::false
EqualsIgnoreCase:::true
==:: false
==:: false
==:: true
==:: false
Compareto::0
Compareto::0
Compareto::0
Compareto::-32
Compareto::32
Contains:: true
Contains:: false
Concat:: JavaJSPJavaPHPPython
Length:: 4
CharAt:: v
Concat:: JavaJSPJavaPHPPython
ValueOf():: 65656.55 3343.6565
Before Split():: 30
Java
4
Jsp
3
Servlets
8
Oracle
6
Mysql
5
01 23 2014
StartsWith:: true
StartsWith:: false
EndsWith:: false
Indexof()::9
Indexof()::20
LastIndexof:: 19
LastIndexof()::6
Length:: 27
Before Trim() ::         C he n nai         
After Trim:: C he n nai
After Trim Length :: 10
String(Immutable):: India
String:: INDIA
String(Immutable):: India
INDIA India
*/
