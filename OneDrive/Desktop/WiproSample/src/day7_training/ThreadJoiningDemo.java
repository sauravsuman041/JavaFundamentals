package day7_training;

class ShopThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Current Thread Name:: "+Thread.currentThread().getName());	
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(2000);//2 seconds
				System.out.println("Shop Thread:: "+i + " "+Thread.currentThread().getName());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Shop Thread enters into DEAD state!");
		System.out.println("Shop Thread Completed!");
	}
}
public class ThreadJoiningDemo {

	public static void main(String[] args) throws InterruptedException
	{
		ShopThread t1=new ShopThread();//no SetName() so default is Thread-0
		ShopThread t2=new ShopThread();//no SetName() so default is Thread-1
		ShopThread t3=new ShopThread();//no SetName() so default is Thread-2
		

		System.out.println("Main Thread Running!");
		t1.start();
		t2.start();
		t3.start();
		/*
		 * order:: 
		 * main
		 * child1,child2,..
		 * main
		 */
		/*
		 * join method::
		 * it allows one thread(main thread) to wait until 
		 * all the child threads to complete
		 * its execution!
		 */
		t1.join();//main thread waiting for the completion of all child threads!
		t2.join();
		t3.join();
				
		//NO SLEEP METHOD IN MAIN THREAD
		System.out.println("Main Thread waiting for child threads!!");
		System.out.println("Main Thread completed!");
	}

}
/*
 * 
 BEFORE JOIN():::
 
Main Thread Running!
Current Thread Name:: Thread-0
Current Thread Name:: Thread-1
Main Thread waiting for child threads!!
Main Thread completed!
Current Thread Name:: Thread-2
Shop Thread:: 0 Thread-2
Shop Thread:: 0 Thread-1
Shop Thread:: 0 Thread-0
Shop Thread:: 1 Thread-1
Shop Thread:: 1 Thread-0
Shop Thread:: 1 Thread-2
Shop Thread:: 2 Thread-1
Shop Thread:: 2 Thread-2
Shop Thread:: 2 Thread-0
Shop Thread:: 3 Thread-1
Shop Thread:: 3 Thread-2
Shop Thread:: 3 Thread-0
Shop Thread:: 4 Thread-1
Shop Thread enters into DEAD state!
Shop Thread Completed!
Shop Thread:: 4 Thread-2
Shop Thread enters into DEAD state!
Shop Thread Completed!
Shop Thread:: 4 Thread-0
Shop Thread enters into DEAD state!
Shop Thread Completed!
*/
/*
 * AFTER JOIN():::
 * 
 * Main Thread Running!
Current Thread Name:: Thread-0
Current Thread Name:: Thread-1
Current Thread Name:: Thread-2
Shop Thread:: 0 Thread-0
Shop Thread:: 0 Thread-2
Shop Thread:: 0 Thread-1
Shop Thread:: 1 Thread-2
Shop Thread:: 1 Thread-0
Shop Thread:: 1 Thread-1
Shop Thread:: 2 Thread-2
Shop Thread:: 2 Thread-0
Shop Thread:: 2 Thread-1
Shop Thread:: 3 Thread-1
Shop Thread:: 3 Thread-0
Shop Thread:: 3 Thread-2
Shop Thread:: 4 Thread-1
Shop Thread enters into DEAD state!
Shop Thread Completed!
Shop Thread:: 4 Thread-2
Shop Thread enters into DEAD state!
Shop Thread Completed!
Shop Thread:: 4 Thread-0
Shop Thread enters into DEAD state!
Shop Thread Completed!
Main Thread waiting for child threads!!
Main Thread completed!
*/