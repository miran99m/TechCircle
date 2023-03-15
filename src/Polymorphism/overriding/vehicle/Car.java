package Polymorphism.overriding.vehicle;

public class Car extends Vehicle {

//	Task OverRide
//
//	- Create a parent class called "Vehicle" 
//	two methods: startEngine() and stopEngine()
//
//			 - The startEngine() method should print a message indicating that 
//			 "the engine of the vehicle is starting."
//
//			 - The stopEngine() method should print a message indicating that 
//			 "the engine of the vehicle is stopping."
//
//	-Create two subclasses called "Car" and "Motorcycle" that extend the "Vehicle" class.
//
//	-Override the startEngine() and stopEngine() methods for each subclass to print messages that are specific to cars and motorcycles. 
//
//	For example: 
//	-the startEngine() method for the "Car" class could print a message like 
//	"Starting the engine of the car..."
//
//	-the startEngine() method for the "Motorcycle" class could print a message like
//	 "Starting the engine of the motorcycle...".
//
//	Create a main method that creates objects of the "Car" and "Motorcycle" classes and calls their "startEngine()" and "stopEngine()" methods.
//
//	Print the output to the console to demonstrate that the methods are working correctly.
//


	@Override
	public void startEngine() {
		System.out.println("Starting the engine of the car...");
	}

	@Override
	public void stopEngine() {
		System.out.println("Stopping the engine of the car...");
	}

}
