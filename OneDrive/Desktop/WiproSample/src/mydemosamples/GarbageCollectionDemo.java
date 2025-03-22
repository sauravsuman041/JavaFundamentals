package mydemosamples;

/*
 * GarbageCollection::
 * --calling or requesting the JVM to perform the GC explicitly
 * --System.gc()(STATIC METHOD)=============Runtime.getRuntime().gc()(NON STATIC METHOD)

How object can be unreferenced?

By nullifying the reference
By assigning a reference to another
By anonymous object etc. ex: new Employee();
 */
/*
 * finalize method::
 * --java.lang.Object class
 * --This method is just called before the object is going to get GC process!
 * --this method cannot be invoked more than once by a JVM for any given object!
 * --override this method to receive the NOTIFICATION from the JVM(GC)
 * --dispose or cleanup the program resources!!
		 //Neither finalization nor garbage collection is guaranteed.
 */

public class GarbageCollectionDemo {
	//void addition();//NO DECLARATION OF METHOD IN CLASS!
	
	//JVM CALLS THIS FINALIZE METHOD BEFORE GC HAPPENS!
	//Rightclick->Source->Override/Implement methods->select finalize()

	
	@Override
	//protected void finalize() throws Throwable //valid
	public void finalize() throws Throwable//valid
	//void finalize() throws Throwable //invalid=>Cannot decrease the visibility of the method
	{
		System.out.println("GC Tool invoke in some few mins!!");
		System.out.println("GC Tool calls object :::" +this.getClass());
	}

	public static void main(String[] args) {
		GarbageCollectionDemo obj=new GarbageCollectionDemo();
		GarbageCollectionDemo obj1=new GarbageCollectionDemo();

		obj=null;//unused or unreferenced obj, eligible for GC process
		System.gc();//Runs the garbage collector.

		obj1=null;//unused or unreferenced obj, eligible for GC process
		Runtime r1=Runtime.getRuntime();//An application cannot create its own instance of this class.
		r1.gc();//Runs the garbage collector.

		System.out.println("HELLO MAIN METHOD!");

	}

}
/*
HELLO MAIN METHOD!
GC Tool invoke in some few mins!!
GC Tool calls object :::class mywiprodemos.GarbageCollectionDemo
GC Tool invoke in some few mins!!
GC Tool calls object :::class mywiprodemos.GarbageCollectionDemo
*/