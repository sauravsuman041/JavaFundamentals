package day9_training;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dbconnectionutilities.DBConnectionFactory_MYSQL;
/*
mysql> select * from wipro_employee;
ERROR 2006 (HY000): MySQL server has gone away
No connection. Trying to reconnect...
Connection id:    10
Current database: wipro

+------+----------+---------+------------+
| eno  | name     | salary  | dept       |
+------+----------+---------+------------+
| 1001 | Thananya | 23493.5 | Networking |
| 1002 | Devi     | 99493.5 | Testing    |
| 1003 | Abi      | 28493.5 | Training   |
| 1004 | Daya     | 96493.5 | Testing    |
| 1005 | Raja     | 93493.5 | Insurance  |
| 7800 | Raji     |   23290 | HR         |
| 3278 | Harini   |   49293 | HR         |
+------+----------+---------+------------+
7 rows in set (0.03 sec)

mysql> update wipro_employee set dept='Testing' where eno=3278;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from wipro_employee;
+------+----------+---------+------------+
| eno  | name     | salary  | dept       |
+------+----------+---------+------------+
| 1001 | Thananya | 23493.5 | Networking |
| 1002 | Devi     | 99493.5 | Testing    |
| 1003 | Abi      | 28493.5 | Training   |
| 1004 | Daya     | 96493.5 | Testing    |
| 1005 | Raja     | 93493.5 | Insurance  |
| 7800 | Raji     |   23290 | HR         |
| 3278 | Harini   |   49293 | Testing    |
+------+----------+---------+------------+
7 rows in set (0.00 sec)*/
public class JDBC_UpdateDemo {

	public static void main(String[] args) throws SQLException {
		//getting the db connection from external file
		Connection con=DBConnectionFactory_MYSQL.mydbconnect_123();

		Scanner s1=new Scanner(System.in);
		System.out.println("Eno:: ");
		int a=s1.nextInt();
		s1.nextLine();
		System.out.println("Incentive/Hike/Appraisal/Allowance:: ");
		float c=s1.nextFloat();

		String query1="update wipro_employee set salary=salary+? where eno=?";//i=i+1
		PreparedStatement ps1=con.prepareStatement(query1);
		ps1.setFloat(1, c);//1 refers first question mark
		ps1.setInt(2, a); 
		
		int rows=ps1.executeUpdate();//either 0 or any value
		if(rows>=1)
		{
			System.out.println("Record Exist!");
			System.out.println(rows+ " Record Updated!");
		}
		else
		{
			System.out.println("Record Not Exist!");
		System.out.println(rows+ " Record Updated!");			
		}		
		
		PreparedStatement ps11=con.prepareStatement("select * from wipro_employee");//SQL 2
		ResultSet rs=ps11.executeQuery();
		while(rs.next())
		{
			int a1=rs.getInt("eno");
			String b1=rs.getString(2);//2nd column=>name
			float c1=rs.getFloat("salary");
			String d1=rs.getString(4);//dept
			System.out.println(a1+ " "+b1 + " "+c1+ " "+d1);
		}	
		rs.close();
		con.close();//release DB connection


	}

}
/*
DB Connection success!
Eno:: 
56456
Incentive/Hike/Appraisal/Allowance:: 
8000
Record Not Exist!
0 Record Updated!
1001 Thananya 23493.5 Networking
1002 Devi 99493.5 Testing
1003 Abi 28493.5 Training
1004 Daya 96493.5 Testing
1005 Raja 93493.5 Insurance
7800 Raji 23290.0 HR
3278 Harini 49293.0 Testing
*/

/*
DB Connection success!
Eno:: 
7800
Incentive/Hike/Appraisal/Allowance:: 
10000
Record Exist!
1 Record Updated!
1001 Thananya 23493.5 Networking
1002 Devi 99493.5 Testing
1003 Abi 28493.5 Training
1004 Daya 96493.5 Testing
1005 Raja 93493.5 Insurance
7800 Raji 33290.0 HR
3278 Harini 49293.0 Testing
*/
