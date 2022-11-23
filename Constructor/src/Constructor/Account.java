package Constructor;

public class Account {

	String name;
	double balance;

	Account() {
		this.name = "";
		this.balance = 50000;
	}

	Account(String l_name, double l_salary) {
		this.name = l_name;
		this.balance = l_salary;
	}

	void show() {
		System.out.println(this.name + " " + this.balance);
	}

}
