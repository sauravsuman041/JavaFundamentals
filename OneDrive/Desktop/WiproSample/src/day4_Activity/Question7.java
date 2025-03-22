package day4_Activity;

//7.By using multiple catch blocks, write a class to demonstrate the order of the execution of the 
//catch blocks usingNegativeArraySizeException,ArrayIndexOutOfBoundsException, 
//StringIndexOutOfBoundsException, IndexOutOfBoundsException, NullPointerException,          
//ArithmeticException and print the stack trace for each exception.

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            // Uncomment one block at a time to see how each exception is caught

            // 1. NegativeArraySizeException
             int[] array = new int[-5];

            // 2. ArrayIndexOutOfBoundsException
            // int[] array = new int[5];
            // System.out.println(array[10]);

            // 3. StringIndexOutOfBoundsException
            // String str = "Hello";
            // System.out.println(str.charAt(10));

            // 4. IndexOutOfBoundsException (general case)
            // String str = "Hello";
            // System.out.println(str.substring(10));

            // 5. NullPointerException
            // String str = null;
            // System.out.println(str.length());

            // 6. ArithmeticException
            // int result = 10 / 0;
            // System.out.println(result);
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Caught General Exception");
            e.printStackTrace();
        }

	}

}
