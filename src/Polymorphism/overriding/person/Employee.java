package Polymorphism.overriding.person;

public class Employee extends Person {
	// instance variables
	private String job_title;
	private double salary;
	private long employee_id;
	
	
	
	public Employee(String name, int age, char gender, String job_title, double salary, long employee_id) {
		super(name, age, gender); // calling super class parameterized constructor
		this.job_title = job_title;
		this.employee_id = employee_id;
		this.salary = salary;
	}


	public void work() {
		System.out.println(getName() + " is working");
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [job_title=" + job_title + ", salary=" + salary + ", employee_id="
				+ employee_id + "]";
	}

}
