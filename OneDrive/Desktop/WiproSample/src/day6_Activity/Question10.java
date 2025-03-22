package day6_Activity;

//10.Given a hashmap with employee name as Key and mark as Value, if the mark 
//is greater than 75, then display Pass else Fail.
//Input: {“Anu”:88,”Varun”:69,”Thomas”:76}
//Output: {“Anu”:”Pass”,”Varun”:”Fail”,”Thomas”:”Pass”}

import java.util.HashMap;
import java.util.Map;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> marksMap = new HashMap<>();
        marksMap.put("Anu", 88);
        marksMap.put("Varun", 69);
        marksMap.put("Thomas", 76);

        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
            String name = entry.getKey();
            int marks = entry.getValue();

            if (marks > 75) {
            	System.out.println(name + ": Pass");
            } else {
            	System.out.println(name + ": Fail");
            }
        }


	}

}
