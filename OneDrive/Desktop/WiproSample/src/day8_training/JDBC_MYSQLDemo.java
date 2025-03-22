package day8_training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



//FRONTEND(JAVA)+BACKEND(MYSQL) INTEGRATION::::
/*
 * Database Drivers:::
 * 
▪ Database Drivers or JDBC Drivers are required to 
connect to different databases. The JDBC requires 
different drivers for each database
▪ JDBC drivers provide the connection to the 
database and implement the protocol necessary 
for sending queries and retrieving results
 */
/*
 * Database Drivers Types:::
 * 
Type 1 JDBC ODBC Bridge + ODBC Driver::

▪ Translates all JDBC calls into ODBC (Open Database Connectivity)
▪ Need to have ODBC client installed on the machine
In Java 8, the JDBC-ODBC Bridge has been removed.

Type 2 Native API / Partly Java technology enabled driver:::

--Converts JDBC calls into db-specific calls 
▪ Communicates directly with the db server
▪ Requires some binary code be present on the client machine. 
▪ Better performance than type 1 driver

Type 3 Pure Java Driver for Database Middleware::

Net-protocol – 100% Java driver follows a three-tiered approach
▪ JDBC database requests passed to the middle-tier server
▪ Middle-tier server translates the request to the database-specific native-connectivity interface 
▪ May use a type 1 or type 2 JDBC driver 
▪ Request forwarded to the database server

Type 4 Direct to Database Pure Java Driver::
		--Native protocol 100% Java
		--Converts JDBC calls into the vendor specific DBMS protocol
		--Client applications communicate directly with the database server	
		--Best performance
		--Need a different driver for each database
 */
/*
 * JDBC::
 * --java.sql packaage
 * --Type 4 driver is used!
 * 1.Establish the DB connection
 * 2.Execute SQL statements
 * 3.Retrieve the results
 * 4.Close DB CONNECTION
 */
/*
* Connection - Interface::
* 
* A Connection is a session between a Java application and a database. 
* It helps to establish a connection with the database.
* By default, connection commits the changes after executing queries.
* 
* DriverManager - java Class
* 
* The DriverManager class acts as an interface between users and drivers. It keeps track of the drivers that are available and handles establishing a 
* connection between a database and the appropriate driver. I
* 
* Statement - Interface::
* The Statement interface provides methods to execute SQL queries with the database.
* 
* ResultSet - Interface:::
* The object of ResultSet maintains a cursor pointing to a row of a table. 
* Initially, cursor points to before the first row.

By default, ResultSet object can be moved forward only
* 
*/
/*
 * C:\Users\Administrator>mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 2
Server version: 5.7.39-log MySQL Community Server (GPL)

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| comcast2023        |
| comcast_march      |
| mysql              |
| performance_schema |
| sys                |
| vwits              |
| vwits2024          |
+--------------------+
8 rows in set (0.14 sec)

mysql> create database wipro;
Query OK, 1 row affected (0.01 sec)

mysql> use wipro;
Database changed
mysql> create table purchase(purchaseid int,itemname varchar(20),price float);
Query OK, 0 rows affected (0.07 sec)

mysql> describe purchase;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| purchaseid | int(11)     | YES  |     | NULL    |       |
| itemname   | varchar(20) | YES  |     | NULL    |       |
| price      | float       | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
3 rows in set (0.01 sec)

mysql> desc purchase;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| purchaseid | int(11)     | YES  |     | NULL    |       |
| itemname   | varchar(20) | YES  |     | NULL    |       |
| price      | float       | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> insert into purchase values(10,'Laptop',50400.30);
Query OK, 1 row affected (0.01 sec)

mysql> insert into purchase values(11,'Bluetooth',6000.03),
    -> (12,'Speaker',3459.59));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ')' at line 2
mysql> insert into purchase values(11,'Bluetooth',6000.03),
    -> (12,'Speaker',3459.59);
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> insert into purchase values(13,'Inverter',69000.03),
    -> (14,'Keyboard',3299.59),
    -> (15,'Powerbank',9899.59);
Query OK, 3 rows affected (0.00 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> select * from purchase;
+------------+-----------+---------+
| purchaseid | itemname  | price   |
+------------+-----------+---------+
|         10 | Laptop    | 50400.3 |
|         11 | Bluetooth | 6000.03 |
|         12 | Speaker   | 3459.59 |
|         13 | Inverter  |   69000 |
|         14 | Keyboard  | 3299.59 |
|         15 | Powerbank | 9899.59 |
+------------+-----------+---------+
6 rows in set (0.00 sec)

mysql> show tables;
+-----------------+
| Tables_in_wipro |
+-----------------+
| purchase        |
+-----------------+
1 row in set (0.00 sec)

mysql> create table wipro_employee(eno int,name varchar(20),salary float,dept varchar(20));
Query OK, 0 rows affected (0.03 sec)

mysql> insert into wipro_employee values(1001,'Thananya',23493.49,'Networking');
Query OK, 1 row affected (0.01 sec)

mysql> insert into wipro_employee values(1002,'Devi',99493.49,'Testing');
Query OK, 1 row affected (0.01 sec)

mysql> insert into wipro_employee values(1003,'Abi',28493.49,'Training');
Query OK, 1 row affected (0.01 sec)

mysql> insert into wipro_employee values(1004,'Daya',96493.49,'Testing');
Query OK, 1 row affected (0.00 sec)

mysql> insert into wipro_employee values(1005,'Raja',93493.49,'Insurance');
Query OK, 1 row affected (0.01 sec)

mysql> select * from wipro_employee;
+------+----------+---------+------------+
| eno  | name     | salary  | dept       |
+------+----------+---------+------------+
| 1001 | Thananya | 23493.5 | Networking |
| 1002 | Devi     | 99493.5 | Testing    |
| 1003 | Abi      | 28493.5 | Training   |
| 1004 | Daya     | 96493.5 | Testing    |
| 1005 | Raja     | 93493.5 | Insurance  |
+------+----------+---------+------------+
5 rows in set (0.00 sec)

 */

