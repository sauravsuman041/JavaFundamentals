package day9_training;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dbconnectionutilities.DBConnectionFactory_MYSQL;

//POJO=>Plain Old Java Object=>helper class=>getter and setter methods
class Employee_POJO 
{
	int empno;
	String empname;
	float empsalary;
	String empdept;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
}
//(JDBC)MYSQL+COLLECTION
public class JDBC_CollectionDemo {
	public static void main(String[] args) throws Exception{
		//fetching the db connection from the external file!
		Connection con=DBConnectionFactory_MYSQL.mydbconnect_123();
		Statement s1=con.createStatement();
		ResultSet rs=s1.executeQuery("select * from wipro_employee");
		ArrayList<Employee_POJO> obj1=new ArrayList<Employee_POJO>();
		while(rs.next())
		{
			Employee_POJO e1=new Employee_POJO();//pojo class object
			e1.setEmpno(rs.getInt(1));//eno
			e1.setEmpname(rs.getString(2));//name
			e1.setEmpsalary(rs.getFloat(3));//salary
			e1.setEmpdept(rs.getString(4));//dept
			obj1.add(e1);//************adding MYSQL table records to arraylist
		}
		System.out.println("Eno\tName\tSalary\tDept");
		for(Employee_POJO obj:obj1)//passing arraylist object
		{
	System.out.println(obj.getEmpno() + " "+obj.getEmpname() + " "+obj.getEmpsalary() + " "+obj.getEmpdept());
			
		}
		System.out.println("Arraylist Size:: "+obj1.size());//no of records in mysql table

	}

}
/*
DB Connection success!
Eno	Name	Salary	Dept
1001 Thananya 23493.5 Networking
1002 Devi 99493.5 Testing
1003 Abi 28493.5 Training
1004 Daya 96493.5 Testing
1005 Raja 93493.5 Insurance
7800 Raji 33290.0 HR
Arraylist Size:: 6
*/
