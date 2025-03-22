package day3_Activity;

//6.Create two interfaces namely Drawable and Fillable. Create class called Line, Circle, Square and
//implement following methods through interface.


interface Drawable {
    void draw();
}


interface Fillable {
    void fill(String color);
}


class Line implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a line.");
    }
}


class Circle implements Drawable, Fillable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public void fill(String color) {
        System.out.println("Filling the circle with color: " + color);
    }
}


class Square implements Drawable, Fillable {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }

    @Override
    public void fill(String color) {
        System.out.println("Filling the square with color: " + color);
    }
}

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
        Circle circle = new Circle();
        Square square = new Square();

        // Test draw methods
        line.draw();
        circle.draw();
        square.draw();
        circle.fill("Red");
        square.fill("Blue");
	}

}
