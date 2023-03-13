package AccessModifiers;

public class PersonObj {

	public static void main(String[] args) {

		Person person = new Person("John", 30, "123 Main St", "Software Engineer");

		person.printName(); // Output: Name: John
//		person.printAge(); // This line will cause a compilation error because age is private
		person.printAddress(); // This line will cause a compilation error because address is protected and we
								// are not in a subclass of Person
		person.printOccupation(); // Output: Occupation: Software Engineer
	}
	
}
