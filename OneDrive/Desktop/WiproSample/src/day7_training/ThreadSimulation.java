package day7_training;

class Employee13 extends Thread 
{
    private String name;

    public Employee13(String name) 
    {
        this.name = name;
    }
    @Override
    public void run() 
    {
        System.out.println(name + " is working.");
        try 
        {
            Thread.sleep(2000); // Simulating work by pausing for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name + " finished working.");
    }
}
class Student13 extends Thread {
    private String name;

    public Student13(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " is studying.");
        try {
            Thread.sleep(3000); // Simulating studying by pausing for 3 seconds
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name + " finished studying.");
    }
}
public class ThreadSimulation {
	public static void main(String[] args) {
        Employee13 emp1 = new Employee13("Thananya");
        Employee13 emp2 = new Employee13("Devi");
        Student13 stu1 = new Student13("Priya");
        Student13 stu2 = new Student13("Daya");

        // Start the threads
        emp1.start();
        emp2.start();
        stu1.start();
        stu2.start();

        try {
            // Wait for all threads to finish before printing "Main finished"
            emp1.join();
            emp2.join();
            stu1.join();
            stu2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main Thread finished.");

	}

}
/*
Thananya is working.
Devi is working.
Priya is studying.
Daya is studying.
Devi finished working.
Thananya finished working.
Daya finished studying.
Priya finished studying.
Main Thread finished.
*/