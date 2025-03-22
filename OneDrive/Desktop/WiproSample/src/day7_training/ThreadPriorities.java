package day7_training;

/*
 * Thread Priorities::
 * --Thread.MIN_PRIORITY(1)
 * Thread.MAX_PRIORITY(10)
 * Thread.NORM_PRIORITY(5)--DEFAULT PRIORITY FOR MAIN THREAD
 */
class TestingThread implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Current Thread Name:: "+Thread.currentThread().getName());	
		try
		{
			for(int i=0;i<3;i++)
			{
				Thread.sleep(2000);//2 seconds
				System.out.println("Child Thread:: "+i + " "+Thread.currentThread().getName());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Child Thread enters into DEAD state!" +Thread.currentThread().getName());
		System.out.println("Child Thread Completed!");
		}
}
public class ThreadPriorities {
	public static void main(String[] args)throws Exception
 {
		Thread t1=new Thread(new TestingThread());
		Thread t2=new Thread(new TestingThread());
		Thread t3=new Thread(new TestingThread());
		
		/*
		 * In most cases, thread schedular schedules the threads according to their priority 
		 * (known as preemptive scheduling). 
		 * But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.
		 */

		t1.setName("Add");
		t1.setPriority(6);
		//t1.setPriority(61);//IllegalArgumentException		
		t1.start();
		
		t2.setName("Delete");
		t2.setPriority(Thread.NORM_PRIORITY-2);//5-2=3
		t2.start();
		
		t3.setName("Update");
		t3.setPriority(Thread.NORM_PRIORITY+4);//5+4=9
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();

	
		System.out.println("Main Thread completed!");

	}

}
/*
Current Thread Name:: Add
Current Thread Name:: Delete
Current Thread Name:: Update
Child Thread:: 0 Update
Child Thread:: 0 Add
Child Thread:: 0 Delete
Child Thread:: 1 Update
Child Thread:: 1 Add
Child Thread:: 1 Delete
Child Thread:: 2 Add
Child Thread:: 2 Delete
Child Thread:: 2 Update
Child Thread enters into DEAD state!Update
Child Thread enters into DEAD state!Delete
Child Thread Completed!
Child Thread enters into DEAD state!Add
Child Thread Completed!
Child Thread Completed!
Main Thread completed!
*/