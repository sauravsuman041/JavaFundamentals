package day10_training;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

import dbconnectionutilities.DBConnectionFactory_MYSQL;

/*
 * MySQL procedure parameter has one of three modes:

IN parameter::

It is the default mode. It takes a parameter as input, such as an attribute. 
When we define it, the calling program has to pass an argument to the stored procedure.
 This parameter's value is always protected.

OUT parameters::

It is used to pass a parameter as output. Its value can be changed inside the stored procedure, 
and the changed (new) value is passed back to the calling program. It is noted that a procedure cannot 
access the OUT parameter's initial value when it starts.

INOUT parameters::

It is a combination of IN and OUT parameters. It means the calling program can pass the argument, 
and the procedure can modify the INOUT parameter, and then passes the new value back to the calling program.
 */
/*
 * mysql> delimiter $$
mysql> create procedure wiproproceduredisplay(in empid int,out emp_name varchar(20),out emp_salary float)
    -> begin
    -> select name,salary into emp_name,emp_salary from wipro_employee where eno=empid;
    -> end
    -> $$
Query OK, 0 rows affected (0.00 sec)

mysql> call wiproproceduredisplay(7348,@abc,@xyz)$$
Query OK, 1 row affected (0.00 sec)

mysql> select @abc,@xyz $$
+--------+--------+
| @abc   | @xyz   |
+--------+--------+
| Sachin | 343293 |
+--------+--------+
1 row in set (0.00 sec)

mysql> select @abc as EmployeeName,@xyz as EmployeeSalary $$
+--------------+----------------+
| EmployeeName | EmployeeSalary |
+--------------+----------------+
| Sachin       |         343293 |
+--------------+----------------+
1 row in set (0.00 sec)
 */
public class JDBC_PLSQL2 {

	public static void main(String[] args) throws Exception{
		//fetching the db connection from the external file!
		Connection con=DBConnectionFactory_MYSQL.mydbconnect_123();
		CallableStatement ct=con.prepareCall("{call wiproproceduredisplay(?,?,?)}");

/*
 --All OUT parameters must be registered before 
 a stored procedure is executed.
	void registerOutParameter(int parameterIndex, int sqlType) 
	throws SQLException

 */
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Eno::");
		int a=s1.nextInt();
		ct.setInt(1, a);//in
		ct.registerOutParameter(2,java.sql.Types.VARCHAR);//out parameter=>name
		ct.registerOutParameter(3,java.sql.Types.FLOAT);//out parameter=>salary
		ct.executeQuery();
		String name1=ct.getString(2);//out parameter=>name
		float salary1=ct.getFloat(3);//out parameter=>salary
		System.out.println("Name:: "+name1+ " "+salary1);
		con.close();	
	
	}

}
/*
mysql> select * from wipro_employee;
-> $$
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
| 7348 | Sachin   |  343293 | HR         |
+------+----------+---------+------------+
8 rows in set (0.00 sec)*/

/*
DB Connection success!
Enter Eno::
7348
Name:: Sachin 343293.0
*/
