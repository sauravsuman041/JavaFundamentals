package day6_Activity;

//4.Create a class called CD whose attributes are Title and singer.  Arrange the CDs in ascending 
//order based on the singer name.(Use Comparable)

import java.util.*;

class CD implements Comparable<CD> {
    private String title;
    private String singer;

    public CD(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }
    
    @Override
    public int compareTo(CD otherCD) {
        return this.singer.compareTo(otherCD.singer);
    }
}


public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<CD> cdList = new ArrayList<>();

        cdList.add(new CD("Album1", "Adele"));
        cdList.add(new CD("Album2", "Taylor Swift"));
        cdList.add(new CD("Album3", "Ed Sheeran"));
        cdList.add(new CD("Album4", "Bruno Mars"));

        Collections.sort(cdList);

        System.out.println("CDs in Ascending Order Based on Singer Name:");
        for (CD cd : cdList) {
        	System.out.println("Singer Name: " + cd.getSinger() + " Song Name: " + cd.getTitle());
        }

	}

}
