package day6_Activity;

//12.(Performing set operations on array lists) Create two array lists {"George", "Jim", "John", 
//"Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin", "Michelle", "Ryan"}, 
//and find their union, difference, and intersection. (You may clone the lists to preserve 
//the original lists from being changed by these methods.)

import java.util.ArrayList;
import java.util.List;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<>();
        list1.add("George");
        list1.add("Jim");
        list1.add("John");
        list1.add("Blake");
        list1.add("Kevin");
        list1.add("Michael");

        List<String> list2 = new ArrayList<>();
        list2.add("George");
        list2.add("Katie");
        list2.add("Kevin");
        list2.add("Michelle");
        list2.add("Ryan");
        
        List<String> union = new ArrayList<>();;
        union.addAll(list1);
        union.addAll(list2);
        System.out.println("Union: " + union);
        
        List<String> difference = new ArrayList<>();
        for (String item : list1) {
            if (!list2.contains(item)) {
                difference.add(item);
            }
        }
        System.out.println("Difference (set1 - set2): " + difference);
        
        List<String> intersection = new ArrayList<>();
        for (String item : list1) {
            if (list2.contains(item)) {
                intersection.add(item);
            }
        }
        System.out.println("Intersection: " + intersection);

	}

}
