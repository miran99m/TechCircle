package Interface.Shapes;

// Implement the "Drawable" interface in a class named "Circle"
public class Circle implements Drawable {

	private int x;
	private int y;
	private int radius;

	// Constructor method
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// Implement the "draw" method from the "Drawable" interface
	public void draw() {
		System.out.println("Drawing a circle at (" + x + "," + y + ") with radius " + radius);
	}

}
