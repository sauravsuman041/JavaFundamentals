package mydemosamples;

/*
 * Protected::
 * --Access in the same package of the subclasses +""other packages"" 
 * with the help of inheritance
 * Public::
 * --Global access,same package +other packages
 * Default or package::
 * --Only in the same package. It cannot be accessed outside  the package!
 * */

public class AccessSpecifiers {
	public  final int x=100;
	protected int code=4600;
	protected void disp()
	{
	System.out.println("Protected Method called!");	
	}
	public void show()
	{
		System.out.println("Public Method called!");	
	}
	private void show1()//Inside the same package also, you cannnot access private methods!
	{
		System.out.println("Private Method called!");	
	}

	//default or package access specifier
	void send()////Inside the same package, you can access default methods! 
	//NOT OUTSIDE THE PACKAGES!
	{
		System.out.println("Default Access Method called!");	
	}

	/*public static void main(String[] args) {
	//empty
	//no logic here!

}*/

}
