package day4_Activity;

//3.Write a Java program to implement a lambda expression to convert a list of strings to 
//uppercase and lowercase.

interface Uppercase{
	public String uppercase(String a);
}

interface Lowercase{
	public String lowercase(String a);
}
public class Question3 {
	public static void main(String[] args) {
		Uppercase ucase = (a)->{
//			StringBuilder ans = "";
//			for(int i=0;i<a.length();i++) {
//				char s = a.charAt(i);
//				ans = ans + s.toUpperCase;
//			}
			return a.toUpperCase();
		};
		
		Lowercase lcase = (a)-> a.toLowerCase();
		
		String[] ans = {"hello", "WORLD", "Java", "lambda"};
		
		for(String s: ans) {
			System.out.println(ucase.uppercase(s));
			System.out.println(lcase.lowercase(s));
		}
	}
}
