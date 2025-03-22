package day7_Activity;

//1.Create a class with 4 threads and display a table structured output with the following details 
//every 100 secs 5 times.
//A. The Id of the thread
//B. The name of the thread
//C. Whether the thread is alive or not
//D. The status of the thread
//E. The priority level of the thread

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread ID: " + getId());
            System.out.println("Thread Name: " + getName());
            System.out.println("Is Alive: " + isAlive());
            System.out.println("Thread Status: " + getState());
            System.out.println("Thread Priority: " + getPriority());
            System.out.println();

            try {
                Thread.sleep(100000); // Sleep for 100 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();

        t1.setPriority(9);
        t2.setPriority(6);
        t3.setPriority(7);
        t4.setPriority(8);
        
        t1.setName("First Thread");
        t2.setName("Second Thread");
        t3.setName("Third Thread");
        t4.setName("Fourth Thread");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
	}

}
