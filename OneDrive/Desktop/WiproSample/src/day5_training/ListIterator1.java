package day5_training;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * Iterator													ListIterator
Introduced in Java 1.2.										Introduced in Java 1.2.
It is an Iterator for whole Collection API.					It is an Iterator for only List implemented classes.
It is an Universal Iterator.								It is NOT an Universal Iterator.
It supports only Forward Direction Iteration.				It supports both Forward and Backward Direction iterations.
It’s a Uni-Directional Iterator.							It’s a Bi-Directional Iterator.
It supports only READ and DELETE operations.				It supports all CRUD operations.
We can get Iterator by using iterator() method.				We can get ListIterator object using listIterator() method.
 */
class Employee_2 {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee_2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class ListIterator1 {

	public static void main(String[] args) {
		List<Employee_2> employees = new ArrayList<>();
        employees.add(new Employee_2(1, "Thananya", 50000));
        employees.add(new Employee_2(2, "Devi", 60000));
        employees.add(new Employee_2(3, "Abi", 55000));

        ListIterator<Employee_2> iterator = employees.listIterator();
        System.out.println("Forward Iteration:");
        while (iterator.hasNext())
        {
        	Employee_2 employee = iterator.next();
            System.out.println(employee);//toString()
        }
        
        System.out.println("\nBackward Iteration:");
        while (iterator.hasPrevious())
        {
        	Employee_2 employee = iterator.previous();
            System.out.println(employee);
        }
        System.out.println("\nModifying salary of employee 'Devi' during iteration:");
        
        iterator = employees.listIterator(); // Reset iterator
        while (iterator.hasNext()) 
        {
        	Employee_2 employee = iterator.next();
            if (employee.getName().equals("Devi")) 
            {
                iterator.set(new Employee_2(employee.getId(), employee.getName(), 70000)); // Update salary
            }
        }
        
        System.out.println("\nModified list of employees:");
        for (Employee_2 employee : employees) 
        {
            System.out.println(employee);
        }
	}

}
/*
 * Forward Iteration:
Employee{id=1, name='Thananya', salary=50000.0}
Employee{id=2, name='Devi', salary=60000.0}
Employee{id=3, name='Abi', salary=55000.0}

Backward Iteration:
Employee{id=3, name='Abi', salary=55000.0}
Employee{id=2, name='Devi', salary=60000.0}
Employee{id=1, name='Thananya', salary=50000.0}

Modifying salary of employee 'Devi' during iteration:

Modified list of employees:
Employee{id=1, name='Thananya', salary=50000.0}
Employee{id=2, name='Devi', salary=70000.0}
Employee{id=3, name='Abi', salary=55000.0}
*/
