package Encapsulation;

public class Employee {
	/*
	The class should have the following attributes:

		Name (String)
		Age (int)
		Department (String)
		Salary (double)
		
		The class should have a constructor that takes in these four attributes and initializes them. 
		The class should also have getter and setter methods for each attribute to allow controlled access to the attributes.
		
		speak(): This method should print out a greeting with the employee's name and department.
		work(): This method should print out a message indicating that the employee is working hard.
		receiveRaise(double amount): This method should take an amount as a parameter and add it to the employee's salary, 
									 then print out a message indicating the new salary.
	
	*/
	
	
	private String name;
	private int age;
	private String department;
	private double salary;

	public Employee(String name, int age, String department, double salary) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void speak() {
		System.out.println("Hello, my name is " + name + " and I work in the " + department + " department.");
	}

	public void work() {
		System.out.println("Working hard to meet our company goals.");
	}

	public void receiveRaise(double amount) {
		salary += amount;
		System.out.println("Congratulations, you have received a raise. Your new salary is $" + salary);
	}
}
