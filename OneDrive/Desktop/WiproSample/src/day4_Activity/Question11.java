package day4_Activity;

//11.Create a class with following specifications.                                                                         
//Class Emp                                                                                                           
//           
//empId              int                   
//empName        string      
//designation      string             
//basic                double              
//hra                   double readOnly
//
//Methods
//printDET()
//printDET() methods will show details of the EMP.                                             
//calculateHRA() method will calculate HRA based on basic.
//
//There will 3 designations supported by the application.                                                                                            
//If designation  is  Manager   - HRA will be 10% of BASIC
//if designation  is  TeamLeader   - HRA will be 12% of BASIC
//if category is "HR"  - HRA will be 5% of BASIC
//
//Have constructor to which you will pass, empId, designation, basic and price.
//
//And checks whether the BASIC is less than 50000 or not. If it is less than 50000 raise a 
//custom Exception as given below
//
//Create LowSalException class with proper user message to handle BASIC less than 50000.  

class LowSalException extends Exception {
    public LowSalException(String message) {
        super(message);
    }
}

class Emp {
    private int empId;
    private String empName;
    private String designation;
    private double basic;
    private double hra;

    public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
        if (basic < 50000) {
            throw new LowSalException("Basic salary cannot be less than 50000.");
        }

        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;

        calculateHRA();
    }

    private void calculateHRA() {
        switch (designation) {
            case "Manager":
                hra = basic * 0.10;
                break;
            case "TeamLeader":
                hra = basic * 0.12;
                break;
            case "HR":
                hra = basic * 0.05;
                break;
            default:
                hra = 0;
                System.out.println("Invalid designation. HRA set to 0.");
        }
    }

    public void printDET() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
    }
}

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

            Emp emp1 = new Emp(101, "Saurav Suman", "Manager", 60000);
            emp1.printDET();

            System.out.println();

            Emp emp2 = new Emp(102, "Aman Kumar", "HR", 45000);
            emp2.printDET();
        } 
		catch (LowSalException e) {
			
            System.out.println("Error: " + e.getMessage());
        }

	}

}
