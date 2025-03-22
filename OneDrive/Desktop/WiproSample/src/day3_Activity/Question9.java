package day3_Activity;

//9. Write a Java program to create an abstract class Instrument with abstract methods 
//play() and tune(). Create subclasses for Glockenspiel and Violin that extend the 
//Instrument class and implement the respective methods to play and tune each instrument.

abstract class Instrument {

    abstract void play();
    abstract void tune();
}

class Glockenspiel extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Glockenspiel.");
    }

    @Override
    void tune() {
        System.out.println("Tuning the Glockenspiel.");
    }
}

class Violin extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Violin.");
    }

    @Override
    void tune() {
        System.out.println("Tuning the Violin.");
    }
}

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument glockenspiel = new Glockenspiel();
        Instrument violin = new Violin();

        System.out.println("Glockenspiel:");
        glockenspiel.play();
        glockenspiel.tune();

        System.out.println("\nViolin:");
        violin.play();
        violin.tune();

	}

}
