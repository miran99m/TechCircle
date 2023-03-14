package Inheritance.SecondEmployeeExample;

public class Employee extends Person {

	// instance variables
	String jobTitle;
	double salary;
	long employee_id;
	
	
	// instance method
	public void work() {
		System.out.println(name +" is working");
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]" +"Employee [jobTitle=" + jobTitle + ", salary=" + salary + ", employee_id=" + employee_id + "]";
	}
}
