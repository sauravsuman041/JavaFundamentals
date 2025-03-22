package day4_Activity;

//4.Write a Java program using Lambda Expression to concatenate two strings

interface Concat{
	public String concatenate(String a, String b);
}

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concat ans = (str1,str2)-> (str1+str2);
		
		String str1 = "Hello";
        String str2 = " World";

        String result = ans.concatenate(str1, str2);
        System.out.println("Concatenated String: " + result);
		
	}

}
