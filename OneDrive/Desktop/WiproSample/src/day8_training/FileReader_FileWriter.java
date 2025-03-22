package day8_training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

//CHARACTER STREAM PROGRAM
public class FileReader_FileWriter {
	public static void main(String[] args)throws Exception
	{
		InputStreamReader obj=new InputStreamReader(System.in);//similar to Scanner class
		BufferedReader b1=new BufferedReader(obj);//pass InputStreamReader obj

		System.out.println("Eno::: ");
		String i=b1.readLine();

		System.out.println("Name::: ");
		String j=b1.readLine();

		//Write operation
		//FileWriter class .. it is similar to FileOutputStream!

		//true:: appends file(NO OVERRIDING),false::overwrites file
		//default is false(override the file content)!

		FileWriter fw=new FileWriter("D:\\RPS_WIPRO\\WIPROFILEWRITE.txt",true);//creating the text file
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(i);//ENO
		bw.write(j);//name
		bw.close();

		FileReader fr=new FileReader("D:\\RPS_WIPRO\\WIPROFILEWRITE.txt");
		BufferedReader br=new BufferedReader(fr);
		String res;
		/*
		 * -1:: byte stream
		 * null=>character stream
		 */

		while((res=br.readLine())!=null)
		{
			System.out.println("After Read::: "+res);
		}		
		fr.close();

		
	}

}
/*
Eno::: 
5567
Name::: 
Madhu
After Read::: 1002priya1devi2348Raja5567Madhu
*/