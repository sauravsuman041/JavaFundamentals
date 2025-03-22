package day8_training;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Serialization in Java is the process of converting an object into a byte stream, so that it can be easily stored in a file, 
 * transmitted over a network, or saved in a database.
 * The serialized object can later be deserialized to recreate the original object.
 
 Serialization is a mechanism of converting the state of an object into a byte stream.
  Deserialization is the reverse process where the byte stream is used 
 to recreate the actual Java object in memory. This mechanism is used to persist the object.
 
 The byte stream created is platform independent. So, the object serialized on one platform can be deserialized on a different platform.
 
 Advantages of Serialization :::

--To save/persist state of an object. 
--To travel an object across a network.
--Used for marshalling (travelling the state of an object on the network)
 --JVM independent
 */
//NotSerializableException thrown if the class does not implement Serializable interface!
/*
* 1.Serializable interface does not have ANY METHODS!!!(""MARKER INTERFACE"")
	public interface Serializable
	{
	}
2.this interface NOTIFY the JVM to perform serialization!
3.*********Only objects marked SERIALIZABLE can be persisted into text file !!	
*/
class Book implements Serializable//marker interface--now this class eligible for SERIALIZATION
{
	//transient modifier=>ignore the variable during serialization!!!!
	//ex:password fields(OTP)

	//String ISBN;//non transient variable
	private transient String ISBN;//cannot be serialized in text file, so null is displayed

	String bookname;
	String author;
	public Book(String iSBN, String bookname, String author) 
	{
		super();
		ISBN = iSBN;
		this.bookname = bookname;
		this.author = author;
	}
	@Override
	public String toString() 
	{
		return "Book [ISBN=" + ISBN + ", bookname=" + bookname + ", author=" + author + "]";
	}
}
public class FileCustomObjectSerialization {
	/*
	 *Serialization(Marshalling):: Saving or writing the OBJECT in a TEXT FILE
	 *Deserialization(Unmarshalling):: Restoring the SAME OBJECT again from the text file 
	 */
	/*
	 * ByteStream Category::::=>ObjectInputStream(ReadObject) and ObjectOutputStream(WriteObject) classes 
	 * used for SERIALIZATION! */
	public static void main(String[] args) throws Exception{
		Book b1=new Book("5653-565-565","Java Complete Reference","Thananya");
		Book b2=new Book("5653-565-561","JSP Complete Reference","Abi");
		Book b3=new Book("5653-565-566","Jython Complete Reference","Surya");

		//Write Object into text file
		//.ser,.dat,.txt=>serialization file extension		

		FileOutputStream obj=new FileOutputStream("D:\\RPS_WIPRO\\Books123.ser");//create a text file
		ObjectOutputStream b11=new ObjectOutputStream(obj);
		b11.writeObject(b1);//Serialization(saving/writing object)
		b11.writeObject(b2);//Serialization(saving object)
		b11.writeObject(b3);//Serialization(saving object)

		System.out.println("Book Data Serialized or Persisted!");		
		b11.close();

		//Read Object
		FileInputStream obj1=new FileInputStream("D:\\RPS_WIPRO\\Books123.ser");
		ObjectInputStream b12=new ObjectInputStream(obj1);
		Book b6;
		while(obj1.available() != 0)//read more than one object
		{
			b6 = (Book) b12.readObject();//Deserialization(restoring object)
			System.out.println("Data Deserialized:: "+b6.toString());//output
		}
		b12.close();


	}

}
/*
 * Book Data Serialized or Persisted!
Data Deserialized:: Book [ISBN=null, bookname=Java Complete Reference, author=Thananya]
Data Deserialized:: Book [ISBN=null, bookname=JSP Complete Reference, author=Abi]
Data Deserialized:: Book [ISBN=null, bookname=Jython Complete Reference, author=Surya]
*/