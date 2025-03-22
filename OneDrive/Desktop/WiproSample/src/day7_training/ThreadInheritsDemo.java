package day7_training;

//child thread
//this class cannot inherit any other classes!!!!!!!!!!!!!
class VendorThread1 extends Thread
{
	@Override
	public void run() 
	{
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
}
public class ThreadInheritsDemo {
	public static void main(String[] args) {
			//SEPERATE THREAD OBJECT NOT REQUIRED LIKE PREVIOUS PROGRAM bcos VendorThread1 already inherits Thread!
				VendorThread1 obj=new VendorThread1();
				VendorThread1 obj1=new VendorThread1();
			
				System.out.println("1st Thread alive?? "+obj.isAlive());
				System.out.println("2nd Thread alive?? "+obj1.isAlive());

				obj.setName("AddThread");
				obj1.setName("DelThread");
				obj.start();//start() calling run()!!!!!!!!!!!!!!!!!!
				obj1.start();
				System.out.println("1st Thread alive?? "+obj.isAlive());
				System.out.println("2nd Thread alive?? "+obj1.isAlive());
				try
				{
					for(int i=0;i<5;i++)
					{
					Thread.sleep(4000);//4seconds
					System.out.println("Main Thread:: "+i);
					}
				}
				catch(InterruptedException e)
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
