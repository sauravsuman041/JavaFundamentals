package day6_Activity;

//9.Given two hashmap h1 with employee id and designation and hashmap h2 
//with id and salary, in a new hashmap the manager id and salary with the 
//increment of 5000 must added and printed.
//Input h1: {1="analyst",2="manager"}
//Input h2: {1=2000,2=5000}
//output: {2=10000}


import java.util.HashMap;
import java.util.Map;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	Map<Integer, String> h1 = new HashMap<>();
	        Map<Integer, Integer> h2 = new HashMap<>();

	        h1.put(1, "analyst");
	        h1.put(2, "manager");

	        h2.put(1, 2000);
	        h2.put(2, 5000);

	        Map<Integer, Integer> result = new HashMap<>();

	        for (Map.Entry<Integer, String> entry : h1.entrySet()) {
	            int id = entry.getKey();
	            String designation = entry.getValue();

	            if ("manager".equals(designation)) {
	                int updatedSalary = h2.get(id) + 5000;
	                result.put(id, updatedSalary);
	            }
	        }

	        System.out.println("Output: " + result);
		

	}

}
