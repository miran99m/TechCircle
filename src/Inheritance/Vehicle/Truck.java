package Inheritance.Vehicle;

public class Truck extends Vehicle {

	  private double bedSize;
	    private int towingCapacity;
	    
	    public Truck(String make, String model, int year, int numWheels, double bedSize, int towingCapacity) {
	        super(make, model, year, numWheels);
	        this.bedSize = bedSize;
	        this.towingCapacity = towingCapacity;
	    }
	    
	    @Override
	    public String toString() {
	        return super.toString() +
	               "Bed Size: " + bedSize + " feet\n" +
	               "Towing Capacity: " + towingCapacity + " lbs\n";
	    }
}
