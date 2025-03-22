package day2_Activity;

//6.Create a class called Employee that includes three pieces of information as instance variables a 
//first name (type String), a last name (type String) and a monthly salary (type double). Your class 
//should have a constructor that initializes the three instance variables. Provide a set and a get 
//method for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a 
//test application named EmployeeTest that demonstrates class Employee s capabilities. Create two 
//Employee objects and display the yearly salary for each Employee. Then give each Employee a 
//10% raise and display each Employee s yearly salary again.


class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            this.monthlySalary += (monthlySalary * percentage / 100);
        }
    }
}


public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Saurav", "Suman", 3000);
        Employee emp2 = new Employee("Aman", "Kumar", 4000);

        System.out.println("Initial Yearly Salaries:");
        System.out.printf(emp1.getFirstName() + " " + emp1.getLastName()+ ": " + emp1.getYearlySalary());
        System.out.printf(emp1.getFirstName() + " " + emp1.getLastName()+ ": " + emp1.getYearlySalary());

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("\nYearly Salaries After 10% Raise:");
        System.out.printf(emp1.getFirstName() + " " + emp1.getLastName()+ ": " + emp1.getYearlySalary());
        System.out.printf(emp1.getFirstName() + " " + emp1.getLastName()+ ": " + emp1.getYearlySalary());

	}

}
