package Package;

import java.util.ArrayList;

public class Company {

	public static void main(String[] args) {
		ArrayList<Employee> hr = new ArrayList<Employee>();

		Employee emp1 = new Employee(1025478, "Pavan", 50000);
		Employee emp2 = new Employee(2548550, "Narendar", 50000);

		hr.add(emp1);
		hr.add(emp2);
		System.out.println(hr.get(1));
		System.out.println(hr.size());

		for (int i = 0; i < hr.size(); i++) {
			System.out.println(hr.get(i));
		}
	}

}
