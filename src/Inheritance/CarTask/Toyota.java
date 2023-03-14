package Inheritance.CarTask;

public class Toyota extends Car {

	public Toyota(String model, String color, double price, int year, int miles) {
		super("Toyota", model, color, price, year, miles);
	}

	public void reliabile() {
		System.out.println("Driving Toyota as it is a reliable car");
	}

}
