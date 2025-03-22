package day10_training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Older approach to close the resources:::
 * 
This is an older approach that we used to handle file related operations.
Notice, we manually closed the resource using close() method.
 */
/*JDK 8 FEATURE::
 * a try with resources is a feature of Java which was added into Java 7. 
 * It helps to close all the resources declared within try block. 
 * It automatically closes the resources after being used. 
 * A resource can be any file or a database connection.
For example, if we are working with File handing then after opening a file, 
it requires to be closed after reading or writing data. 
In early versions of Java, we have to explicitly close the resource, 
but from Java 7, we don’t need to worry about to close the resources.
*/
public class TryWithResources {
	public static void main(String[] args) {
		System.out.println("TRY WITH RESOURCE(FILE,DATABASE)::");
		/*
		 * 1.Objects declared in a try with resources statement have scope within the 
		 * try block, 
		 * but not the catch and finally blocks.
		   2.The close() method of objects declared in a try with resources 
		   block is invoked regardless of whether an exception is thrown 
		   during execution.
		 */
		/*
		 * The try-with-resources statement does automatic resource management. 
		 * We need not explicitly close the resources as JVM automatically closes them. 
		 * This makes the code more readable and easier to write.
		 */
		/*
		 * 1.In a try-with-resources statement, catch or finally block executes 
		 * after closing of the declared resources.
		 2.You can use catch and finally blocks with try-with-resources statement 
		 just like an ordinary try statement.
		 */
		/*
		 * Notice, we used multiple resources inside it 
		 * that means it can handle multiple resources as well.
		 */
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","");  //CALLING con.close()
	            Statement stmt=con.createStatement();  //st.close()
	            ResultSet rs=stmt.executeQuery("select * from wipro_employee");  //rs.close()
	            )
	        {  
	            while(rs.next())
	            {    
	                System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(4)+ " "+rs.getFloat(3));    
	            }  
	        }  
	        catch(Exception e)
			{    
	            System.out.println(e);  
	        }
			finally
			{
				System.out.println("Done!");
			}



	}

}
/*
TRY WITH RESOURCE(FILE,DATABASE)::
1001ThananyaNetworking 23493.5
1002DeviTesting 99493.5
1003AbiTraining 28493.5
1004DayaTesting 96493.5
1005RajaInsurance 93493.5
7800RajiHR 33290.0
3888HarshiniHR 439429.0
7348SachinHR 343293.0
10RamyaNetworking 34939.3
11SamHR 543563.0
122SaraInsurance 23423.4
10RamyaNetworking 34939.3
11SamHR 543563.0
122SaraInsurance 23423.4
Done!
*/