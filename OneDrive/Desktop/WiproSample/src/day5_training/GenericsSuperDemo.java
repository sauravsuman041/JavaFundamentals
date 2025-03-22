package day5_training;

import java.util.ArrayList;
import java.util.List;

class Student22 
{
    String name;
    
    public Student22(String name) {
        this.name = name;
    }
    
    public void display() {
        System.out.println("Student: " + name);
    }
}
class GraduateStudent extends Student22 
{
    public GraduateStudent(String name) 
    {
        super(name);
    }
    
    @Override
    public void display() {
        System.out.println("Graduate Student: " + name);
    }
}
class UndergraduateStudent extends Student22 
{
    public UndergraduateStudent(String name) 
    {
        super(name);
    }
    
    @Override
    public void display() {
        System.out.println("Undergraduate Student: " + name);
    }
}
public class GenericsSuperDemo {
	//The super wildcard is used to indicate that the list can accept not just GraduateStudent but also Student or any superclass of GraduateStudent
	public static void printStudentNames(List<? super GraduateStudent> list) // list can hold GraduateStudent or any superclass of GraduateStudent (including Student).
	{
        for (Object obj : list) 
        {
            if (obj instanceof Student22) 
            {
                ((Student22) obj).display();  // Safe cast since the list contains Student or its superclasses
            }
        }
    }
    public static void main(String[] args) 
	{
		 List<Student22> students = new ArrayList<>();
		 students.add(new GraduateStudent("Thananya"));
		 students.add(new UndergraduateStudent("Devi"));
	     
		 printStudentNames(students);
	}
}
/*
 * Graduate Student: Thananya
Undergraduate Student: Devi
*/