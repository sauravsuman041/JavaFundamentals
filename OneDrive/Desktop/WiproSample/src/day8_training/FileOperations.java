package day8_training;

import java.io.File;

/*
 * character streams:::
 * 
--Read and write 16-bit Unicode characters
--Reader and Writer
--Should be used for reading/writing text information

byte streams :::

--Read and write 8-bit (= 1 byte) characters
--InputStream and OutputStream
--Should be used for reading/writing images or sound files
--**********************Used for Object serialization
 */
/*
 * Character Stream:: Reader and Writer(Abstract classes)
 * Byte Stream:: OutputStream and InputStream(Abstract classes)
 */
public class FileOperations {
	public static void main(String[] args) throws Throwable
	{
		//to access the existing  text file=> File class!
		//d:\=>invalid java =>\n\t

		File obj=new File("D:\\RPS_WIPRO\\Friday.txt");//valid
		File obj1=new File("D:/RPS_WIPRO/Friday.txt");//valid 
		
		//file properties
		System.out.println("Filename:: "+obj1.getName());
		System.out.println("Path:: "+obj1.getAbsolutePath());
		System.out.println("Exists? :: "+obj1.exists());
		System.out.println("Hidden file??????????????? "+obj1.isHidden());
		System.out.println("Directory::: "+obj1.isDirectory());//is this a folder?
		System.out.println("File::: "+obj1.isFile());
		System.out.println("File Size::: "+obj1.length());//size in terms of bytes
		System.out.println("Write Permission??? ::: "+obj1.canWrite());
		
		File f2=new File("D:\\RPS_WIPRO\\today.txt");//valid
		f2.createNewFile();//IOException-checked exception

		File f3=new File("D:\\RPS_WIPRO\\todayupdate.txt");//valid
		if(f2.exists())//today.TXT
		{
			f2.renameTo(f3);//RENAMING A FILE
			System.out.println("File Renamed Successfully");
		}

		File f4=new File("D:\\WLab_111\\WLab_2222\\WLab_3333");//valid
		if(f4.mkdirs())//folders::make directories
		{
			System.out.println("Directory Created Successfully!");
		}
		else//if directory already exists
		{
			System.out.println("Directory Not Created!");
		}

		//user.dir:: it is one of the built in property key=>produce current path 
		System.out.println("Path::: "+System.getProperty("user.dir"));//Path of the Current Eclipse Project

		//Creating text file in eclipse project
		File  s1=new File(System.getProperty("user.dir")+ "\\src\\" +"EmployeeData.txt");
		//File s1=new File("C:\\Users\\Administrator\\eclipse-workspace\\WIPROSamples\\src\\EmployeeData.txt");
		
		s1.createNewFile();
		System.out.println("Eclipse Text File Exists? :: "+s1.exists());


		
	}

}
/*
Filename:: Friday.txt
Path:: D:\RPS_WIPRO\Friday.txt
Exists? :: true
Hidden file??????????????? false
Directory::: false
File::: true
File Size::: 306
Write Permission??? ::: true
File Renamed Successfully
Directory Not Created!
Path::: C:\Users\Administrator\eclipse-workspace\WIPROSamples
Eclipse Text File Exists? :: true
*/
