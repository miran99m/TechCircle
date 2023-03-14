package Inheritance.CarTask;

public class Tesla extends Car {

	public Tesla(String model, String color, double price, int year, int miles) {
		super("Tesla", model, color, price, year, miles);

	}

	public void autoPilot() {
		System.out.println(brand + " " + model + " has autopilot capability");
	}
}
