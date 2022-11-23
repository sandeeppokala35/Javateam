package PractiseWorld;

public class Employee {

	int id;
	String name;
	int phonenumber;
	double salary;
	String companyname;

	public Employee() {
	}

	public Employee(int id, String name, int phonenumber, double salary, String companyname) {
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.salary = salary;
		this.companyname = companyname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + ", salary=" + salary
				+ ", companyname=" + companyname + "]";
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

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

}
