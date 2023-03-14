package Inheritance.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Generic Vehicle", "Generic Model", 2023, 4);
		Car car = new Car("Toyota", "Camry", 2019, 4, 4, "White");
		Truck truck = new Truck("Ford", "F-150", 2021, 4, 6.5, 10000);
		MotorCycle motorcycle = new MotorCycle("Harley-Davidson", "Sportster", 2022, 2, 1, 883.0);

		System.out.println("Details of the Vehicle object:");
		System.out.println(vehicle);

		System.out.println("Details of the Car object:");
		System.out.println(car);

		System.out.println("Details of the Truck object:");
		System.out.println(truck);

		System.out.println("Details of the Motorcycle object:");
		System.out.println(motorcycle);
	}

}
