package Inheritance.Vehicle;

public class MotorCycle extends Vehicle {

	public double engineSize;
	public int numSeats;

	public MotorCycle(String make, String model, int year, int numWheels, int numSeats, double engineSize) {
		super(make, model, year, numWheels);
		this.numSeats = numSeats;
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return super.toString() + "Num Seats: " + numSeats + "\n" + "Engine Size: " + engineSize + " \n";
	}

}
