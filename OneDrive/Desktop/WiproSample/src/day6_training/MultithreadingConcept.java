package day6_training;

public class MultithreadingConcept {

}



/*
MULTITHREADING in Java is a process of executing two or more threads 
simultaneously to maximum utilization of CPU. 
Multithreaded applications execute two or more threads run concurrently. 
Hence, it is also known as Concurrency in Java. 
Each thread runs parallel to each other.

Advantages::
--many operations run together,so saves time
--threads are independent so it doesnt affect other threads if an 
exception occurs in a single thread!
--thread is lightweight
--thread share the same memory space.
 */
/*
 * Non-Multithreading (Single-threaded):

Execution Flow: In a non-multithreaded (or single-threaded) application, the program executes one 
				task at a time, in a sequential manner.
Processing: If you have multiple tasks, they are executed one after the other. The program will 
			  complete one task and then start the next.
Performance: If a task takes a long time, it blocks the execution of the subsequent tasks. The program 
			  may seem "frozen" until that task finishes.
Use Case: This is simpler and often sufficient for programs with basic logic, where tasks do not need 
			to be performed concurrently.

Multithreading:

Execution Flow: In a multithreaded application, the program can execute multiple tasks concurrently 
				(or at the same time), with each task running in its own thread.
Processing: Tasks are split into separate threads, which run independently. The operating system manages 
				the threads, allowing them to run in parallel or to share CPU time.
Performance: Multithreading can improve performance, especially in CPU-bound or I/O-bound applications,
 				because tasks can be processed concurrently. However, it also introduces complexity 
 				(e.g., handling thread synchronization).
Use Case: Multithreading is useful in applications where multiple tasks need to be performed simultaneously,
 			such as handling multiple user requests in a web server or processing large datasets in parallel.

-------------Key Differences:---------------

Concurrency:
Non-multithreading runs tasks sequentially, while multithreading allows multiple tasks to be processed 
concurrently.


CPU Utilization:
In non-multithreading, only one task can use the CPU at a time, while in multithreading, multiple threads 
can run in parallel, leading to better CPU utilization (especially on multi-core processors).


Complexity:
Non-multithreading is simpler to write and debug because tasks are executed one after the other.
Multithreading introduces challenges like thread synchronization, race conditions, and deadlocks, 
which require careful management.


Performance:
Non-multithreading can lead to performance bottlenecks since each task must wait for the previous one to 
finish.Multithreading can improve performance in many cases by dividing tasks into smaller units that 
can run concurrently.



In summary, 
non-multithreading is suitable for simpler tasks that don’t need concurrency, while multithreading 
is beneficial when performance and handling concurrent tasks are important.







 */
//current thread is called main thread(default thread)

/*
* 2 ways TO CREATE A CHILD THREAD::
* --implements Runnable interface(run method)
* --extends Thread class
*/