package day5_Activity;

//3.Create a collection that will contain the names of the days in a week. Print the collection. 
//Display the length of the collection and convert the collection into an array and print it.

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        String[] daysArray = new String[7];
        int index = 0;

        for (String day : days) {
            daysArray[index] = day;
            index++;
        }

        System.out.println("Days in Array:");
        for (String day : daysArray) {
            System.out.println(day);
        }

	}

}
