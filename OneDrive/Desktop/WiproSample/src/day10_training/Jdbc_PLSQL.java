package day10_training;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import dbconnectionutilities.DBConnectionFactory_MYSQL;

/*
 * A stored procedure is a prepared SQL code that you can save, so the code can be reused over and over again.
 * A procedure (often called a stored procedure) is a collection of pre-compiled SQL statements stored inside the database. 
 * 
 * mysql> delimiter //

mysql>  create procedure wiproinsert(in a int, in b varchar(20),in c float, in d varchar(20))
    ->      begin
    ->      insert into wipro_employee(eno, name, salary, dept) values (a,b,c,d);
    ->      end
    -> //
Query OK, 0 rows affected (0.03 sec)

mysql> call wiproinsert (3888,'Harshini',439429.30,'HR')
    -> //
Query OK, 1 row affected (0.01 sec)

mysql> select * from wipro_employee;
    -> //
+------+----------+---------+------------+
| eno  | name     | salary  | dept       |
+------+----------+---------+------------+
| 1001 | Thananya | 23493.5 | Networking |
| 1002 | Devi     | 99493.5 | Testing    |
| 1003 | Abi      | 28493.5 | Training   |
| 1004 | Daya     | 96493.5 | Testing    |
| 1005 | Raja     | 93493.5 | Insurance  |
| 7800 | Raji     |   33290 | HR         |
| 3888 | Harshini |  439429 | HR         |
+------+----------+---------+------------+
7 rows in set (0.00 sec)

mysql> delimiter ;
mysql> select * from wipro_employee;
+------+----------+---------+------------+
| eno  | name     | salary  | dept       |
+------+----------+---------+------------+
| 1001 | Thananya | 23493.5 | Networking |
| 1002 | Devi     | 99493.5 | Testing    |
| 1003 | Abi      | 28493.5 | Training   |
| 1004 | Daya     | 96493.5 | Testing    |
| 1005 | Raja     | 93493.5 | Insurance  |
| 7800 | Raji     |   33290 | HR         |
| 3888 | Harshini |  439429 | HR         |
+------+----------+---------+------------+
7 rows in set (0.00 sec)
 */
public class Jdbc_PLSQL {

	public static void main(String[] args) throws Exception{
		//fetching the db connection from the external file!
		Connection con=DBConnectionFactory_MYSQL.mydbconnect_123();

		Scanner s1 = new Scanner(System.in);
		System.out.println("Eno:: ");
		int a = s1.nextInt();
		s1.nextLine();
		System.out.println("Name:: ");
		String b = s1.nextLine();
		System.out.println("Salary:: ");
		float c = s1.nextFloat();
		System.out.println("Dept:: ");
		String d = s1.next();

		//PLSQL=>CallableStatement interface will executed stored procedure/STORED FUNCTIONS(PLSQL BLOCK CODE)
		//call is similar to execute
		//NO INSERT COMMAND
		CallableStatement cs=con.prepareCall("{call wiproinsert(?,?,?,?)}");
		cs.setInt(1,a);
		cs.setString(2, b);
		cs.setFloat(3, c);
		cs.setString(4, d);
		
		int rows=cs.executeUpdate();
		System.out.println(rows + "Record Inserted!");

		System.out.println("Eno\tName\tSalary\tDept");
		
		PreparedStatement ps11=con.prepareStatement("select * from wipro_employee");
		//EXECUTEQUERY METHOD MAINLY FOR SELECT STATEMENTS!
		ResultSet rs=ps11.executeQuery();
		while(rs.next())
		{
			int a1=rs.getInt("eno");
			String b1=rs.getString(2);//2nd column=>name
			float c1=rs.getFloat("salary");
			String d1=rs.getString(4);//4th column=>dept
			System.out.println(a1+ " "+b1 + " "+c1);
		}
		rs.close();
		con.close();//release DB connection


		

	}

}