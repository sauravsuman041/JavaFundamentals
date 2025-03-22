package day7_training;

class BankAccount1 //NORMAL JAVA CLASS
{
    private double balance;

    public BankAccount1(double initialBalance) 
    {
        this.balance = initialBalance;
    }
    // Synchronized method to ensure thread safety
    public synchronized void deposit(double amount) //preventing race conditions.
    {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
            System.out.println(Thread.currentThread().getName() + " Deposit Balance:: " + getBalance());            
        }
    }
    // Synchronized method to ensure thread safety
    public synchronized void withdraw(double amount) //preventing race conditions.
    {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
            System.out.println(Thread.currentThread().getName() + " Withdrew Balance:: " + getBalance());
            
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class ThreadSynchronization1 {
	public static void main(String[] args) {
        BankAccount1 account = new BankAccount1(1000); // Initial balance is 1000

        // Creating multiple threads to simulate concurrent deposit/withdraw operations
        //NO IMPLEMENTS OF Runnable Interface/run() explicitly!
        //Lambda Expression
        //NO Sleep() method
        Thread t1 = new Thread(() -> {
            account.deposit(500);//1000+500=>1500
            account.withdraw(200);//1500-200=>1300
        });

        Thread t2 = new Thread(() -> {
            account.deposit(300);//1300+300=>1600
            account.withdraw(100);//1600-100=>1500
        });

        t1.start();
        t2.start();

        try {
            t1.join(); // Wait for thread 1 to finish
            t2.join(); // Wait for thread 2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());

	}

}
/*
Thread-0 deposited: 500.0
Thread-0 Deposit Balance:: 1500.0
Thread-0 withdrew: 200.0
Thread-0 Withdrew Balance:: 1300.0
Thread-1 deposited: 300.0
Thread-1 Deposit Balance:: 1600.0
Thread-1 withdrew: 100.0
Thread-1 Withdrew Balance:: 1500.0
Final balance: 1500.0
*/
