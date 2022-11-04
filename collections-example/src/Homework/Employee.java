package Homework;

public class Employee {
	int id;
	String name;
	double salary;
	Employee(){//default constructor
		
	}
	public Employee(int id, String name, double salary) {//parameterized constructor
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void show() {
		System.out.println(this.id+this.name+this.salary);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
