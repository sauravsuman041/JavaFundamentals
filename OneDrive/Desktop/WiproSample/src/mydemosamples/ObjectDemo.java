package mydemosamples;


/*
 * Object Class::
 * 
 * toString():::
 * The toString() method converts the object into a string and returns it. 
 */
//class User extends Object
class User//sub class
{
	String name;
	String address;
	//Rightclick=>Source=>Generate Constructor using fields=>select all fields->click ok.
	public User(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	//built in method of Object class
	//Overriding toString() from Object Class

	//Source->Generate toString()
	/*
	 * The @Override annotation indicates that the child class method is over-writing 
	 * its base class method. 
	 * 
	 * The @Override annotation can be useful for two reasons. 
	 * It extracts a warning from the compiler if the annotated method doesn't actually 
	 * override anything.
	 *  It can improve the readability of the source code
	 */
	@Override//Annotation starts with @symbol
//	public String toString4545454545() //invalid
	public String toString() 
	{
		//return "User [name=" + name + ", address=" + address + "]";
		return "Happy Learning!";//valid		
	}
}
public class ObjectDemo {
	public static void main(String[] args) {
		User obj=new User("Thananya","Chennai");
		System.out.println(obj.name + " "+obj.address);	
		//By default Object Class(toString()) will print the heap memory address(hashcode) of a class
		System.out.println("Printing the object:: "+obj);//implicitly calling toString()
		System.out.println("Printing the object:: "+obj.toString());//VALID	
	
	}

}
/*
Thananya Chennai
Printing the object:: Happy Learning!
Printing the object:: Happy Learning!
*/
