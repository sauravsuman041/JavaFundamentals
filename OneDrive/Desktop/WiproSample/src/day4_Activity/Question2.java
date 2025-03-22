package day4_Activity;

//2.Write the following methods that return a lambda expression performing a specified action:
//
//a.PerformOperation isOdd(): The lambda expression must return true  if a number is odd or
//		false  if it is even.
//b.PerformOperation isPrime(): The lambda expression must return  true if a number is 
//		prime or false  if it is composite.
//c.PerformOperation isPalindrome(): The lambda expression must return true   if a 
//		number is a palindrome or false  if it is not.



interface IsOdd{
	public boolean isOdd(int a);
}

interface IsPrime{
	public boolean isPrime(int a);
}

interface IsPalindrome{
	public boolean isPalindrome(int a);
}



public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsOdd odd = (a)->(a%2==1);
		IsPrime prime = (a)->{
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
        
        IsPalindrome palindrome = (a)->{
            String str = Integer.toString(a);
            StringBuilder reversed = new StringBuilder(str).reverse();
            String ans = reversed.toString();
            return str.equals(ans);
        };
		
		
		System.out.println("Check if 17 is odd: " + odd.isOdd(17));
        System.out.println("Check if 52 is odd: " + odd.isOdd(52));

        System.out.println("Check if 42 is prime: " + prime.isPrime(42));
        System.out.println("Check if 37 is prime: " + prime.isPrime(37)); 

        System.out.println("Check if 15751 is palindrome: " + palindrome.isPalindrome(15751));
        System.out.println("Check if 238 is palindrome: " + palindrome.isPalindrome(238));

	}

}
