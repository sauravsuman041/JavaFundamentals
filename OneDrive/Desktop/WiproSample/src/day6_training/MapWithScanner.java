package day6_training;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Empss
{
	int eno;
	String ename;
	float salary;
	public Empss(int eno, String ename, float salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Value:: "+getEno() + " "+getEname() + " "+ getSalary();
	}
}

public class MapWithScanner {
	public static int menu()
	{
	 System.out.println("Choose one option from following : ");
	  	System.out.println("1) Add a new employee INTO MAP.");
	  	System.out.println("2) List all employees from MAP.");
	  	System.out.println("3) Exit.");
	  	Scanner sc = new Scanner(System.in);
	  	return sc.nextInt();//1,2,3
	}
	public static void main(String[] args) {
		HashMap<Integer, Empss> employeesByKey = new HashMap<Integer, Empss>();
		int menuStore = menu();//calling the static method menu()
		while(menuStore != 3)
		{
			switch (menuStore)
			  {
			  case 1:
				    Scanner input1 = new Scanner(System.in);
			 	      System.out.println("Enter Eno: ");
			 	      int str1 = input1.nextInt();
			 	      input1.nextLine();
				      System.out.println("Enter Name: ");
				      String str2 = input1.nextLine();
				      System.out.println("Enter Salary: ");
				      float str3 = input1.nextFloat();
				      
				      Empss newEmp = new Empss(str1, str2, str3);
				      //ENO=>KEY,ENO,NAME,SALARY=>VALUE
				      employeesByKey.put(newEmp.getEno(), newEmp);//((((((((important
				      break;
			  case 2:
					for(Map.Entry<Integer, Empss> s1: employeesByKey.entrySet())
					{
						System.out.println("Key&Value:: "+s1.getKey() + " "+s1.getValue());
					}
					System.out.println("");
					break;
			  case 3:
				  break;//exit the program
							    
			  }
			  menuStore=menu();				
			}
		

		
	}

}
/*
Choose one option from following : 
1) Add a new employee INTO MAP.
2) List all employees from MAP.
3) Exit.
1
Enter Eno: 
100
Enter Name: 
Devi
Enter Salary: 
21435
Choose one option from following : 
1) Add a new employee INTO MAP.
2) List all employees from MAP.
3) Exit.
1
Enter Eno: 
101
Enter Name: 
Abi
Enter Salary: 
14913
Choose one option from following : 
1) Add a new employee INTO MAP.
2) List all employees from MAP.
3) Exit.
1
Enter Eno: 
102
Enter Name: 
Raja
Enter Salary: 
12492
Choose one option from following : 
1) Add a new employee INTO MAP.
2) List all employees from MAP.
3) Exit.
1
Enter Eno: 
103
Enter Name: 
Thananya
Enter Salary: 
34923
Choose one option from following : 
1) Add a new employee INTO MAP.
2) List all employees from MAP.
3) Exit.
2
Key&Value:: 100 Value:: 100 Devi 21435.0
Key&Value:: 101 Value:: 101 Abi 14913.0
Key&Value:: 102 Value:: 102 Raja 12492.0
Key&Value:: 103 Value:: 103 Thananya 34923.0

Choose one option from following : 
1) Add a new employee INTO MAP.
2) List all employees from MAP.
3) Exit.
*/
