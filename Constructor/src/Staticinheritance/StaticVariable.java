package Staticinheritance;

class Employee {
	int employeeid;
	String employeeName;
	double salary;

	Employee(int employeeid, String employeeName, double salary) {
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.salary = salary;

	}

	void employeeinfo() {
		System.out.println("Employee Id:" + employeeid);
		System.out.println("Employee Name;" + employeeName);
		System.out.println("Employee salary;" + salary);
	}
}

public class StaticVariable {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Pavan", 100000.00);
		Employee e2 = new Employee(2, "Narendra", 100000.00);
		Employee e3 = new Employee(3, "Sandeep", 100.00);

		e1.employeeinfo();
		e2.employeeinfo();
		e3.employeeinfo();

	}

}
