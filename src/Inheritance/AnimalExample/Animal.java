package Inheritance.AnimalExample;

public class Animal { // SUPER CLASS

	protected String name;
	protected int age;
	protected String gender;
	protected double weight;

	public Animal(String name, int age, String gender, double weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

	public void eat() {
		System.out.println(name + " is eating.");
	}

	public void sleep() {
		System.out.println(name + " is sleeping.");
	}

	public void makeSound() {
		System.out.println("Animal sound.");
	}

	public String toString() {
	        return "Name: " + name + "\n" +
	               "Age: " + age + "\n" +
	               "Gender: " + gender + "\n" +
	               "Weight: " + weight + "\n";
	    }
	
}
