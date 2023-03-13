package ClassandObject;

public class PersonObj {

	public static void main(String[] args) {

		// create a person
		Person person1 = new Person("John", 30, "software engineer","123 broadly rd", true);

		// call methods on person1
		person1.birthday();
		person1.changeOccupation("web developer");
		person1.introduce();

		
		// create another person
		Person person2 = new Person("Jane", 25, "teacher","777 ashby pl", true);

		// call methods on person2
		person2.birthday();
		person2.birthday();
		person2.changeOccupation("marketing specialist");
		person2.introduce();
		
		
	}

}
