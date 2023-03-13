package Encapsulation;

public class EmployeeObj {

	public static void main(String[] args) {
		  // Create some Employee objects
        Employee john = new Employee("John Smith", 30, "Sales", 50000);
        Employee mary = new Employee("Mary Jones", 25, "Marketing", 45000);
        Employee bob = new Employee("Bob Johnson", 40, "Engineering", 60000);

        // Test out the getter methods
        System.out.println(john.getName()); // Output: John Smith
        System.out.println(mary.getAge()); // Output: 25
        System.out.println(bob.getDepartment()); // Output: Engineering
        System.out.println(john.getSalary()); // Output: 50000.0

        // Test out the setter methods
        mary.setAge(26);
        bob.setDepartment("Research");
        john.setSalary(55000);
        john.receiveRaise(10000);
        // Test out the other methods
        john.speak(); // Output: Hello, my name is John Smith and I work in Sales.
        mary.work(); // Output: Mary Jones is working hard.
        bob.receiveRaise(10000); // Output: Bob Johnson's new salary is 70000.0.
	}

}
