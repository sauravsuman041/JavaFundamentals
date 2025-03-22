package day3_Activity;

//10. Write a Java program to create an interface Playable with a method play() 
//that takes no arguments and returns void. Create three classes Football, Volleyball, 
//and Basketball that implement the Playable interface and override the play() method 
//to play the respective sports.

interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football.");
    }
}

class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball.");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball.");
    }
}

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        System.out.println("Football Game:");
        football.play();

        System.out.println("\nVolleyball Game:");
        volleyball.play();

        System.out.println("\nBasketball Game:");
        basketball.play();

	}

}
