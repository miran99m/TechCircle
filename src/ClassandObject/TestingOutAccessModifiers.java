package ClassandObject;
import AccessModifiers.Person;
public class TestingOutAccessModifiers {

	public static void main(String[] args) {
	
		Person person = new Person();
		
		person.name = "Mirn";
//		person.occupation = "SDET"; 		//Error Bc Occupation is default
//		person.address = "123 Ashby Pl";	// Error BC Address is prrotected
		
		
		
	}

}
