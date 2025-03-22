package day8_Activity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//4. Create a CSV file with 5 movie names along with hero and heroine names. 
//Write a program to read from the CSV file and display it to the user.


public class Question4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String fileName = "bollywood_movies.csv";

        String[][] movies = {
            {"Dilwale Dulhania Le Jayenge", "Shah Rukh Khan", "Kajol"},
            {"Zindagi Na Milegi Dobara", "Hrithik Roshan", "Katrina Kaif"},
            {"Bajrangi Bhaijaan", "Salman Khan", "Kareena Kapoor"},
            {"Kabir Singh", "Shahid Kapoor", "Kiara Advani"},
            {"3 Idiots", "Aamir Khan", "Kareena Kapoor"}
        };
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
        for (String[] movie : movies) {
            writer.write("Movie: " + movie[0] + ", Hero: " + movie[1] + ", Heroine: " + movie[2]);
            writer.newLine();
        }
        
        System.out.println("Bollywood movie details written to " + fileName);

        if (writer != null) {
             writer.close();
        }

	    BufferedReader reader = new BufferedReader(new FileReader(fileName));
	    System.out.println("\nBollywood Movies List:");
	    String line;
	    while ((line = reader.readLine()) != null) {
	        System.out.println(line);
	    }
	    
	    if (reader != null) {
	          reader.close();
	    }
	
	}

}
