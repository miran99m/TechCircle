package Interface.AbstractClasses.Animal;

abstract public class Animal {

	abstract public void eat() ;
	
	abstract public void move();
	
	public void drink() {
		System.out.println("Animal is drinking water");
	}
}
