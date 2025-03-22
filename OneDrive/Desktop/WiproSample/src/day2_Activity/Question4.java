package day2_Activity;

//4.Five Bikers Compete in a race such that they drive at a constant speed which may or may
//not be the same as the other. To qualify the race, the speed of a racer must be more than the
//average speed of all 5 racers. Take as input the speed of each racer and print back the speed
//of qualifying racers. 
//
//Create a class named MyTriangle that contains two static methods
//a) public static double area(double a, double b, double c)
//b) public static double perimeter(double a, double b, double c)
//to compute area and perimeter of a triangle respectively given three valid
//sides a, b and c.
//And add a static method
//** Return true if the sum of any two sides is greater than the third side.
//**/
//c) public static boolean isValid(double a, double b, double c)
//In the main method of MyTriangle, test the three methods you write.
//1) Get a, b and c from the Console
//2) If a is -1, exit your program and print  Bye~ 
//3) If a is not -1, use isValid to check the input
//4) If the input is valid, compute the area and perimeter and print them
//5) If the input is not valid, return false and print  The input is invalid. 
//6) Go to 1)

import java.util.Scanner;

class MyTriangle {
	
    public static boolean isValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }
}

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double[] speeds = new double[5];
        double totalSpeed = 0;

        System.out.println("Enter the speeds of 5 bikers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Biker " + (i + 1) + ": ");
            speeds[i] = scanner.nextDouble();
            totalSpeed += speeds[i];
        }

        double averageSpeed = totalSpeed / 5;

        System.out.println("Average Speed: " + averageSpeed);
        System.out.println("Qualifying Bikers (Speed > Average):");

        for (int i = 0; i < 5; i++) {
            if (speeds[i] > averageSpeed) {
                System.out.println("Biker " + (i + 1) + " with Speed: " + speeds[i]);
            }
        }
        System.out.println();
        System.out.println();
        
        //Triangle Part
        
        System.out.println(":::Triangle Part:::");
        System.out.println();
        
        while (true) {
            System.out.print("Enter side a (-1 to exit): ");
            double a = scanner.nextDouble();
            if (a == -1) {
                System.out.println("Bye~");
                break;
            }

            System.out.print("Enter side b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter side c: ");
            double c = scanner.nextDouble();

            if (MyTriangle.isValid(a, b, c)) {
                System.out.println("The triangle is valid.");
                System.out.println("Area: " + MyTriangle.area(a, b, c));
                System.out.println("Perimeter: " + MyTriangle.perimeter(a, b, c));
            } else {
                System.out.println("The input is invalid.");
            }
        }

	}

}
