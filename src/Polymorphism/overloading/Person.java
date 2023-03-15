package Polymorphism.overloading;

public class Person {

	private String name;
	private int age;

	// Constructor with no parameters
	public Person() {
		name = "Irfan";
		age = 25;
	}

	// Constructor with one parameter
	public Person(String name) {
		this.name = name;
		age = 0;
	}

	// Constructor with two parameters
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter methods for name and age
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public static void main(String[] args) {

		Person person1 = new Person(); // creates a Person object with default values
		Person person2 = new Person("Alice"); // creates a Person object with name "Alice"
		Person person3 = new Person("Bob", 25); // creates a Person object with name "Bob" and age 25

		System.out.println("Person 1:");
		System.out.println("Name: " + person1.getName());
		System.out.println("Age: " + person1.getAge());

		// Print the values of person2
		System.out.println("Person 2:");
		System.out.println("Name: " + person2.getName());
		System.out.println("Age: " + person2.getAge());

		// Print the values of person3
		System.out.println("Person 3:");
		System.out.println("Name: " + person3.getName());
		System.out.println("Age: " + person3.getAge());

	}

}
