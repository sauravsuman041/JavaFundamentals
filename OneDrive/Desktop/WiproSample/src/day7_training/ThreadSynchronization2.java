package day7_training;


//Helper class
class Bank11 
{
static int total = 100;

static synchronized void withdrawn(String name,int withdrawal)
{
	// Withdraw only if total money
	 // greater than or equal to the money requested for
	 // withdrawal
  if (total >= withdrawal) 
  {
      System.out.println(name + " withdrawn "+ withdrawal);
      total = total - withdrawal;
      System.out.println("Balance after withdrawal: "+ total);
      /* Making the thread sleep for 1 second after
           each withdrawal.*/
      try {
          Thread.sleep(1000);
      }
      catch (InterruptedException e) {
          e.printStackTrace();
      }
  }

  // If the money requested for withdrawal is greater
  // than the balance then deny transaction
  else 
  {
      System.out.println(name + " you can not withdraw "+ withdrawal + " "+"Insufficent fund!!!!");
      System.out.println("your balance is: " + total);
      try {

          Thread.sleep(5000);//5seconds
      }

      catch (InterruptedException e) {
          e.printStackTrace();
      }
  }
}
//Method - Deposit method
//Accepting money whenever deposited
static synchronized void deposit(String name,int deposit)
{
  System.out.println(name + " deposited " + deposit);
  total = total + deposit;
  System.out.println("Balance after deposit: "+ total);
  try {
      Thread.sleep(1000);
  }
  catch (InterruptedException e) 
  {
      e.printStackTrace();
  }
}
}

//Method - Withdraw
//It is called from ThreadWithdrawal class using
//the object of Bank class passed from the main method
class ThreadWithdrawal1 extends Thread 
{

Bank11 object;
String name;
int dollar;

ThreadWithdrawal1(Bank11 ob, String name, int money)
{
 this.object = ob;
 this.name = name;
 this.dollar = money;
}

//run() method for the thread
public void run() 
{ 
	 object.withdrawn(name, dollar); 
}
}

//Deposit method is called from ThreadDeposit class using
//the object of Bank class passed from the main method*/

//Class 2
//Helper class extending Thread class
class ThreadDeposit1 extends Thread 
{
Bank11 object;
String name;
int dollar;
ThreadDeposit1(Bank11 ob, String name, int money)
{
 this.object = ob;
 this.name = name;
 this.dollar = money;
}
public void run() { 
	object.deposit(name, dollar); 
}
}

public class ThreadSynchronization2 {

	 public static void main(String[] args)throws Throwable
	 {
	 // Declaring an object of Bank class and passing the
	     // object along with other parameters to the
	     // ThreadWithdrawal and ThreadDeposit class. This
	     // will be required to call withdrawn and deposit
	     // methods from those class

	     Bank11 obj = new Bank11();

	     // Creating threads=>Initial amt is 100
	     ThreadWithdrawal1 t1 = new ThreadWithdrawal1(obj, "Thananya", 20);
	     ThreadWithdrawal1 t2 = new ThreadWithdrawal1(obj, "Devi", 40);
	     ThreadDeposit1 t3  = new ThreadDeposit1(obj, "Abi", 35);
	     ThreadWithdrawal1 t4 = new ThreadWithdrawal1(obj, "Priya", 80);
	     ThreadWithdrawal1 t5 = new ThreadWithdrawal1(obj, "Raja", 40);

	     t1.start();
	     t2.start();
	     t3.start();
	     t4.start();
	     t5.start();
	 
	     t1.join();
	     t2.join();
	     t3.join();
	     t4.join();
	     t5.join();

	     System.out.println("Main Thread Over!");

	}

}
/*
Thananya withdrawn 20
Balance after withdrawal: 80
Priya withdrawn 80
Balance after withdrawal: 0
Raja you can not withdraw 40 Insufficent fund!!!!
your balance is: 0
Abi deposited 35
Balance after deposit: 35
Devi you can not withdraw 40 Insufficent fund!!!!
your balance is: 35
Main Thread Over!
*/