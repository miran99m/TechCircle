package Polymorphism.overriding.animal;

public class Dog extends Animal {

	public void makeSound() {
		System.out.println("I'm a Dog, Barking..");
	}

	public void walk() {
		System.out.println("Dog is walking");
	}
	
	public void eat() {
		System.out.println("Dog is eating bone");
	}
	
}
