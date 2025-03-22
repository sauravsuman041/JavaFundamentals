package day2_Activity;

//11.Create a base class Distance which stores the distance between two locations in miles
//and a method travelTime(). The method prints the time taken to cover the distance when
//the speed is 60 miles per hour. Now in a derived class DistanceMKS, override
//travelTime() so that it prints the time assuming the distance is in kilometers and the
//speed is 100 km per second. Demonstrate the working of the classes.

class Distance {
    protected double dist;

    public Distance(double miles) {
        this.dist = miles;
    }

    public void travelTime() {
        double time = dist / 60;
        System.out.println("Travel time in miles (assuming 60 mph): " + time + " hours");
    }
}

class DistanceMKS extends Distance {

    public DistanceMKS(double kilometers) {
        super(kilometers);
    }

    @Override
    public void travelTime() {
        double time = (dist) / 100;
        System.out.println("Travel time in kilometers (assuming 100 km/s): " + time + " seconds");
    }
}

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance d1 = new Distance(120);
        d1.travelTime();

        DistanceMKS d2 = new DistanceMKS(200);
        d2.travelTime(); 

	}

}
