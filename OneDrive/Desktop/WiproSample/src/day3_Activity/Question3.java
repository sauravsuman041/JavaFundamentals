package day3_Activity;

import java.util.Scanner;

//3.The following are the superclass Bank and its subclasses Saving and Current.
//Super class : Bank
//public class Bank 
//{
//String accNo;  //customer account number with Bank
//String custName; //customer name
//int custGender;  //customer gender 1 = Male, 2 =Female
//String custJob;  //customer job positions
//double curBal;  //customer balance in the bank account
//public String toString();
//public abstract double calcBalance();
//}
//
//Subclass : Saving
//public class Saving 
//{
//double savRate;  //percent interest rate per year
//}
//
//Subclass : Current
//public class Current
//{
//boolean fixedDep;  //whether the customer keeps the fixed// deposit with the bank of not
//double curRate;  //percent interest rate per year
//}
//
//The  above  classes  show  that  Bank  can  have  two  different  types  of  account  which  are Saving  and  Current  account.
//  The  balance amount  in the  bank for  each account  is based on the following calculation :
//
//Saving :Balance =  current balance + (savRate * current balance)
//Current :Balance = current balance + (curRate * current balance)
//
//If the customer has a fixed deposit with the bank, then the bank will charge RM150for the service fee.  
//The amount will be deducted automatically yearly.
//
//a)  Write a method of calcBalance() for both subclasses.
//b)  Search  a  customer  based  on  the  account  number  entered  then  display  detailinformation  of  him/her.  If  the  customer  account  number  is  not  found,  display  anappropriate message.
//c)  Count how many customers that have the current account with the bank and the totalbalance.  

abstract class Bank {
    String accNo; // Customer account number
    String custName; // Customer name
    int custGender; // Customer gender: 1 = Male, 2 = Female
    String custJob; // Customer job position
    double curBal; // Current balance in the bank account

    public Bank(String accNo, String custName, int custGender, String custJob, double curBal) {
        this.accNo = accNo;
        this.custName = custName;
        this.custGender = custGender;
        this.custJob = custJob;
        this.curBal = curBal;
    }

    public abstract double calcBalance();

    @Override
    public String toString() {
        return "Account No: " + accNo + "\n" +
               "Name: " + custName + "\n" +
               "Gender: " + (custGender == 1 ? "Male" : "Female") + "\n" +
               "Job: " + custJob + "\n" +
               "Balance: " + calcBalance();
    }
}

class Saving extends Bank {
    double savRate; 
    
    public Saving(String accNo, String custName, int custGender, String custJob, double curBal, double savRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.savRate = savRate;
    }

    
    @Override
    public double calcBalance() {
        return curBal + (savRate * curBal);
    }
}

class Current extends Bank {
    boolean fixedDep; 
    double curRate; 

    
    public Current(String accNo, String custName, int custGender, String custJob, double curBal, boolean fixedDep, double curRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.fixedDep = fixedDep;
        this.curRate = curRate;
    }

    @Override
    public double calcBalance() {
        double balance = curBal + (curRate * curBal);
        if (fixedDep) {
            balance -= 150; 
        }
        return balance;
    }
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank customers[] = {
				new Saving("S001", "Saurav", 2, "Engineer", 5000, 0.05),
				new Current("C001", "Binod", 1, "Manager", 7000, true, 0.03),
				new Current("C002", "Aman", 1, "Teacher", 4000, false, 0.02)
		};
		
		Scanner sc = new Scanner(System.in);
		
		//sc.nextLine();

        System.out.print("Enter account number to search: ");
        String accNo = sc.nextLine();
        boolean found = false;

        for (Bank customer : customers) {
            if (customer.accNo.equals(accNo)) {
                System.out.println("Customer details:");
                System.out.println(customer);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No customer found with account number: " + accNo);
        }
        
        
        int currentAccountCount = 0;
        double totalBalance = 0;

        for (Bank customer : customers) {
            if (customer instanceof Current) {
                currentAccountCount++;
                totalBalance += customer.calcBalance();
            }
        }

        System.out.println("\nNumber of customers with current accounts: " + currentAccountCount);
        System.out.println("Total balance of current accounts: " + totalBalance);

	}

}
