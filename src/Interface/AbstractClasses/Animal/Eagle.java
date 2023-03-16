package Interface.AbstractClasses.Animal;

public class Eagle extends Animal implements Flyable, Wild {

	
	@Override
	public void move() {
		
		System.out.println("EAgle is flying!");
		
	}

	@Override
	public void hunt() {
		System.out.println("Eagle can hunt");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("Eagle is flying");
		
	}
}
