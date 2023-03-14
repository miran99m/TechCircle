package Inheritance.Vehicle;

public class Vehicle {

	public String make;
	public String model;
	public int year;
	public int numWheels;

	public Vehicle(String make, String model, int year, int numWheels) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.numWheels = numWheels;
	}

	@Override
	public String toString() {
		return "Make: " + make + "\n" + "Model: " + model + "\n" + "Year: " + year + "\n" + "Num Wheels: " + numWheels
				+ "\n";
	}
}
