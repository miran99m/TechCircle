package Inheritance.SecondEmployeeExample;

public class Person_EmployeeTest {

	public static void main(String[] args) {

		Employee miran = new Employee();
		miran.age = 24;
		miran.employee_id = 34930;
		miran.jobTitle = "SDET";
		miran.name = "Miran";
		miran.phoneNumber = "39348384358";
		miran.salary = 125000;

		miran.eat();  // Super Class - From Person Class
		miran.sleep();// Super Class - From Person Class
		miran.drink();// Super Class - From Person Class
		miran.work(); // SubClass - From Employee Class

		System.out.println(miran.toString());
		
	
		
	}

}
