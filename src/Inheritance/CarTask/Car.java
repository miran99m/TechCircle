package Inheritance.CarTask;

public class Car {

//	1. carTask:
//	Create a class called Car
//		instance variables:
//			brand, model, year, price, color, miles
//

//	add a constructor to set all the fields	
	
//		instance methods:
//			start(), drive(),
	
	//toString()
	

//	Create the following sub classes of Car:
//		1. Toyota:
//				extra methods:
//						reliabile()
//
//		2. BMW:
//				extra methods:
//					breaksDown()
//					racing()
//
//		3. Tesla:
//				extra methods:
//					autoPilot();
//
	String brand, model , color;
	double price;
	int year, miles;
	
	public Car(String brand, String model, String color, double price, int year, int miles) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.year = year;
		this.miles = miles;
	}

	public void start() {
		System.out.println(year + " "+ brand + " "+ model + " started!!");
	}
	
	public void drive() {
		System.out.println("Driving "+year + " "+ brand + " "+ model );
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price + ", year=" + year
				+ ", miles=" + miles + "]";
	}
	
}
