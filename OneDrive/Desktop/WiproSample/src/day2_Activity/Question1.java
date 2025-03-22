package day2_Activity;


//1.Create a class called Student with the following details: RollNo, StudName, MarksInEng, 
//MarksInMaths and MarksInScience. Write getters and setters for the all variables. RollNo
//should be automatically generated whenever a new student is added.
//
//Create a class called Standard with 8 students’ details and write separate method for each of 
//the following tasks and invoke the same.
//1. To display the entire roll no and the name of the students in the class in the ascending order of roll no.
//2. To display the roll no and the name of the student who has got the highest percentage.
//3. To display the roll no and the name of the student who scored highest mark 
//in mathematics.
//4. To display the roll no and the name of the student in the ascending order of the total marks in 
//mathematics and science alone.
//5. To display the roll no, name, total marks, percentage and rank of all the students in the 
//descending order of rank.


import java.util.*;

class Student {
    private static int rollCounter = 1;
    private int rollNo;
    private String studName;
    private int marksInEng;
    private int marksInMaths;
    private int marksInScience;

    public Student(String studName, int marksInEng, int marksInMaths, int marksInScience) {
        this.rollNo = rollCounter++;
        this.studName = studName;
        this.marksInEng = marksInEng;
        this.marksInMaths = marksInMaths;
        this.marksInScience = marksInScience;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getStudName() {
        return studName;
    }

    public int getMarksInEng() {
        return marksInEng;
    }

    public int getMarksInMaths() {
        return marksInMaths;
    }

    public int getMarksInScience() {
        return marksInScience;
    }

    public int getTotalMarks() {
        return marksInEng + marksInMaths + marksInScience;
    }

    public double getPercentage() {
        return getTotalMarks() / 3.0;
    }
}

class Standard {
    private Student[] students;
    private int studentCount;

    public Standard(int capacity) {
        students = new Student[capacity];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        }
    }

    public void displayRollNoAndNameAscending() {
        System.out.println("Roll No and Name in Ascending Order of Roll No:");
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - i - 1; j++) {
                if (students[j].getRollNo() > students[j + 1].getRollNo()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Roll No: " + students[i].getRollNo() + ", Name: " + students[i].getStudName());
        }
    }

    public void displayHighestPercentage() {
        Student topStudent = null;
        double maxPercentage = -1;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getPercentage() > maxPercentage) {
                maxPercentage = students[i].getPercentage();
                topStudent = students[i];
            }
        }
        System.out.println("Student with Highest Percentage:");
        System.out.println("Roll No: " + topStudent.getRollNo() + ", Name: " + topStudent.getStudName());
    }

    public void displayHighestInMaths() {
        Student topMathStudent = null;
        int maxMathMarks = -1;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getMarksInMaths() > maxMathMarks) {
                maxMathMarks = students[i].getMarksInMaths();
                topMathStudent = students[i];
            }
        }
        System.out.println("Student with Highest Marks in Mathematics:");
        System.out.println("Roll No: " + topMathStudent.getRollNo() + ", Name: " + topMathStudent.getStudName());
    }
    
    public void displayAscendingMathsAndScience() {
        System.out.println("Students in Ascending Order of Total Marks (Maths + Science):");
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - i - 1; j++) {
                int total1 = students[j].getMarksInMaths() + students[j].getMarksInScience();
                int total2 = students[j + 1].getMarksInMaths() + students[j + 1].getMarksInScience();
                if (total1 > total2) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < studentCount; i++) {
            int total = students[i].getMarksInMaths() + students[i].getMarksInScience();
            System.out.println("Roll No: " + students[i].getRollNo() + ", Name: " + students[i].getStudName() + ", Total (Maths + Science): " + total);
        }
    }

    public void displayRanks() {
        System.out.println("Students in Descending Order of Rank:");
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - i - 1; j++) {
                if (students[j].getPercentage() < students[j + 1].getPercentage()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Rank: " + (i + 1) + ", Roll No: " + students[i].getRollNo() + ", Name: " + students[i].getStudName() +
                    ", Total Marks: " + students[i].getTotalMarks() + ", Percentage: " + students[i].getPercentage());
        }
    }
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Standard standard = new Standard(8);
		
		standard.addStudent(new Student("Aman", 85, 90, 80));
        standard.addStudent(new Student("Binod", 78, 92, 85));
        standard.addStudent(new Student("Cheeku", 88, 76, 84));
        standard.addStudent(new Student("Dhara", 95, 89, 93));
        standard.addStudent(new Student("Eklavya", 65, 70, 75));
        standard.addStudent(new Student("Farhan", 90, 85, 88));
        standard.addStudent(new Student("Gaurav", 82, 88, 90));
        standard.addStudent(new Student("Harsh", 89, 91, 95));

        // Invoking tasks
        System.out.println();
        standard.displayRollNoAndNameAscending();

        System.out.println();
        standard.displayHighestPercentage();

        System.out.println();
        standard.displayHighestInMaths();

        System.out.println();
        standard.displayAscendingMathsAndScience();

        System.out.println();
        standard.displayRanks();
		
	}

}
