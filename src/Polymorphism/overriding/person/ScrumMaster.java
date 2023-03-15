package Polymorphism.overriding.person;

public class ScrumMaster extends Employee {

	public ScrumMaster(String name, int age, char gender, double salary, long employee_id) {
		super(name, age, gender, "PO", salary, employee_id);

	}

	public void work() {
		System.out.println("I ask for updates from the developers and testers. I talk a lot!");
	}

	public void arrangeMeetings() {
		System.out.println("Arrange meetings if neeeded for team to colloborate");
	}
}
