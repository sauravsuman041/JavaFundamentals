package day2_Activity;

//7.Create a class called Vehicle. Create subclasses like Truck, Bus, Car etc. Add common methods 
//in the base class and specific methods in the corresponding class. Create a class called Road 
//and create objects for the Truck, Car, Bus etc and display the appropriate message. 
//
//In the Vehicle class constructor initialize few variables like color, no of 
//wheels, model etc. Give appropriate values for these variables from the invoking subclass. 

class Vehicle {
    protected String color;
    protected int noOfWheels;
    protected String model;

    public Vehicle(String color, int noOfWheels, String model) {
        this.color = color;
        this.noOfWheels = noOfWheels;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Vehicle Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Number of Wheels: " + noOfWheels);
    }

    public void move() {
        System.out.println(model + " is moving on the road.");
    }
}

class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String color, String model, int seatingCapacity) {
        super(color, 4, model);
        this.seatingCapacity = seatingCapacity;
    }

    public void showCarDetails() {
        displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }

    @Override
    public void move() {
        System.out.println("The car " + model + " is cruising smoothly on the road.");
    }
}

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String color, String model, int loadCapacity) {
        super(color, 6, model); 
        this.loadCapacity = loadCapacity;
    }

    public void showTruckDetails() {
        displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }

    @Override
    public void move() {
        System.out.println("The truck " + model + " is carrying heavy loads on the highway.");
    }
}

class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String color, String model, int passengerCapacity) {
        super(color, 6, model);
        this.passengerCapacity = passengerCapacity;
    }

    public void showBusDetails() {
        displayDetails();
        System.out.println("Passenger Capacity: " + passengerCapacity);
    }

    @Override
    public void move() {
        System.out.println("The bus " + model + " is transporting passengers to their destination.");
    }
}

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("Red", "Sedan-X", 5);
        Truck truck = new Truck("Blue", "HeavyDuty-2000", 10);
        Bus bus = new Bus("Yellow", "CityExpress", 50);

        System.out.println("\n--- Car Details ---");
        car.showCarDetails();
        car.move();

        System.out.println("\n--- Truck Details ---");
        truck.showTruckDetails();
        truck.move();

        System.out.println("\n--- Bus Details ---");
        bus.showBusDetails();
        bus.move();

	}

}
