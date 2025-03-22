package day8_Activity;

//mysql> create table day8_Question8(cust_name varchar(20), city varchar(20), order_num int, order_date date);
//Query OK, 0 rows affected (0.11 sec)
//
//mysql> show tables;
//+-----------------+
//| Tables_in_wipro |
//+-----------------+
//| day8_question8  |
//| purchase        |
//| wipro_employee  |
//+-----------------+
//3 rows in set (0.00 sec)
//
//mysql> insert into day8_Question8 values('Alexandar','Mexico', 5648, 2020-03-10);
//ERROR 1292 (22007): Incorrect date value: '2007' for column 'order_date' at row 1
//mysql> insert into day8_Question8 values('Alexandar','Mexico', 5648, '2020-03-10');
//Query OK, 1 row affected (0.01 sec)
//
//mysql> insert into day8_Question8 values('Joseph','Texas', 3322, '2020-02-11');
//Query OK, 1 row affected (0.00 sec)
//
//mysql> insert into day8_Question8 values('Mark','New Delhi', 2135, '2020-01-05');
//Query OK, 1 row affected (0.00 sec)
//
//mysql> insert into day8_Question8 values('Michael','New York', 3432, '2020-02-22');
//Query OK, 1 row affected (0.01 sec)
//
//mysql> insert into day8_Question8 values('Peter','London', 5544, '2020-02-01');
//Query OK, 1 row affected (0.01 sec)
//
//mysql> select * from day8_Question8;
//+-----------+-----------+-----------+------------+
//| cust_name | city      | order_num | order_date |
//+-----------+-----------+-----------+------------+
//| Alexandar | Mexico    |      5648 | 2020-03-10 |
//| Joseph    | Texas     |      3322 | 2020-02-11 |
//| Mark      | New Delhi |      2135 | 2020-01-05 |
//| Michael   | New York  |      3432 | 2020-02-22 |
//| Peter     | London    |      5544 | 2020-02-01 |
//+-----------+-----------+-----------+------------+
//5 rows in set (0.00 sec)



import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","#Adumnath041");

			st=con.createStatement();
			rs=st.executeQuery("select * from day8_Question8");
			
			while(rs.next())
			{
				String a=rs.getString(1);
				String b=rs.getString(2);
				int c=rs.getInt(3);
				Date d = rs.getDate(4);
				System.out.println(a+ "\t"+b + "\t"+c + "\t"+d );
			}
			
		}
		catch(Exception e)
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
