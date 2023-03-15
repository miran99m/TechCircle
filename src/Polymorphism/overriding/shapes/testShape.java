package Polymorphism.overriding.shapes;

public class testShape {

	public static void main(String[] args) {

		
	//  SuperClass ref = new SubClass();
		
		Shape shape = new Shape();
		
		shape.area(); // will grab the area() from Shape Class(Parent Class)
		
		//----------------
		
		Shape triangle = new Triangle(); // OverRiding
		
		triangle.area(); // will grab the area() from triangle Class(subClass) if area() is stated in Triangle class.
		
		
		//----------------
		
		Shape circle = new Circle(); //Overriding
		circle.area(); // will grab from the Parent class if area() is not stated in circle class.
		
		
		
		
		/*
		 * When we write Triangle triangle = new Shape();, we are trying to assign an instance of the Shape class to a variable of type Triangle.
			This does not work because a Shape is not a type of Triangle.
			We can only assign an object of a subclass to a variable of its superclass type, not the other way around.
			In other words, a Triangle object has all the properties and behavior of a Shape object, but a Shape object does not necessarily have all the properties and behavior of a Triangle object.
			Therefore, we cannot use a Shape object as a Triangle object.
		 */
//		Triangle triangle = new Shape();  //Unacceptable in java!
		
	
		
		
	}

}
