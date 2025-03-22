package day7_training;

/*
 * Runnable interface::
 * --one method called run()
 */
//child thread
//class VendorThread extends Generics1 implements Runnable //valid
class VendorThread  implements Runnable //valid::inheriting another class is possible!
{
	@Override
	public void run() {
		System.out.println("Child Thread Name:: "+Thread.currentThread().getName());
		try
		{
			for(int i=0;i<5;i++)
			{
				//temporarily suspending vendor thread for every 2 seconds
			//sleep method takes milliseconds argument
			Thread.sleep(2000);//2 seconds
			System.out.println("Vendor Child Thread: "+i + " "+Thread.currentThread().getName());
			}
		}
		catch(InterruptedException e)//checked exception
		{
			System.out.println(e);
		}
		System.out.println("Vendor thread enters into DEAD state!");
		System.out.println("Vendor thread completed!!!");	
	}
}//thread class over
public class ThreadRunnableDemo {
	public static void main(String[] args) {
		/*
		 * EXECUTION ORDER::
		 * MAIN THREAD(START)
		 * CHILD THREAD
		 * MAIN THREAD(END)
		 */

		VendorThread vt1=new VendorThread();
		//USER DEFINED THREADS ARE GIVEN AS THREAD-0,THREAD-1...
		Thread obj=new Thread(vt1);//COMPLETE CHILD THREAD OBJECT
		Thread obj1=new Thread(vt1);//COMPLETE CHILD THREAD OBJECT
				
		System.out.println("1st Thread alive?? "+obj.isAlive());
		System.out.println("2nd Thread alive?? "+obj1.isAlive());

		obj.setName("AddThread");
		obj1.setName("DelThread");

		obj.start();//start() internally calling run()!!!!!!!!!!!!!!!!!!
		obj1.start();

		//Only once you can start the thread!
		//obj1.start();//invalid IllegalThreadStateException raised!

		System.out.println("1st Thread alive?? "+obj.isAlive());
		System.out.println("2nd Thread alive?? "+obj1.isAlive());
		System.out.println("Total number of Threads?? "+Thread.activeCount());
		try
		{
			for(int i=0;i<5;i++)
			{
			Thread.sleep(4000);//every 4 seconds child thread will get invoked!
			System.out.println("Main Thread:: "+i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Main Thread completed!");


	}

}
/*
1st Thread alive?? false
2nd Thread alive?? false
1st Thread alive?? true
2nd Thread alive?? true
Total number of Threads?? 3
Child Thread Name:: AddThread
Child Thread Name:: DelThread
Vendor Child Thread: 0 AddThread
Vendor Child Thread: 0 DelThread
Main Thread:: 0
Vendor Child Thread: 1 DelThread
Vendor Child Thread: 1 AddThread
Vendor Child Thread: 2 AddThread
Vendor Child Thread: 2 DelThread
Main Thread:: 1
Vendor Child Thread: 3 DelThread
Vendor Child Thread: 3 AddThread
Vendor Child Thread: 4 DelThread
Vendor thread enters into DEAD state!
Vendor thread completed!!!
Vendor Child Thread: 4 AddThread
Vendor thread enters into DEAD state!
Vendor thread completed!!!
Main Thread:: 2
Main Thread:: 3
Main Thread:: 4
Main Thread completed!
*/