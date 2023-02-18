package Constructor;

public class Employees {

	String name;
	double salary;

	Employees() {
		this.name = "";
		this.salary = 10000;
	}

	Employees(String l_name, double l_salary) {
		this.name = l_name;
		this.salary = l_salary;
	}

	void show() {
		System.out.println(this.name + " " + this.salary);
	}

}
