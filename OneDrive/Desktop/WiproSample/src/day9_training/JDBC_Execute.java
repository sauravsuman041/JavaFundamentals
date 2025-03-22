package day9_training;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbconnectionutilities.DBConnectionFactory_MYSQL;

/*
execute() returns a boolean value and is used to execute SQL statements written 
as a String object
*/

public class JDBC_Execute {

	public static void main(String[] args)throws Exception {
		//fetching the db connection from the external file!
		Connection con=DBConnectionFactory_MYSQL.mydbconnect_123();
		Statement s1=con.createStatement();

		//execute() method allows us to execute any kind of query like select, update. 
		//execute=>DDL,DML(RETURN TYPE IS BOOLEAN!)

		//boolean b1=s1.execute("select * from wipro_employee");//valid
		boolean b1=s1.execute("select eno,name,salary from wipro_employee");//valid=>Dept missed!

		if(b1)//true
		{
			ResultSet rs=s1.getResultSet();//calling the ResultSet Interface
			while(rs.next())
			{
				int a=rs.getInt("eno");
				String b=rs.getString(2);//2nd column=>name
				float c=rs.getFloat("salary");
				//ignoring the dept column here!
				System.out.println(a+ " "+b + " "+c);
			}
		}
	}

}
/*
DB Connection success!
1001 Thananya 23493.5
1002 Devi 99493.5
1003 Abi 28493.5
1004 Daya 96493.5
1005 Raja 93493.5
7800 Raji 33290.0*/
