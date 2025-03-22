package day5_training;

import java.util.ArrayList;

public class Generics1 {

	public static void main(String[] args) {
		ArrayList t1=new ArrayList();//NON-GENERIC,HETEROGENEOUS
		t1.add("Java");//0
		t1.add(4545.545f);//1
		t1.add('C');//2
		
		//Object t11=t1.get(1);//index... this is also valid
		Float t11=(Float)t1.get(1);//index
	
		System.out.println("Non Generic:: "+t11);
		
		/*
		 * Generics::
		 * --compile time type safety!
		 * --no type casting
		 * --Storing specific object type(HOMOGENEOUS)!
		 */

		//Homogenous collection
		//GENERIC
		ArrayList<String> t2=new ArrayList<String>();//ONLY ALLOWS STRING
		t2.add("Java");//0
		t2.add("JSP");//1
		t2.add("45");//2
		//t2.add(45);//invalid=>COMPILATION ERROR


		String d=t2.get(1);//index--//NO TYPECASTING!!!!!
		System.out.println("Generic:: "+d);
		
		
	}

}
/*
 * Non Generic:: 4545.545
Generic:: JSP
*/