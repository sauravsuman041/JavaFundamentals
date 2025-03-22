package day8_Activity;

//2 Write a program to rename the given file, after renaming the file delete the renamed file. 
//(Accept the file name using command line arguments.)


import java.io.File;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length < 1) {
            System.out.println("Usage: java Question8 <filename>");
            return;
        }

        String originalFileName = args[0];
        File originalFile = new File(originalFileName);

        if (!originalFile.exists()) {
            System.out.println("File does not exist: " + originalFileName);
            return;
        }

        File renamedFile = new File("renamed_file.txt");

        if (originalFile.renameTo(renamedFile)) {
            System.out.println("File renamed successfully to: " + renamedFile.getName());

            if (renamedFile.delete()) {
                System.out.println("Copy file deleted successfully.");
            } else {
                System.out.println("Failed to delete the Copy file.");
            }
        } else {
            System.out.println("Failed to rename the file.");
        }

	}

}
