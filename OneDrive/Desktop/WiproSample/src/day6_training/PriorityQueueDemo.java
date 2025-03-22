package day6_training;

import java.util.PriorityQueue;

/*
 * A PriorityQueue is used when the objects are supposed to be processed based on the 
 * priority. 
 * It is known that a Queue follows the First-In-First-Out algorithm, but sometimes 
 * the elements of the 
 * queue are needed to be processed according to the priority, that’s when the 
 * PriorityQueue comes into play. 
 * The PriorityQueue is based on the priority heap. The elements of the priority 
 * queue are ordered according to 
 * the ""natural ordering(COMPARABLE)"", 
 * or by a Comparator provided at queue construction time, depending on which 
 * constructor is used.  
 */
class Employee implements Comparable<Employee>
{

	private String name;
    private double salary;
    public Employee (String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    public String getName ()
    {
        return name;
    }
    public void setName (String name)
    {
        this.name = name;
    }
    public double getSalary ()
    {
        return salary;
    }
    public void setSalary (double salary)
    {
        this.salary = salary;
    }
    @Override 
    public String toString ()
    {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }
 // Compare two employee objects by their salary
    @Override 
    public int compareTo (Employee employee)
    {
        if (this.getSalary () > employee.getSalary ())
        {
         return 1;
        }
        else if (this.getSalary () < employee.getSalary ())
        {
         return -1;
        }
        else
        {
         return 0;
        }
    }

}
public class PriorityQueueDemo {
	public static void main(String[] args) {
		  // Create a PriorityQueue
        PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<>();
        // Add items to the Priority Queue
        employeePriorityQueue.add (new Employee ("Thananya", 100000.00));
        employeePriorityQueue.add (new Employee ("Priya", 145000.00));
        employeePriorityQueue.add (new Employee ("Devi", 115000.00));
        employeePriorityQueue.add (new Employee ("Abi", 167000.00));
        /*
        The compareTo() method implemented in the Employee class is used to 
        determine
        in what order the objects should be dequeued.
        (Low salary to High Salary(Ascending order))
         */
        while (!employeePriorityQueue.isEmpty ())
        {
         System.out.println ("Remove:::"+employeePriorityQueue.remove ());
        }
        System.out.println ("Size ?? "+employeePriorityQueue.size());

	}

}
/*
Remove:::Employee{name='Thananya', salary=100000.0}
Remove:::Employee{name='Devi', salary=115000.0}
Remove:::Employee{name='Priya', salary=145000.0}
Remove:::Employee{name='Abi', salary=167000.0}
Size ?? 0
*/