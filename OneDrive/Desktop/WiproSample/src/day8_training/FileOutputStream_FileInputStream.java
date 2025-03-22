package day8_training;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//BYTE STREAM PROGRAM
public class FileOutputStream_FileInputStream {

	public static void main(String[] args)throws Exception {
		//1.Fileoutputstream will create a runtime text file
		//2.Write operation
		//Byte Stream

		FileOutputStream obj=new FileOutputStream("D:\\RPS_WIPRO\\wiprowrite1.txt");
		String str="Good Day!";
		obj.write(str.getBytes());//convert String to bytes
		System.out.println("File Created and Data Written into file!");
		obj.close();//closing the write mode!
		
		
		//Read Operation
		File f1=new File("D:\\RPS_WIPRO\\Friday.txt");//valid
		if(!f1.exists() || f1.length()<0)
		{
			System.out.println("File Not Exists! File Empty!");
		}
		else
		{
			FileInputStream f4=new FileInputStream(f1);//Object of File Class
			int i;//bcos it is a ByteStream
			while((i=f4.read())!=-1)//UNTIL IT REACHES END OF FILE(EOF)
			{
				System.out.print((char)i);
			}
			f4.close();//closing the read stream!!!!!!!!!!!!!!!!!!
			
		}
	}

}
/*
File Created and Data Written into file!
Happy Learning
All our dreams can come true, if we have the courage to pursue them.
"Your self-worth is determined by you. Â· "Nothing is impossible. Â·
In any moment of decision, the best thing you can do is the right thing. The next best thing is the wrong thing. The worst thing you can do is nothing
*/
