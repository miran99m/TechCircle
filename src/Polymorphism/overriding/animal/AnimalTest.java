package Polymorphism.overriding.animal;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();

		Horse horse1 = new Horse();
		Horse horse2 = new Horse();
		Horse horse3 = new Horse();

		
		dog1.makeSound();
		dog1.walk();
		
		cat1.walk();
		cat1.makeSound();
		
		// super type == sub type.
		
		Animal a = new Cat();
		Animal b = new Dog();
		Animal c = new Horse();
		
		a.walk();
		b.walk();
		c.walk();
		
		a.eat();
		b.eat();
		c.eat();
		
		
		ArrayList<Dog> dogs = new ArrayList<>();
		
		dogs.add(dog2);
		dogs.add(dog1);
		dogs.add(dog3);
		
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(cat2);
		cats.add(cat1);
		cats.add(cat3);
		ArrayList<Horse> horses = new ArrayList<>();
		
		horses.add(horse2);
		horses.add(horse1);
		horses.add(horse3);
		ArrayList<Animal> list = new ArrayList<>();
		list.addAll(cats);
		list.addAll(horses);
		list.addAll(dogs);
		
		System.out.println("---------");
		for (Animal animal : list) {
			
			animal.eat();
//			animal.makeSound();
			System.out.println();

		}
		
	}

}
