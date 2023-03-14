package Inheritance.AnimalExample;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal("Generic Animal", 1, "Unknown", 10.0);
		Dog dog = new Dog("Rex", 3, "Male", 20.0, "German Shepherd");
		Cat cat = new Cat("Whiskers", 2, "Female", 5.0, 1.5);

		animal.eat();
		animal.sleep();
		System.out.println();
		dog.eat();
		dog.sleep();
		dog.bark();
		dog.makeSound();
		System.out.println();
		cat.eat();
		cat.sleep();
		cat.scratch();
		cat.makeSound();
		System.out.println();

		Animal[] animals = { animal, dog, cat };
		for (Animal a : animals) {
			System.out.println(a);
		}
	}

}
