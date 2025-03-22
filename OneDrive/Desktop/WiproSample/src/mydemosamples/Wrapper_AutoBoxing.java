package mydemosamples;

/*
 *  Autoboxing refers to the conversion of a primitive value into an object of the corresponding wrapper class is called autoboxing.
 *  For example, converting int to Integer class
 *  
 *  Unboxing on the other hand refers to converting an object of a wrapper type to its corresponding primitive value. 
 *  For example conversion of Integer to int.
 
 The technique lets us use primitive types and Wrapper class objects interchangeably 
 and we do not need to perform any typecasting explicitly.
 */
public class Wrapper_AutoBoxing 
{	private Integer id;  // Wrapper class for primitive int
    private String name;
    private Double salary;  // Wrapper class for primitive double
    
 // Constructor
    public Wrapper_AutoBoxing(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}
	 @Override
	    public String toString() {
	        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
	    }
    
	 public static void printNumber(Integer number)//Method taking Wrapper classes!
	 {
	        System.out.println("Number: " + number);
	   }
	public static void main(String[] args) {
		int i = 10;
		Integer integer = i;// Autoboxing
		System.out.println("Value of integer: " + integer);
		
		Integer integer11 = new Integer(10);
		int i1 = integer11;// Unboxing
		System.out.println("Value of i: " + i1);
		
		int j=42;
		  // Passing a primitive int, it gets automatically converted to Integer
		printNumber(j);
		
		boolean bln = false; 
		  Boolean BLN = new Boolean(bln);
		  System.out.println(BLN);
		  
		  Boolean BLN1 = new Boolean(true);      //Boolean Object
	        boolean bln2 = BLN1;                   //Auto-Unboxing of Boolean Object
	        System.out.println(bln2);
	        
	        Wrapper_AutoBoxing emp = new Wrapper_AutoBoxing(1,"Thananya",458888.88);
	        System.out.println(emp); //toString()
	}

}
/*
  Value of integer: 10
 
Value of i: 10
Number: 42
false
true
Employee ID: 1, Name: Thananya, Salary: 458888.88

*/
