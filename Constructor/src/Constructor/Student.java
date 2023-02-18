package Constructor;

public class Student {

	String name;
	double marks;

	Student() {
		this.name = "";
		this.marks = 100;
	}

	Student(String l_name, double l_salary) {
		this.name = l_name;
		this.marks = l_salary;
	}

	void show() {
		System.out.println(this.name + " " + this.marks);
	}

}
