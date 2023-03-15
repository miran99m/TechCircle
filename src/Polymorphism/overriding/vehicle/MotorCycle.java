package Polymorphism.overriding.vehicle;

public class MotorCycle extends Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Starting the engine of the motorcycle...");
	}

	@Override
	public void stopEngine() {
		System.out.println("Stopping the engine of the motorcycle...");
	}
}
