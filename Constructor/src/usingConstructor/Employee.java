package usingConstructor;

public class Employee {
	String name;
	double salary;
	Employee(){
		this.name="pavan";
		this.salary=78;
	}
	Employee(String l_name,double l_salary){
		this.name=l_name;
		this.salary=l_salary;
	}
	void show(){
		System.out.println(this.name+" "+this.salary);
	}
}