//*************download mysql-connector-java-5.1.16.jar add to the project
//Right click project->build path->configure build path->libraries tab->add external jars->add the jar file 
//Referenced Libraries folder will be automatically created in eclipse project


 public class JDBC_MYSQLDemo {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			//loading the mysql driver
			//drivername is case sensitive

			/*
			 * Since JDBC 4.0, explicitly registering the driver is optional. 
			 * We just need to put vender's Jar in the classpath, 
			 * and then JDBC driver manager can detect and load the driver automatically.
			 */

			//classname.methodname=>static method
			//Class.forName("com.mysql.jdbc.Driver");  //type 4 mysql driver

			//3306-DEFAULT mysql port number
			//wipro:: mysql database name
			//username:root
			//my password is empty
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","#Adumnath041");

			//con=DriverManager.getConnection("jdbc:mysql:@127.0.0.1:3306/wipro","root","");//valid

			st=con.createStatement();//build sql statements
			rs=st.executeQuery("select * from wipro_employee");//ResultSet means rows and columns
			while(rs.next())//iterate the records one by one!
			{
				//EITHER COLUMN NAME OR COLUMN POSITION INDEX 1,2,3....
				int a=rs.getInt("eno");//column name
				String b=rs.getString(2);//2nd column=>name
				float c=rs.getFloat("salary");//float c=rs.getFloat(3);
				String d=rs.getString("dept");
				System.out.println(a+ " "+b + " "+c + " "+d );
			}
			
		}
		catch(Exception e)//SQLException is a checked exception
		{
			e.printStackTrace();
		}

		finally
		{
			try
			{
				if(rs!=null) 
					rs.close();
				if(st!=null)
					st.close();
				if(con!=null)
					con.close();
			}
			catch(Exception e)
			{
				System.out.println("Finally Block::"+e);
			}
		
		}



	}

}
/*
 1001 Thananya 23493.5 Networking
 1002 Devi 99493.5 Testing
 1003 Abi 28493.5 Training
 1004 Daya 96493.5 Testing
 1005 Raja 93493.5 Insurance
*/
