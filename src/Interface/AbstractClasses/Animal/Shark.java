package Interface.AbstractClasses.Animal;

public class Shark extends Animal implements Swimmable, Wild {

	@Override
	public void move() {
		
		System.out.println("Shark is swiming");
		
	}

	@Override
	public void eat() {
		System.out.println("Shark is eating fish");
		
	}

	@Override
	public void swim() {
		System.out.println("Shark is swiming");
		
	}

	@Override
	public void hunt() {
		System.out.println("Shark is hunting");
		
	}
}
