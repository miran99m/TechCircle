package Polymorphism.overriding.person;

public class Developer extends Employee {

	
	public Developer(String name, int age, char gender, String job_title, double salary, long employee_id) {
		super(name, age, gender, job_title, salary, employee_id);
		
	}

	public void code(String ticketNumber) {
		System.out.println("working on story "+ ticketNumber);
	}
	
	public void fixingBug() {
		System.out.println("As a " + getJob_title() + " I fix many bugs!");
	}
	
	public void sleep() {
		System.out.println("I'm a developer. I can sleep ony 5 hours a day.");
	}
	
	public void work() {
		System.out.println("I build so many different software");
	}
}
