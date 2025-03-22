package day2_Activity;

//5.Write an inheritance hierarchy for classes Quadrilateral,Trapezoid,Parallelogram,Rectangle and Square . Use Quadrilateral  as the superclass of the hierarchy. Specify the instance variables and methodsfor each class. The private  instance variables of Quadrilateral  should be the  x -  y  coordinate pairs for thefour endpoints of the Quadrilateral. Write a program that instantiates objects of your classes and outputs each object’s area (except Quadrilateral ).
//
//Hints:
//
//•Create and use a Point  class to represent the corners of the shapes.
//
//•Your output should appear as follows:
//Coordinates of Quadrilateral are:( 1.1, 1.2 ), ( 6.6, 2.8 ), ( 6.2, 9.9 ), ( 2.2, 7.4 )
//
//Coordinates of Trapezoid are:( 0.0, 0.0 ), ( 10.0, 0.0 ), ( 8.0, 5.0 ), ( 3.3, 5.0 )
//Height is: 5.0
//Area is: 36.75
//
//Coordinates of Parallelogram are:( 5.0, 5.0 ), ( 11.0, 5.0 ), ( 12.0, 20.0 ), ( 6.0, 20.0 )
//Width is: 6.0
//Height is: 15.0
//Area is: 90.0
//
//Coordinates of Rectangle are:( 17.0, 14.0 ), ( 30.0, 14.0 ), ( 30.0, 28.0 ), ( 17.0, 28.0 )
//Width is: 13.0
//Height is: 14.0
//Area is: 182.0
//
//Coordinates of Square are:( 4.0, 0.0 ), ( 8.0, 0.0 ), ( 8.0, 4.0 ), ( 4.0, 4.0 )
//Side is: 4.0
//Area is: 16.0

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Quadrilateral {
    private Point[] points = new Point[4];

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
    }

    public Point getPoint(int index) {
        return points[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Coordinates of Quadrilateral are:");
        for (Point point : points) {
            sb.append(" ").append(point);
        }
        return sb.toString();
    }
}

class Trapezoid extends Quadrilateral {
    private double height;

    public Trapezoid(Point p1, Point p2, Point p3, Point p4, double height) {
        super(p1, p2, p3, p4);
        this.height = height;
    }

    public double area() {
        double base1 = Math.abs(getPoint(0).getX() - getPoint(1).getX());
        double base2 = Math.abs(getPoint(2).getX() - getPoint(3).getX());
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHeight is: " + height + "\nArea is: " + area();
    }
}

class Parallelogram extends Quadrilateral {
    private double width;
    private double height;

    public Parallelogram(Point p1, Point p2, Point p3, Point p4, double width, double height) {
        super(p1, p2, p3, p4);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth is: " + width + "\nHeight is: " + height + "\nArea is: " + area();
    }
}

class Rectangle extends Parallelogram {

    public Rectangle(Point p1, Point p2, Point p3, Point p4, double width, double height) {
        super(p1, p2, p3, p4, width, height);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Square extends Rectangle {
    private double side;

    public Square(Point p1, Point p2, Point p3, Point p4, double side) {
        super(p1, p2, p3, p4, side, side);
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide is: " + side;
    }
}

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrilateral quad = new Quadrilateral(
                new Point(1.1, 1.2), new Point(6.6, 2.8), new Point(6.2, 9.9), new Point(2.2, 7.4));
        System.out.println(quad);

        Trapezoid trapezoid = new Trapezoid(
                new Point(0.0, 0.0), new Point(10.0, 0.0), new Point(8.0, 5.0), new Point(3.3, 5.0), 5.0);
        System.out.println("\n" + trapezoid);

        Parallelogram parallelogram = new Parallelogram(
                new Point(5.0, 5.0), new Point(11.0, 5.0), new Point(12.0, 20.0), new Point(6.0, 20.0), 6.0, 15.0);
        System.out.println("\n" + parallelogram);

        Rectangle rectangle = new Rectangle(
                new Point(17.0, 14.0), new Point(30.0, 14.0), new Point(30.0, 28.0), new Point(17.0, 28.0), 13.0, 14.0);
        System.out.println("\n" + rectangle);

        Square square = new Square(
                new Point(4.0, 0.0), new Point(8.0, 0.0), new Point(8.0, 4.0), new Point(4.0, 4.0), 4.0);
        System.out.println("\n" + square);

	}

}
