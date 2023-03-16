package Interface.AbstractClasses.Animal;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalTest {

	public static void main(String[] args) {

//		Animal a = new Animal(); // Cannot instantiate type of Animal, because its and abstract class
		
		Animal dog = new Dog();
		Animal shark = new Shark();
		Animal eagle = new Eagle();
		Animal horse = new Horse();
		Animal parrot = new Parrot();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		
		Animal arr[] = {dog, shark, eagle, horse, parrot, cat, tiger};
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].move(); // overriding the move method.
			arr[i].drink();
			arr[i].eat();
		}
		System.out.println("--------------------");
		ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(dog, shark, eagle, horse, parrot, cat, tiger));
		
		// Animal can hunt
		
		ArrayList<Wild> hunters = new ArrayList<>();
		
		hunters.add( (Wild)eagle);
		hunters.add( (Wild)tiger);
		hunters.add( (Wild)shark);
		
	//	hunters.add(  (Wild)cat);

		for(int i = 0 ; i < hunters.size() ; i++) {
			hunters.get(i).hunt();
		}
		
		
	}

}
