package day7_training;

/*
Synchronization::
--Synchronization is a process of controlling the access of shared resources
 by the multiple threads in such a manner that only one thread can access a 
 particular resource at a time.
--Once a thread enters a synchronized code, it acquires a mutex(lock). 
It is released only when the thread leaves the synchronized code.

--In non synchronized multithreaded application, it is possible for 
one thread to modify a shared object while another thread is 
in the process of using or updating the object’s value. 

--Synchronization prevents such type of data corruption which may otherwise
 lead to dirty reads and significant errors.

--A deadlock occurs when two or more threads wait for each other to
 release the lock on a particular object. Synchronization will prevent
  deadlock.

--Synchronized methods are also called thread-safe methods.
Generally critical sections of the code are usually marked with 
synchronized keyword.

--Only methods (or blocks) can be synchronized, 
Classes and variable cannot be synchronized.
      
--Each object has just one lock.
--All methods in a class need not to be synchronized. 
A class can have both synchronized and non-synchronized methods.
--Constructors cannot be synchronized 
 */
/*
--Uses of synchronization:
1.to prevent thread interruption
2.to prevent inconsistency problem
*/

//ex: Thread safe (contains synchronized methods): String Buffer,HashTable,Vector(List interface)
class Parentheses//NORMAL JAVA CLASS
{
	//void display(String s)//non synchronized METHOD
	//METHOD LEVEL SYNCHRONIZATION
	synchronized void display(String s)//synchronized
	{
		System.out.print ("(" + s);//open the parantheses
	   	try 
		{
	     		Thread.sleep (4000);//4 seconds
	System.out.println("\n\t Current Thread: "
+Thread.currentThread().getName()+ " "+Thread.currentThread().getPriority());
	  	 }
		 catch (InterruptedException e) 
		{
		        System.out.println ("Interrupted");
		}
		 System.out.println(")");//close the ()
	}
}
//child thread 
class MyThread implements Runnable
{
	Parentheses p1;
	String s1;

		public MyThread(Parentheses p1, String s1)
		{
		super();
		this.p1 = p1;
		this.s1 = s1;
		}

		@Override
		public void run() 
		{
			p1.display(s1);//calls CLASS Parantheses 
	
		}
}

public class ThreadSynchronization {
	public static void main(String[] args)throws Exception
 {
		Parentheses pobj=new Parentheses();
		Thread t1=new Thread(new MyThread(pobj,"India"));
		Thread t2=new Thread(new MyThread(pobj,"US"));
		Thread t3=new Thread(new MyThread(pobj,"UK"));
		Thread t4=new Thread(new MyThread(pobj,"Australia"));
		
		t1.setName("First Thread");
		t1.start();//run() method called automatically
		t2.setName("Second Thread");
		t2.start();
		t3.setName("Third Thread");
		t3.start();
		t4.setName("Fourth Thread");
		t4.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		System.out.println("Main Thread Over!");


	}

}
/*
NON SYNCHRONIZED OUTPUT::

(US(UK(India(Australia
Current Thread: Third Thread 5
)

Current Thread: First Thread 5
)

Current Thread: Second Thread 5
)

Current Thread: Fourth Thread 5
)
Main Thread Over!
*/
/*
SYNCHRONIZED OUTPUT: 
 
(India
Current Thread: First Thread 5
)
(Australia
Current Thread: Fourth Thread 5
)
(UK
Current Thread: Third Thread 5
)
(US
Current Thread: Second Thread 5
)
Main Thread Over!
*/
