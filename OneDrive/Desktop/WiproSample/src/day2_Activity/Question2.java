package day2_Activity;

//2. Create a class called Worker. Write classes DailyWorker and SalariedWorker that inherit from
//Worker. Every worker has a name and a salaryrate. Write method Pay (int hours) to compute 
//the week pay of every worker.  A Daily worker is paid on the basis of the number of days 
//she/he works. The salaried worker gets paid the wage for 40 hours a week no matter what the
//actual hours are.  Test this program to calculate the pay of workers. 


class Worker {
    private String name;
    private double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public String getName() {
        return name;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public double pay(int hours) {
        return 0;
    }
}

class DailyWorker extends Worker {

    public DailyWorker(String name, double dailyRate) {
        super(name, dailyRate);
    }

    @Override
    public double pay(int hours) {
        int daysWorked = hours / 8;
        return getSalaryRate() * daysWorked;
    }
}

class SalariedWorker extends Worker {

    public SalariedWorker(String name, double weeklyRate) {
        super(name, weeklyRate);
    }

    @Override
    public double pay(int hours) {
        return getSalaryRate();
    }
}



public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker dailyWorker = new DailyWorker("Alice", 100);
        Worker salariedWorker = new SalariedWorker("Bob", 500);

        System.out.println("Daily Worker:");
        System.out.println("Name: " + dailyWorker.getName());
        System.out.println("Pay for 40 hours: " + dailyWorker.pay(40));
        System.out.println("Pay for 56 hours: " + dailyWorker.pay(56));

        System.out.println("\nSalaried Worker:");
        System.out.println("Name: " + salariedWorker.getName());
        System.out.println("Pay for 40 hours: " + salariedWorker.pay(40));
        System.out.println("Pay for 56 hours: " + salariedWorker.pay(56));

	}

}
