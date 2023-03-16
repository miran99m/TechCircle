package Interface.AbstractClasses.Animal;

public class Parrot extends Animal implements Flyable, Playable {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("Parrot is flying");
		
	}

	@Override
	public void play() {
		System.out.println("Playing with parrot");
		
	}

}
