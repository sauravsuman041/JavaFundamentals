package day9_training;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dbconnectionutilities.DBConnectionFactory_MYSQL;

/*
 * 
1001 Thananya 23493.5 Networking
1002 Devi 99493.5 Testing
1003 Abi 28493.5 Training
1004 Daya 96493.5 Testing
1005 Raja 93493.5 Insurance
7800 Raji 33290.0 HR
3278 Harini 49293.0 Testing

 */
public class JDBC_DeleteDemo {

		public static void main(String[] args) throws SQLException {
			//getting the db connection from external file
			Connection con=DBConnectionFactory_MYSQL.mydbconnect_123();

			Scanner s1=new Scanner(System.in);
			System.out.println("Eno:: ");
			int a=s1.nextInt();
	
			String query1="delete from wipro_employee where eno=?";
			PreparedStatement ps1=con.prepareStatement(query1);
			ps1.setInt(1, a); 
			
			int rows=ps1.executeUpdate();//either 0 or any value
			if(rows>=1)
			{
				System.out.println("Record Exist!");
				System.out.println(rows+ " Record Deleted!");
			}
			else
			{
				System.out.println("Record Not Exist!");
				System.out.println(rows+ " Record Deleted!");			
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
			}	//Date d1=rs.getDate(3);
			rs.close();
			con.close();//release DB connection

	}

}
/*
DB Connection success!
Eno:: 
546456
Record Not Exist!
0 Record Deleted!
1001 Thananya 23493.5 Networking
1002 Devi 99493.5 Testing
1003 Abi 28493.5 Training
1004 Daya 96493.5 Testing
1005 Raja 93493.5 Insurance
7800 Raji 33290.0 HR
3278 Harini 49293.0 Testing
*/
