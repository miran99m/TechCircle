package Inheritance.AnimalExample;

public class Cat extends Animal {
	private double clawLength;

	public Cat(String name, int age, String gender, double weight, double clawLength) {
		super(name, age, gender, weight);
		this.clawLength = clawLength;
	}

	public void scratch() {
		System.out.println(name + " is scratching.");
	}

	public void makeSound() {
		System.out.println(name + " says meow!");
	}

	public String toString() {
		return super.toString() + "Claw Length: " + clawLength + "\n";
	}
}
