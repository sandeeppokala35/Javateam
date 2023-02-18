package PractiseWorld;

import java.util.HashSet;
import java.util.Set;

public class SetTree {

	public static void main(String[] args) {
		Set<Employee> hr = new HashSet<Employee>();

		Employee emp1 = new Employee(125478, "Pavan", 702545874, 100000, "google");
		Employee emp2 = new Employee(125485, "Nandu", 75484565, 100000, "google");
		Employee emp3 = new Employee(125485, "Sandeep", 703603795, 10000, "GHMC");

		hr.add(emp1);
		hr.add(emp2);
		hr.add(emp3);
		hr.add(emp3);
		System.out.println(hr);
		hr.remove(emp3);
		System.out.println(hr);
		hr.add(emp3);
		System.out.println(hr);
		System.out.println(hr.size());
		hr.clear();
		System.out.println(hr);
		System.out.println(hr.containsAll(hr));
		hr.isEmpty();
		System.out.println(hr);

	}

}
