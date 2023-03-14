package Inheritance.FirstGenericExample;

public class SuperClass_SubClassTest {

	public static void main(String[] args) {

		SubClass sc = new SubClass();
		
		sc.openBrowser();
		sc.close();
		System.out.println("URL: " + sc.url);
	}

}
