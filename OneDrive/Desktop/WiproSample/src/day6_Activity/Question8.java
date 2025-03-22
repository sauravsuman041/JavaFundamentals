package day6_Activity;

//8.Given the hashmap with registration number as key and mark as value. Find 
//the average of marks whose key is odd.
//input:{12:90,35:90,33:88,56:90}
//output: avg of(90+90) =90

import java.util.HashMap;
import java.util.Map;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> marks = new HashMap<>();
		marks.put(12, 90);
		marks.put(35, 90);
		marks.put(33, 88);
		marks.put(56, 90);

        int sum = 0;
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : marks.entrySet()) {
            int regNum = entry.getKey();
            int m1 = entry.getValue();

            if (regNum % 2 != 0) {
                sum += m1;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Avg of marks for odd registration numbers = " + average);
        } else {
            System.out.println("No odd registration numbers found.");
        }

	}

}
