package AccessModifiers;

public class Person {

	/*
	Public: Accessible from anywhere in the application.
	Private: Accessible only within the same class.
	Protected: Accessible within the same class and its subclasses.
	Default/Package-private: Accessible within the same package.
	*/
	
	public String name; 
	private int age; 
	protected String address;
	String occupation; // default access modifier (also known as package-private)

	public Person(String name, int age, String address, String occupation) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.occupation = occupation;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void printName() {
		System.out.println("Name: " + this.name);
	}

	private void printAge() {
		System.out.println("Age: " + this.age);
	}

	protected void printAddress() {
		System.out.println("Address: " + this.address);
	}

	void printOccupation() {
		System.out.println("Occupation: " + this.occupation);
	}

}

