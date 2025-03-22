package day9_Activity;

//JDBC CRUD:
//
//Item Table:
//
//Itemid, Itemname, Price, Quantity, SaleDate
//
//Menu:
//
//1. Add Item
//
//2.Delete Item
//
//3.Display Item
//
//4.Update Item
//
//5.Search Item by Price and SaleDate
//
//6.Exit


//mysql> create table item(Itemid int, Itemname varchar(20), Price float, Quantity int, SaleDate date);
//ERROR 2013 (HY000): Lost connection to MySQL server during query
//No connection. Trying to reconnect...
//Connection id:    17
//Current database: wipro
//
//Query OK, 0 rows affected (0.25 sec)
//
//mysql> create table item(Itemid int, Itemname varchar(20), Price float, Quantity int, SaleDate date);
//ERROR 1050 (42S01): Table 'item' already exists
//mysql> show tables;
//+-----------------+
//| Tables_in_wipro |
//+-----------------+
//| day8_question8  |
//| item            |
//| purchase        |
//| wipro_employee  |
//+-----------------+
//4 rows in set (0.04 sec)
//
//mysql> select * from item;
//Empty set (0.00 sec)


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Connection con=null;
		try
		{
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro", "root", "");

		}
		catch(Exception e)
		{
			System.out.println("Connection Failed! Check console!"+e);	
		}
		if(con!=null)
		{
			System.out.println("DB Connection success!");
		}
		else
		{
			System.out.println("DB Connection Failed!");
		}
		
		boolean exit = false;
		while(true) {
		
				System.out.println("Menu for the Item Table :: ");
				System.out.println("1. Add Item");
				System.out.println("2. Delete Item");
				System.out.println("3. Display Item");
				System.out.println("4. Update Item");
				System.out.println("5. Search Item by Price and SaleDate");
				System.out.println("6. Exit");
				System.out.println();
				System.out.println("Enter the Option : ");
				int option = sc.nextInt();
				
				switch(option) {
					default: 
						System.out.println("Invalid Option!!");
						break;
					case 1:
						System.out.println("Item Id:: ");
						int a = sc.nextInt();
						sc.nextLine();
						System.out.println("Item Name:: ");
						String b = sc.nextLine();
						System.out.println("Item Price:: ");
						float c = sc.nextFloat();
						System.out.println("Quantity Sold:: ");
						int d = sc.nextInt();
						System.out.println("Sale Date(YYYY-MM-DD-MYSQL):: ");
						String dos1=sc.next();
						
						Date sqdos=Date.valueOf(dos1);
						
						String query1 = "insert into item values(?,?,?,?,?)";
						PreparedStatement ps1 = con.prepareStatement(query1);
						ps1.setInt(1, a);
						ps1.setString(2, b);
						ps1.setFloat(3, c);
						ps1.setInt(4, d);
						ps1.setDate(5,sqdos);
						
						int rows = ps1.executeUpdate();
						System.out.println(rows + " Record inserted!");
						
						break;
					case 2:
						System.out.println("Enter Item Id to Delete:: ");
						int a2=sc.nextInt();
				
						String query2="delete from item where Itemid=?";
						PreparedStatement ps2=con.prepareStatement(query2);
						ps2.setInt(1, a2); 
						
						int rows2=ps2.executeUpdate();
						if(rows2>=1)
						{
							System.out.println("Record Exist!");
							System.out.println(rows2+ " Record Deleted!");
						}
						else
						{
							System.out.println("Record Not Exist!");
							System.out.println(rows2+ " Record Deleted!");			
						}
						
						break;
					case 3:
						PreparedStatement ps3=con.prepareStatement("select * from item");
						ResultSet rs=ps3.executeQuery();
						while(rs.next())
						{
							int a3=rs.getInt(1);
							String b3=rs.getString(2);
							float c3=rs.getFloat(3);
							int d3=rs.getInt(4);
							Date dos3=rs.getDate(3);
							System.out.println(a3+ " "+b3 + " "+c3+ " "+d3 + " " + dos3);
						}	
						rs.close();
						break ;
					case 4:
						System.out.println("Enter the Item Id to be Updated:: ");
						int a4=sc.nextInt();
						System.out.println("Enter the updated Quantity Sold:: ");
						int d4=sc.nextInt();
						
						String query4="update item set Quantity=? where Itemid=?";
						PreparedStatement ps4=con.prepareStatement(query4);
						ps4.setInt(1, d4);
						ps4.setInt(2, a4); 
						
						int rows4=ps4.executeUpdate();
						if(rows4>=1)
						{
							System.out.println("Record Exist!");
							System.out.println(rows4+ " Record Updated!");
						}
						else
						{
							System.out.println("Record Not Exist!");
						System.out.println(rows4+ " Record Updated!");			
						}
						
						break;
					case 5:
						System.out.println("Enter the Price of the Item:: ");
						int price=sc.nextInt();
						System.out.println("Enter the Sale Date:: ");
						String date=sc.next();
						
						Date sqdos5=Date.valueOf(date);
						
						String query5="select * from item where price=? and date=?";
						PreparedStatement ps5=con.prepareStatement(query5);
						ps5.setFloat(1, price);
						ps5.setDate(2, sqdos5); 
						ResultSet rs5=ps5.executeQuery();
						while(rs5.next())
						{
							int a5=rs5.getInt(1);
							String b5=rs5.getString(2);
							float c5=rs5.getFloat(3);
							int d5=rs5.getInt(4);
							Date dos5=rs5.getDate(3);
							System.out.println(a5+ " "+b5 + " "+c5+ " "+d5 + " " + dos5);
						}	
						rs5.close();
						break ;
						
					case 6:
						exit = true;
						break;
						
						
				}
				
				if(exit) {
					break;
				}
		}
	}

}
