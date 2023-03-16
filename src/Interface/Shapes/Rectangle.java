package Interface.Shapes;

// Implement the "Drawable" interface in a class named "Rectangle"
public class Rectangle implements Drawable {

	    private int x;
	    private int y;
	    private int width;
	    private int height;

	    // Constructor method
	    public Rectangle(int x, int y, int width, int height) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	    }

	    // Implement the "draw" method from the "Drawable" interface
	    public void draw() {
	        System.out.println("Drawing a rectangle at (" + x + "," + y + ") with width " + width + " and height " + height);
	    }
	

}
