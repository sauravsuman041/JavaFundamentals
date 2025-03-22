package day8_Activity;

//1.Write a program to create a text file in the path c:\java\abe.txt and check whether 
//that file is exists. Using the command exists(), isDirectory(), isFile(), getName() 
//and getAbsolutePath().

import java.io.File;
import java.io.IOException;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		
		File file = new File("C:\\java\\abcde.txt");

        file.getParentFile().mkdirs();

        if (file.createNewFile()) {
            System.out.println("File created successfully!");
        } else {
            System.out.println("File already exists.");
        }

        System.out.println("File exists: " + file.exists());
        System.out.println("Is a directory: " + file.isDirectory());
        System.out.println("Is a file: " + file.isFile());
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());

    } 
	catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

	}

}
