package mydemosamples;

/*
 * --String Buffer and StringBuilder are MUTABLE(can be modified)!!!

 * --text change(mutable) and will only be accessed from  a single thread, 
 * use a String Builder(Unsynchronized)
 * 
 * --text change(mutable) and will be accessed from multiple threads, use a 
 * String Buffer(Synchronous)=>StringBuffer is synchronized i.e. thread safe. 
 * It means two threads can't call the methods of StringBuffer simultaneously. 
 
 StringBuilder is more efficient than StringBuffer.
 StringBuffer is thread-safe and synchronized whereas StringBuilder is not.
  That's why StringBuilder is faster than StringBuffer.
 */
/*
 * Why StringBuffer is slower than StringBuilder?
Because StringBuffer methods are synchronized whereas StringBuilder methods are not, 
there is a speed difference. StringBuffer is more secure to use than StringBuilder, 
but it is also slower due to the additional synchronization mechanisms.
 */

public class StringBuffer_StringBuilderDemo {
	public static void main(String[] args) {

		StringBuilder d1=new StringBuilder("Java");
		d1.reverse();//changes happen in  the original object
		System.out.println("After reverse(Mutable):: "+d1);
		
		StringBuffer d11=new StringBuffer("Python");
		d11.reverse();//changes happen in  the original object
		System.out.println("After reverse(Mutable):: "+d11);

	}

}
/*
After reverse(Mutable):: avaJ
After reverse(Mutable):: nohtyP
*/
