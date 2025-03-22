package day9_training;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbconnectionutilities.DBConnectionFactory_MYSQL;

/*
 * mysql> create table newjoin1(eno int,name varchar(20),salary float);
Query OK, 0 rows affected (0.07 sec)

mysql> insert into newjoin1 values(1,'devi',34030),(2,'abi',34934),
    ->  (3,'raja',34393);
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> select * from newjoin1;
+------+------+--------+
| eno  | name | salary |
+------+------+--------+
|    1 | devi |  34030 |
|    2 | abi  |  34934 |
|    3 | raja |  34393 |
+------+------+--------+
3 rows in set (0.00 sec)

mysql> create table newjoin2(eno int,deptname varchar(20));
Query OK, 0 rows affected (0.05 sec)

mysql>  insert into newjoin2 values(1,'HR'),(2,'Sales'),(2,'Testing');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> select * from newjoin2;
+------+----------+
| eno  | deptname |
+------+----------+
|    1 | HR       |
|    2 | Sales    |
|    2 | Testing  |
+------+----------+
3 rows in set (0.00 sec)

mysql> select e1.name,e1.salary,e2.deptname from newjoin1 e1 inner join newjoin2 e2 on e1.eno=e2.eno;
+------+--------+----------+
| name | salary | deptname |
+------+--------+----------+
| devi |  34030 | HR       |
| abi  |  34934 | Sales    |
| abi  |  34934 | Testing  |
+------+--------+----------+
3 rows in set (0.01 sec)

mysql> select eno,e1.name,e1.salary,e2.deptname from newjoin1 e1 inner join newjoin2 e2 on e1.eno=e2.eno;
ERROR 1052 (23000): Column 'eno' in field list is ambiguous
mysql>
mysql> select e1.eno,e1.name,e1.salary,e2.deptname from newjoin1 e1 inner join newjoin2 e2 on e1.eno=e2.eno;
+------+------+--------+----------+
| eno  | name | salary | deptname |
+------+------+--------+----------+
|    1 | devi |  34030 | HR       |
|    2 | abi  |  34934 | Sales    |
|    2 | abi  |  34934 | Testing  |
+------+------+--------+----------+
3 rows in set (0.00 sec)

mysql> select newjoin1.eno,newjoin1.name,newjoin1.salary,newjoin2.deptname from newjoin1 inner join newjoin2 on newjoin1
.eno=newjoin2.eno;
+------+------+--------+----------+
| eno  | name | salary | deptname |
+------+------+--------+----------+
|    1 | devi |  34030 | HR       |
|    2 | abi  |  34934 | Sales    |
|    2 | abi  |  34934 | Testing  |
+------+------+--------+----------+
3 rows in set (0.00 sec)
 */
public class JDBC_MYSQLJOINS {
	public static void main(String[] args) throws Exception
	{
		//fetching the db connection from the external file!
				Connection con=DBConnectionFactory_MYSQL.mydbconnect_123();
				Statement s1=con.createStatement();
				String query1="select e1.eno,e1.name,e1.salary,e2.deptname from newjoin1 e1 inner join newjoin2 e2 on e1.eno=e2.eno";
				ResultSet rs=s1.executeQuery(query1);
				System.out.println("ENO\tName\tSalary\tDept");
				while(rs.next())
				{
					System.out.print(rs.getInt(1) + "\t\t");
					System.out.print(rs.getString(2) + "\t\t");
					System.out.print(rs.getFloat(3) + "\t\t");
					System.out.println(rs.getString(4));					
				}
				rs.close();
				con.close();//release DB connection

	}

}
/*
DB Connection success!
ENO	Name	Salary	Dept
1		devi		34030.0		HR
2		abi		34934.0		Sales
2		abi		34934.0		Testing
*/