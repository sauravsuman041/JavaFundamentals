package day7_Activity;

//5.Write an application to simulate the vehicles crossing a bridge and a toll plaza on a highway.
//For the purpose of this exercise, simulate the environment for five vehicles that are 
//approaching the bridge and the toll booth. The vehicles are numbered from one to five. The 
//vehicles should approach the bridge and the toll booth in sequential order. The toll booth can 
//only deal with one vehicle at a time. This application should print a message every time when 
//a vehicle crosses the bridge and another message when a vehicle crosses the toll booth along 
//with the vehicle number.
//
//hint: use Synchronization

class Highway {
    private int currentVehicle = 1;

    public synchronized void cross(int vehicleNumber) {
        while (vehicleNumber != currentVehicle) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Vehicle " + vehicleNumber + " crossed the bridge.");
        System.out.println("Vehicle " + vehicleNumber + " passed the toll booth.");
        currentVehicle++;
        notifyAll();
    }
}
class Vehicle extends Thread {
    private int vehicleNumber;
    private Highway highway;

    public Vehicle(int vehicleNumber, Highway highway) {
        this.vehicleNumber = vehicleNumber;
        this.highway = highway;
    }

    public void run() {
        highway.cross(vehicleNumber);

    }
}


public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Highway highway = new Highway();
        for (int i = 1; i <= 5; i++) {
            new Vehicle(i, highway).start();
        }

	}

}
