package Inheritance.Vehicle;

public class Car extends Vehicle {

	public int numDoors;
	public String color;

	public Car(String make, String model, int year, int numWheels, int numDoors, String color) {
		super(make, model, year, numWheels);
		this.numDoors = numDoors;
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + "Num Doors: " + numDoors + "\n" + "Color: " + color + "\n";
	}

}
