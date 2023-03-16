package Interface.AbstractClasses.Animal;

public class Cat extends Animal implements Playable {

	@Override
	public void eat() {
		System.out.println("Cat is eating");
	}

	@Override
	public void move() {
		System.out.println("Cat is moving");
		
	}

	@Override
	public void play() {
		System.out.println("Cat is playing");
		
	}
}
