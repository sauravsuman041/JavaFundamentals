package day5_training;

import java.util.LinkedList;
import java.util.Queue;

class Student_1
{
    private String name;
    private String item;

    // Constructor
    public Student_1(String name, String item) {
        this.name = name;
        this.item = item;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getItem() {
        return item;
    }
}
public class Collection_Queue2 {
	
	private static void processPurchase(Student_1 student) 
	{
        System.out.println("Processing purchase for " + student.getName() + ": " + student.getItem());
    }
	public static void main(String[] args) {
		 Queue<Student_1> queue = new LinkedList<>();
		 
		queue.add(new Student_1("Devi", "Laptop"));
		queue.add(new Student_1("Thananya", "Textbook"));
		queue.add(new Student_1("Sara", "Headphones"));
		queue.add(new Student_1("Daya", "Printer"));

		 while (!queue.isEmpty()) 
		 {
			 Student_1 student = queue.poll();  // Retrieves and removes the student from the front of the queue
	         processPurchase(student);
	     }
	}
	

}
/*
Processing purchase for Devi: Laptop
Processing purchase for Thananya: Textbook
Processing purchase for Sara: Headphones
Processing purchase for Daya: Printer
*/
