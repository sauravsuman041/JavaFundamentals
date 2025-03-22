package day4_Activity;

//12.Create a class by name Employee with members   Employee ID, Name and year of birth. 
//The Employee ID is a string that contains the ID in the formatyear-designation-number. 
//The year is represented with the last two digits. The designation is a single letter 
//code - 'F' for faculty and 'S' for staff.
//
//The number is a 3 digit number.(Example:81-F-112     79-S-254)
//
//Write a program to read the employee details and validate the employee code.
//If the employee code is incorrect throw a user-defined exception"InvalidEmployeeCode" 
//else create the Employee object and display the details of the employee.


class InvalidEmployeeCode extends Exception {
    public InvalidEmployeeCode(String message) {
        super(message);
    }
}

class Employeesss {
    private String employeeId;
    private String name;
    private int yearOfBirth;

    public Employeesss(String employeeId, String name, int yearOfBirth) throws InvalidEmployeeCode {
        if (!validateEmployeeCode(employeeId)) {
            throw new InvalidEmployeeCode("Invalid Employee Code: " + employeeId);
        }
        this.employeeId = employeeId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    private boolean validateEmployeeCode(String code) {
        
    	String regex = "\\d{2}-[FS]-\\d{3}";
        return code.matches(regex);
    }

    public void displayDetails() {
        
    	System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);
    }
}


public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

            String employeeId = "81-F-112";
            String name = "John Doe";
            int yearOfBirth = 1981;

            Employeesss emp = new Employeesss(employeeId, name, yearOfBirth);

            emp.displayDetails();
        } 
		catch (InvalidEmployeeCode e) 
		{
            System.out.println("Error: " + e.getMessage());
        }
	}

}
