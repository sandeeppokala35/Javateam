package Homework;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> Hr= new ArrayList<Employee>();
		Employee e=new Employee(1010,"sandeep",15000);
		Employee e1=new Employee(1011,"pavan",10000);

		Hr.add(e);
		Hr.add(e1);
		

		System.out.println(Hr);
		System.out.println("After Adding-----------");
		for(Employee employee:Hr) {
			System.out.println(employee);
		}
		Hr.remove(1);
		System.out.println("After Removing-------------");
		for(Employee employee:Hr) {
			System.out.println(employee);
			
		}
	}


}
