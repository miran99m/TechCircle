package Interface.AbstractClasses.Animal;

public class Horse extends Animal implements Playable, Swimmable {

	
	@Override
	public void eat() {
		System.out.println("Horse is eating apple");		
	}

	@Override
	public void move() {
		System.out.println("Horse is running");		
		
	}

	@Override
	public void play() {
		System.out.println("playing with horse");		
		
	}

	@Override
	public void swim() {
		System.out.println("Horse is swimming");		
		
	}
}
