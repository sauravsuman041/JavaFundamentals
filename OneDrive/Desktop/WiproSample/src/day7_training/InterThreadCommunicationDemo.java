package day7_training;

/*
Inter-thread communication in Java is a technique through which multiple threads communicate with each other.

Inter-thread communication is required when execution of one thread 
depends on another thread’s task. 

wait() will move the current thread to sleep state allowing for the 
other thread to execute. notify() will trigger back the wait() thread to 
ready state and to execute further. notifyAll() will trigger all wait()
 threads to ready state.

***********The notifyAll(), notify() and wait() are methods of the
**************Object class.
These methods can be invoked only from within a synchronized 
context (synchronized method or synchronized block), otherwise, 
the call will result in an IllegalMonitorStateException. 
The notifyAll() method wakes up all the threads waiting 
on the resource. 

join(),sleep()  methods are  thread  class methods 
 
 ex:Producer-Consumer!!!
 */
class Calc1//HELPER CLASS
{
	int i,j;
	public int add()
	{
		return i+j;
	}
}
//child thread!
class CalcService implements Runnable
{
	Calc1 obj1;//Object of Calc1 class!
	int a[];
	int b[];
	public CalcService(Calc1 obj1, int[] a, int[] b) 
	{
		super();
		this.obj1 = obj1;
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() 
	{
		try
		{
			System.out.println("Thread:: "+Thread.currentThread());
			//synchronizing Calc1 class object
			//synchronized block
			/*
			 * static
			 * {
			 * }
			 * 
			 */
			synchronized(obj1)//class Calc1 Object  
			{
			for(int i=0;i<a.length;i++)
			{
				obj1.notify();
				
				obj1.i=a[i];//t1 thread
				obj1.j=b[i];//t2 thread
				System.out.println(a[i]+ " "+b[i]);
				System.out.println("Thread:: "+Thread.currentThread()+ " "+obj1.add());//a[i]+b[j]
				obj1.wait();
			}
			obj1.notifyAll();//final notification to main thread
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Child Thread Over!");
	}
}
public class InterThreadCommunicationDemo {
	public static void main(String[] args)throws Exception
	{
		Calc1 c=new Calc1();//Helper class
		CalcService s1=new CalcService(c,new int[]{11,21,31,41,51},new int[]{1,2,3,4,5});//ChildThread class
		CalcService s2=new CalcService(c,new int[]{2,2,2,2,2},new int[]{10,20,30,40,50});//ChildThread class
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Main Thread Over!");

	}

}
/*
NON-INTER THREAD COMMUNICATION OUTPUT::

Thread:: Thread[Thread-0,5,main]
11 1
Thread:: Thread[Thread-0,5,main] 12
21 2
Thread:: Thread[Thread-1,5,main]
Thread:: Thread[Thread-0,5,main] 23
31 3
Thread:: Thread[Thread-0,5,main] 34
41 4
Thread:: Thread[Thread-0,5,main] 45
51 5
Thread:: Thread[Thread-0,5,main] 56
Child Thread Over!
2 10
Thread:: Thread[Thread-1,5,main] 12
2 20
Thread:: Thread[Thread-1,5,main] 22
2 30
Thread:: Thread[Thread-1,5,main] 32
2 40
Thread:: Thread[Thread-1,5,main] 42
2 50
Thread:: Thread[Thread-1,5,main] 52
Child Thread Over!
Main Thread Over!
*/

/*
Thread:: Thread[Thread-0,5,main]
Thread:: Thread[Thread-1,5,main]
11 1
Thread:: Thread[Thread-0,5,main] 12
2 10
Thread:: Thread[Thread-1,5,main] 12
21 2
Thread:: Thread[Thread-0,5,main] 23
2 20
Thread:: Thread[Thread-1,5,main] 22
31 3
Thread:: Thread[Thread-0,5,main] 34
2 30
Thread:: Thread[Thread-1,5,main] 32
41 4
Thread:: Thread[Thread-0,5,main] 45
2 40
Thread:: Thread[Thread-1,5,main] 42
51 5
Thread:: Thread[Thread-0,5,main] 56
2 50
Thread:: Thread[Thread-1,5,main] 52
Child Thread Over!
Child Thread Over!
Main Thread Over!
*/
