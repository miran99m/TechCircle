package Inheritance.FirstGenericExample;

public class SuperClass {

	// instance variables
	String url = "www.techcircle.com";
	String userName = "techcircle";
	String password = "circle2023";
	
	//instance method
	public void openBrowser() {
		System.out.println("Opening chrome");
	}
	
	public void close() {
		System.out.println("Closing chrome browser");
	}
}
