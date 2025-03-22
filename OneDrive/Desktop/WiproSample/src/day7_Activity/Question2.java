package day7_Activity;

//2.Write a program that picks up a question from an array containing 10 elements and displays 
//the question. It then waits 30 seconds for the user to answer. If user answers it correctly, then 
//it moves to the next question, otherwise it terminates the program.


import java.util.Scanner;

class TimerThread extends Thread {
    private boolean flag = false;

    public void run() {
        try {
            Thread.sleep(30000);
            flag = true;
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted!");
        }
    }

    public boolean timerFlag() {
        return flag;
    }
}


public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        String[][] questions = {
            {"2 + 2?", "4"},
            {"17 + 5?", "22"},
            {"3 x 3?", "9"},
            {"Largest ocean?", "pacific"},
            {"Opposite of 'hot'?", "cold"},
            {"5 + 7?", "12"},
            {"What is the square root of 81?", "9"},
            {"What is the capital of India?", "new delhi"},
            {"What is the square root of 16?", "4"},
            {"What is the square of 7?", "49"}
        };
        
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQ" + (i + 1) + ": " + questions[i][0]);
            System.out.print("You have 30 sec to Answer: ");

            TimerThread timer = new TimerThread();
            timer.start();

            String answer = "";
            while (!timer.timerFlag()) {
                if (sc.hasNextLine()) {
                    answer = sc.nextLine().trim().toLowerCase();
                    break;
                }
            }

            if (timer.timerFlag()) {
                System.out.println("\nTime's up! Moving to the Next Question.");
                continue;
            }

            if (!answer.equals(questions[i][1])) {
                System.out.println("Wrong! Moving to the Next Question.");
                continue;
            }

            System.out.println("Correct!");
        }
        
        System.out.println("Your Score is " + score + " out of 10.");

        System.out.println("Quiz Over. Thanks for playing!");
        sc.close();

	}

}
