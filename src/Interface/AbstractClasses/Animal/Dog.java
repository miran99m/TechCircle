package Interface.AbstractClasses.Animal;

public class Dog extends Animal implements Swimmable, Playable {

	
	public void makeSound() {
		System.out.println("Barking");
	}

	@Override
	public void move() {
		System.out.println("Dog is running");
		
		
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating bone");
		
	}

	@Override
	public void swim() {
		System.out.println("Dog can swim");
	}

	@Override
	public void play() {
		System.out.println("Playing with my Dog");
	}
}
