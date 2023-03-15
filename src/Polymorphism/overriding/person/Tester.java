package Polymorphism.overriding.person;

public class Tester extends Employee {

	public Tester(String name, int age, char gender, String job_title, double salary, long employee_id) {
		super(name, age, gender, job_title, salary, employee_id);
	}

	public void smokeTest() {
		System.out.println("Testing major functionality of the application");
	}

	public void regressionTest() {
		System.out.println("When We add new function, we are making sure that old functionality still works "
				+ "fine as expeted.");
	}

	public void createBugReport() {
		System.out.println("Describe the issue");
	}

	public void createTestCase() {
		System.out.println("Steps to the new feature.");
	}

	public void createTestAutomationScript() {
		System.out.println("Coding for new feature.");
	}

//	public void work() {
//		System.out.println("Testing the software");
//	}

}
