package Polymorphism.overriding.person;

public class Person {

	//First define with out PRIVATE FIRST THEN TYPE LATER****** 
	// instance variables
	private String name;
	private int age;
	private char gender;

	// constructor
	public Person(String name, int age, char gender) {
		// assigning value to instance variables
		// this.name = name. ==> assigning value to instance variable name.

		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// getter is read data.
	public String getName() {
		return name;
	}

	// setter is update the data
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// instance methods
	public void eat() {
		System.out.println(name + " is eating");
	}

	public void drink() {
		System.out.println(name + " is drinking");
	}

	public void sleep() {
		System.out.println(name + " is sleeping");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
