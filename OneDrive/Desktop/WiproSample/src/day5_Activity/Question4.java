package day5_Activity;

//4.Design a class that acts as a library for the following kinds of media: book, video, 
//and newspaper. Provide one version of the class that uses generics and one that does not. 
//The class should be with add and retrieve methods in order to add and retrieve values from 
//the library.

import java.util.ArrayList;

class Library{
	String title;
	
	public void addTitle(String title) {
		this.title = title ;
	}
	public String toString() {
		return "Media: " + title;
	}
}

class Book extends Library {

    @Override
    public String toString() {
        return "Book: " + title;
    }
}

class Video extends Library {

    @Override
    public String toString() {
        return "Video: " + title;
    }
}

class Newspaper extends Library {
    @Override
    public String toString() {
        return "Newspaper: " + title;
    }
}


public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lib1 = new ArrayList();
		lib1.add(new Book());
		lib1.add(new Video());
		lib1.add(new Newspaper());
		
		ArrayList<Library> lib2 = new ArrayList<>();
		lib2.add(new Book());
		lib2.add(new Video());
		lib2.add(new Newspaper());
		
		for(Library m : lib2) {
			m.addTitle("abc");
			System.out.println(m.toString());
		}

	}

}
