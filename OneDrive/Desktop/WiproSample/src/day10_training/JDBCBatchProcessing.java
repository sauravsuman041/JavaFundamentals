package day10_training;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dbconnectionutilities.DBConnectionFactory_MYSQL;
//Grouping a set of INSERT Statements and executing them at once is known as batch/bulk insert.
public class JDBCBatchProcessing {
	public static void main(String[] args) throws Exception{
		//fetching the db connection from the external file!
		Connection con=DBConnectionFactory_MYSQL.mydbconnect_123();
		  String insertQuery = "insert into wipro_employee  (eno, name,salary, dept) VALUES (?,?, ?, ?)";
          PreparedStatement preparedStatement = con.prepareStatement(insertQuery);

          // Sample data for bulk insert
          Object[][] data = {
                  {10,"Ramya", 34939.30,"Networking"},
                  {11,"Sam", 543563.40, "HR"},
                  {122,"Sara",23423.39,"Insurance"}
                  // Add more rows as needed
          };
/*
 * The addBatch() method of Statement, PreparedStatement, 
 * and CallableStatement is used to add individual statements to the batch. 
 * The executeBatch() is used to start the execution of all the statements grouped together.

The executeBatch() returns an array of integers, and each element of the array represents the update count 
for the respective update statement.
 */
          // Adding batches of parameters
          for (Object[] row : data) {
              preparedStatement.setInt(1,  (int) row[0]); //eno
              preparedStatement.setString(2, (String) row[1]); // name
              preparedStatement.setDouble(3, (Double) row[2]); // salary
              preparedStatement.setString(4, (String) row[3]); // dept
              preparedStatement.addBatch();
          }

          // Execute batches
          int[] batchResults = preparedStatement.executeBatch();

          // Handle the results if needed
          for (int result : batchResults) 
          {
  	        System.out.println("Number of records:"+result);
          }
          System.out.println("Bulk/Batch Insert completed successfully.");
          
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
con.close();
	}

}
/*
DB Connection success!
Number of records:1
Number of records:1
Number of records:1
Bulk/Batch Insert completed successfully.
1001 Thananya 23493.5 Networking
1002 Devi 99493.5 Testing
1003 Abi 28493.5 Training
1004 Daya 96493.5 Testing
1005 Raja 93493.5 Insurance
7800 Raji 33290.0 HR
3888 Harshini 439429.0 HR
7348 Sachin 343293.0 HR
10 Ramya 34939.3 Networking
11 Sam 543563.0 HR
122 Sara 23423.4 Insurance
10 Ramya 34939.3 Networking
11 Sam 543563.0 HR
122 Sara 23423.4 Insurance
*/
