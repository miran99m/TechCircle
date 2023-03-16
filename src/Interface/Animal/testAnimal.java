package Interface.Animal;

public class testAnimal {

	public static void main(String[] args) {

		//Animal animal = new Animal(); // Not Allowed - We cannot instantiate the type Animal as it is interface.
		//t is not possible to override a method within 
		//an interface because methods in an interface are abstract by default, and abstract methods cannot have a body.
		
		
		// Create a "Dog" object and call the "speak" and "eat" methods on it
		Dog myDog = new Dog("Rex");
		myDog.speak();
		myDog.eat("dog food");

		// Create a "Cat" object and call the "speak" and "eat" methods on it
		Cat myCat = new Cat("Whiskers");
		myCat.speak();
		myCat.eat("cat food");
		
		Animal cat1 = new Cat("King");
		
		cat1.speak();
		
		
		
		
	}

}
