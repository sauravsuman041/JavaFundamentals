package mydemosamples;

import java.util.Scanner;

/*
Userdefined Exception::
--class must inherit from either Throwable or Exception
*/

class WIPRONameFormatException  extends Throwable
{
	public String toString()
	{
		return "Invalid Doctor Name Format!";//error msg
	}	
}
class WIPROAgeRangeException extends Exception
{
	public String toString()
	{
		return "Age must be between 21 to 50! Kindly reenter the age!";//error msg
	}
}


class Doctor
{
	int docid;
	String docname;
	String specialization;
	int age;
	void display()
	{
		System.out.println("Doctor details:: "+docid + " "+docname + " "+age+ " "+specialization);
	}
	Doctor(int a,String dname,String d,int dage)
	{
		this.docid=a;
		this.specialization=d;
		int l,temp=0;
		//CHECKING DOCTOR NAME!
		l=dname.length();//length of a name
		for(int i=0;i<l;i++)
		{
			char ch;
			ch=dname.charAt(i);//extract a character one by one 
			if(ch < 'A' || ch > 'Z' && ch < 'a' || ch>'z')
			{
				temp=1;
			}		
		}
		//throw keyword:: throw or raise an user defined or built in exception explicitly
		//You can throw "only one exception" with the help of throw keyword!
		/*
		 * throw keyword::
		 * --throw followed by Object ex: throw new AgeRangeException
		 * --throw keyword is used within the method or block!
		 * --throw keyword cannot throw multiple exception
		 * ex: throw new AgeRangeException,NameValidationException //invalid!!
		 * 
		 */
		try
		{
			if(temp==1)
			{
				throw  new WIPRONameFormatException();
			}
			else
			{
				this.docname=dname;//docname validation is correct
			}
		}
		catch(WIPRONameFormatException e)
		{
		System.out.println("Name Error:: "+e);//e.toString()	
		}
		//checking age
		try
		{
					if(dage>=21 && dage<=50)
					{
						this.age=dage;//age is correct
					}
					else
					{
						throw new WIPROAgeRangeException();//lookup the catch block
					}
		}
		catch(WIPROAgeRangeException e)
		{
				System.out.println("Age Error:: "+e);//toString()
		}
	}
}//DOCTOR CLASS OVER!
public class UserDefinedException {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Docid:: ");
		int a=s1.nextInt();
		System.out.println("DocName:: ");
		String b=s1.next();
		System.out.println("DocAge:: ");
		int age=s1.nextInt();
		System.out.println("DocSpecialization:: ");
		String s11=s1.next();

		Doctor d1=new Doctor(a,b,s11,age);//calling parameterized constructor
		d1.display();
	}

}
/*
Docid:: 
1001
DocName:: 
THANANYA
DocAge:: 
28
DocSpecialization:: 
HEART
Doctor details:: 1001 THANANYA 28 HEART
*/
/*
Docid:: 
1001
DocName:: 
THANANYA!@25356
DocAge:: 
28
DocSpecialization:: 
HEART
Name Error:: Invalid Doctor Name Format!
Doctor details:: 1001 null 28 HEART
*/
/*
Docid:: 
1001
DocName:: 
THANANYA
DocAge:: 
2
DocSpecialization:: 
HEART
Age Error:: Age must be between 21 to 50! Kindly reenter the age!
Doctor details:: 1001 THANANYA 0 HEART
*/
/*
Docid:: 
19
DocName:: 
THANANYA34234#$%%#
DocAge:: 
23423
DocSpecialization:: 
HEART
Name Error:: Invalid Doctor Name Format!
Age Error:: Age must be between 21 to 50! Kindly reenter the age!
Doctor details:: 19 null 0 HEART
*/