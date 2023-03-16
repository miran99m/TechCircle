package Interface.Shapes;

public class TestShape {

	public static void main(String[] args) {

		// Create an array of "Drawable" objects
		Drawable[] shapes = new Drawable[2];

		// Add a "Circle" object and a "Rectangle" object to the array
		shapes[0] = new Circle(10, 20, 30);
		shapes[1] = new Rectangle(50, 60, 70, 80);

		
		// Loop through the array and call the "draw" method on each object
		for (Drawable shape : shapes) {
		    shape.draw();
		}
	}

}
