package day7_Activity;

//6.Write a JAVA program that creates threads by extending Thread class .First thread display
//“Good Morning “every 1 sec, the second thread displays “Hello “every 2 seconds and the
//third display “Welcome” every 3 seconds ,(Repeat the same by implementing Runnable) 


class MyThread1 extends Thread {
    private String message;
    private int delay;

    public MyThread1(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        for (int i = 1; i <= 10; i++)
        {
        	
            System.out.println(message);
            
            try {
            	
                Thread.sleep(delay);
            } 
            catch (InterruptedException e) {
            	
                System.out.println(message + " Thread Interrupted");
            }
        }
    }
}



public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new MyThread1("Good Morning", 1000);
		Thread t2 = new MyThread1("Hello", 2000);
		Thread t3 = new MyThread1("Welcome", 3000);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
