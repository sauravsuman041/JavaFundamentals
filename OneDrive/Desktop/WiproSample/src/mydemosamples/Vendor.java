package mydemosamples;

public class Vendor {
	//4 access specifier:: public,private,protected(inheritance), default or package(invisible)
	
	/*instance(object)(variable which is declared inside the class) 
	 always have DEFAULT VALUES
	*/
		/*
		 * int=0,float=0.0,boolean=false,String=null
		 */

	private int vendorid;
	public String vendorname;
	String place;//default or package access specifier
	int a,b;//default or package access specifier

	//All These methods are called as 4=>"NON STATIC METHODS"

	public void display()
	{
		System.out.println("My Java First Method Loaded!");
	}

	public void showrecord()
	{
		System.out.println("Vendor:: "+vendorid+ " "+vendorname+ " "+place);
	}
	
	private float multiply(float x)
	{
		return x*x;
	}
	
	void add(int x,int y)//default access specifier, x and y are local variables
	{
		a=x;
		b=y;
	}	

	//Below is a static method
	public static void main(String[] args) 
	{
		Vendor v1=new Vendor();
		v1.display();
		v1.showrecord();//objectname.methodname
		v1.vendorid=1001;
		v1.vendorname="Dell";
		v1.place="Chennai";
		v1.showrecord();//objectname.methodname

		float result=v1.multiply(1.1F);
		System.out.println("Mul:: "+result);
		System.out.println("Mul:: "+v1.multiply(1.2f));

		System.out.println("Mul:: "+new Vendor().multiply(1.2f));
		new Vendor().display();	


		System.out.println("Before ADD():: "+v1.a + " "+v1.b);
		v1.add(12, 10);//x,y
		System.out.println("After ADD():: "+v1.a + " "+v1.b);
	
		//default values ONLY for instance variable
		//local variable require explicit initialization
	
		int c=1000;
		System.out.println("Main Method(Local Variable)::: "+c);
		

		
		
	}

}
/*My Java First Method Loaded!
Vendor:: 0 null null
Vendor:: 1001 Dell Chennai
Mul:: 1.21
Mul:: 1.44
Mul:: 1.44
My Java First Method Loaded!
Before ADD():: 0 0
After ADD():: 12 10
Main Method(Local Variable)::: 1000
*/
