package day5_Activity;

//5.Consider placing a dozen of bangles in a bangle stand. Number the bangles from 1 to 12. 
//Now start removing the bangles from the stand. Simulate this scenario with the help of 
//Queue Interface.

import java.util.LinkedList;
import java.util.Queue;


public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> bangleStand = new LinkedList<>();

        for (int i = 1; i <= 12; i++) {
            bangleStand.add(i);
        }

        System.out.println("Bangels on the stand (1 to 12): " + bangleStand);

        System.out.println("\nRemoving bangles from the stand:");

        while (!bangleStand.isEmpty()) {
            System.out.println("Removed Bangle: " + bangleStand.poll());
        }

        System.out.println("\nAll bangles have been removed.");

	}

}
