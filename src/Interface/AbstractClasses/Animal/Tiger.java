package Interface.AbstractClasses.Animal;

public class Tiger extends Animal implements Wild, Swimmable {


	@Override
	public void eat() {
		System.out.println("Tiger is eating");
		
	}

	@Override
	public void move() {
		System.out.println("Tiger is running");
		
	}

	@Override
	public void hunt() {
		System.out.println("Tiger is hunting");
		
	}

	@Override
	public void swim() {
		System.out.println("Tiger is swiming");
		
	}
}
