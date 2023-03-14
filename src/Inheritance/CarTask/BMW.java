package Inheritance.CarTask;

public class BMW extends Car {

	public BMW(String model, String color, double price, int year, int miles) {
		super("BMW", model, color, price, year, miles);

	}

	public void breaksDown() {
		System.out.println(brand + " " + model + " breaks down easily.");
	}

	public void racing() {
		System.out.println(brand + " " + model + " is really fast for racing.");
	}
}
