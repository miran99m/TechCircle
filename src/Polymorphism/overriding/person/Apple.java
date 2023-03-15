package Polymorphism.overriding.person;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

	public static void main(String[] args) {
		
		Tester lucia = new Tester("Lucia",18,'F',"SDET",185000,1231234);
		Tester carlito = new Tester("Carlito",18,'M',"SDET",185000,1231235);
		Tester bahar = new Tester("Bahar",18,'F',"SDET",155000,1231236);
		Tester zolboo = new Tester("Zolboo",18,'M',"SDET",165000,1231237);
		
		Employee emp = new Tester("Zolboo",18,'M',"SDET",165000,1231237);
		emp.work();
		System.out.println("TESTER WORKED");
		
		Developer roman = new Developer("Roman",24,'M',"Backend Developer",230000,234564);
		Developer brandon = new Developer("Brandon",24,'M',"Frontend Developer",220000,234565);
		Developer hannah = new Developer("Hannah",24,'F',"Full stack developer",220000,2345666);
		Developer maharem = new Developer("Maharem",24,'F',"Full stack developer",250000,234567);

		ScrumMaster ashley = new ScrumMaster("Ashley", 40 ,'F', 125000,345678);
		ScrumMaster juret = new ScrumMaster("Juret", 43 ,'M', 127000,345679);
		
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(lucia);
		list.add(carlito);
		list.addAll(Arrays.asList(bahar,zolboo,roman,brandon,hannah,maharem,ashley,juret));
		
		int numberOfTester = 0;
		double averageSalaryOfTester = 0;
		double sumOfSalary = 0;
		
		
		for (int i = 0 ; i < list.size() ; i++) {
			
			if (list.get(i).getJob_title().equals("SDET")) {
				System.out.println(list.get(i).toString());
				numberOfTester++;
				sumOfSalary += list.get(i).getSalary();
			}
			
		}
		
		averageSalaryOfTester = sumOfSalary/numberOfTester;
		System.out.println(averageSalaryOfTester);
		
		System.out.println(numberOfTester);



	}
}
