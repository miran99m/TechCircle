package ClassandObject;

public class Person {

	/*
	 * Task: Create a class called "Person" along with the following instance
	 * variables:
	 * 
	 * name (String) age (int) occupation (String) address(String) isMarried(boolean)
	 * 
	 * Create a constructor for the class that takes in values for all three
	 * instance variables and initializes them.
	 * 
	 * Create the following methods for the class:
	 * 
	 * birthday() - increments the age of the person by 1 
	 * 
	 * changeOccupation(String newOccupation) - updates the person's occupation to the new value passed in as a parameter
	 * 
	 * move(String newAddress) - updated the person's address 
	 * 
	 * getMartialStatus() - returns true or false based on the martial status of the person.
	 * 
	 * introduce() - prints out a statement introducing the person with their name, age, and occupation
	 * 
	 */

	// instance variables
	String name;
	int age;
	String occupation;
	String address;
	boolean isMarried;

	// constructor
	public Person(String name, int age, String occupation, String address, boolean isMarried) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		this.address = address;
		this.isMarried = isMarried;
	}

	// methods
	public void birthday() {
		age++;
	}

	public void changeOccupation(String newOccupation) {
		occupation = newOccupation;
	}

	public void move(String newAddress) {
		address = newAddress;
	}

	public boolean getMaritalStatus() {
		return isMarried;
	}

	public void introduce() {
		System.out
				.println("Hi, my name is " + name + ". I am " + age + " years old and I work as a " 
		+ occupation + "\n Married: " + isMarried + "\n Address: " + address+".");
	}

}
