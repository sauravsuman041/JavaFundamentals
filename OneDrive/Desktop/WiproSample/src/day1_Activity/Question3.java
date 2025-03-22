package day1_Activity;

//3.The total number of students in a class are 90 out of which 45 are boys.
//  If 50% of the total students secured grade 'A' out of which 20 are boys, 
//  then write a program to calculate the total number of girls getting grade 'A'.

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalStudents = 90;
		 int studentsWithGradeA = 90/2;
		 int boysWithGradeA = 20;
		 int girlsWithGradeA = studentsWithGradeA - boysWithGradeA;
		 
		 System.out.println("No of girls with Grade A is : " + girlsWithGradeA);

	}

}
