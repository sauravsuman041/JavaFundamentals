package day8_Activity;


//3. Write a program that creates a new file called batch mates and store your entire 
//batch mates name in it and display the details.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Question3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String fileName = "batchmates.txt";

        String[] batchMates = {"Aman", "Binod", "Chandan", "Dhruv", "Ekta"};

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
            for (String name : batchMates) {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Batch mates' names written to " + fileName);

            if (writer != null) {
                 writer.close();
            }
	
        BufferedReader reader = new BufferedReader(new FileReader("batchmates.txt"));
        System.out.println("\nBatch mates' names from file:");
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        
        if (reader != null) {
              reader.close();
         }
           
       

	}

}
