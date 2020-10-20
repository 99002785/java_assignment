package comparable_java;

import java.util.ArrayList;
import java.util.Collections;





public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 = new Employee("Visva","Chennai",123);
		Employee employee2 = new Employee("John","Kolkata",124);
		Employee employee3 = new Employee("zeenath","Ooty",125);
		Employee employee4 = new Employee("Akshay","Pune",126);
		Employee employee5 = new Employee("Sri","Chennai",127);
		
		
		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);
		emplist.add(employee4);
		emplist.add(employee5);
		
		for(Employee emp : emplist) {
			System.out.println(emp);
		}
		
		System.out.println("Sorted list");
		
		Collections.sort(emplist);
		for(Employee emp : emplist) {
			System.out.println(emp);
		}
		
		
	}

}
