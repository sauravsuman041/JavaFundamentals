package day5_training;

import java.util.ArrayList;
import java.util.List;

/*
 * List interface:
 * --Implementation classes are LinkedList and ArrayList,Vector,Stack
 * --ordered collection(insertion order is maintained)--List can preserve the insertion order by using the index.
 * --Allows duplicates
*/
/*
 *  *  * ArrayList::
 * --Dynamic array is implicitly implemented
 * --DML operations is slow
 * --Index-based structure
 * --Random Access: ArrayList implements random access because it uses an index-based structure. 
 * Therefore, we can get, set, insert, and remove elements of the array list from any arbitrary position.
 * --Accessing data is fast!!!(index)
 * --Performance: In ArrayList, manipulation is slow because if any element is removed from ArrayList, 
 * a lot of shifting takes place.

For example, if an array list has 500 elements and we remove 50th elements then the 51st element will 
try to acquire that 50th position, and likewise all elements. Thus, it consumes a lot of time-shifting.
*/
/*
 * An ArrayList is a resizable array that can grow or shrink in the memory whenever needed. 
 * It is dynamically created with an initial capacity.

It means that if the initial capacity of the array is exceeded, 
a new array with larger capacity is created automatically and all the elements 
from the current array are copied to the new array.

Elements in ArrayList are placed according to the zero-based index. 
That is the first element will be placed at 0 index and the last element at index (n-1)
 where n is the size of ArrayList.

Java ArrayList uses a dynamic array internally for storing the group of elements, objects, or data.

The capacity of ArrayList does not shrink automatically. When elements are removed 
from the list, the size of array list can be shrunk automatically but not capacity.
 */

public class Collection_List1 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		List obj1=new ArrayList();//valid 
		obj.add(3434);//0
		obj.add("Java");//1
		obj.add('A');//2
		obj.add(43.54F);//3
		obj.add("jsp");//4
		obj.add("jsp");////duplicates allowed!//5

		//insertion order is maintained!
		System.out.println("ArrayList(Ordered collection): "+obj);//obj.toString()
		obj.add(3,"Python");//3rd index position
		System.out.println("ArrayList: "+obj);
		for(Object i :obj)
		{
			System.out.println(i);
		}	
		System.out.println("Get:: "+obj.get(4));//index position-retrieve
		obj.set(3,"Ruby");//modify/update
		System.out.println("ArrayList: "+obj);

		System.out.println("ArrayList: "+obj.contains("jsp"));//searching an element

		
		
	}

}
/*
ArrayList(Ordered collection): [3434, Java, A, 43.54, jsp, jsp]
ArrayList: [3434, Java, A, Python, 43.54, jsp, jsp]
3434
Java
A
Python
43.54
jsp
jsp
Get:: 43.54
ArrayList: [3434, Java, A, Ruby, 43.54, jsp, jsp]
ArrayList: true
*/