package day6_training;

//generic class
//Built in generic characters:: T or E
//Generics is equivalent to TEMPLATES IN C++
//ArrayList<Integer> obj=new ArrayList<Integer>();

class MyGeneric<WIPRO>//This generic character only allowed inside the class!
{
	int data;//non generic
	//Generic data member!
	WIPRO data1;//WIPRO is replaced by any OBJECT type!


	 //Generic constructor
	    //WIPRO is replaced by ANY Object TYPE
	   	//1 constructor works for MULTIPLE OBJECT TYPE!

	   public MyGeneric(WIPRO data1)
	   {
	  		super();
	  		this.data1 = data1;
	   }
	 //generic method
	  	//return type of the method is GENERIC
	   public WIPRO display()
	  	{
	  		return data1;
	  	}
		//1 METHOD,1 CONSTRUCTOR,1 DATA MEMBER=> ''N'' DIFFERENT TYPE OF OBJECTS
}
public class Generic_Class_Method_Constructor {
	public static void main(String[] args) {
		MyGeneric<String> obj=new MyGeneric<>("Devi");
		String a=obj.display();
		System.out.println("Generic(String):: "+a);

		MyGeneric<Integer> obj1=new MyGeneric<>(54);
		int a1=obj1.display();
		System.out.println("Generic(Integer):: "+a1);

		MyGeneric<Float> obj2=new MyGeneric<>(45.54f);
		float a2=obj2.display();
		System.out.println("Generic(Float):: "+a2);	

	}

}
/*
Generic(String):: Devi
Generic(Integer):: 54
Generic(Float):: 45.54
*/