package Polymorphism.overloading;

public class AreaCalculator {

	public final double PI = 3.14;
	
	public double getArea(double radius) {
		// Circle
		System.out.println("Circle");
		return PI * radius * radius;
	}

	public double getArea(double a, double b) {
		// Rectangle
		System.out.println("Rectangle");
		return a * b;
	}

	public double getArea(int h, double b) {
		System.out.println("Triangle");
		return h * b / 2;
	}

	public static int getArea(int a) {
		return a + 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getArea(5.0);

		AreaCalculator areaCal = new AreaCalculator();

		System.out.println(areaCal.getArea(5.0));

		System.out.println(areaCal.getArea(5, 10.0));

		System.out.println(areaCal.getArea(5.0, 10.0));

		System.out.println(AreaCalculator.getArea(9));
//		System.out.println(getArea(9));
	}
}
