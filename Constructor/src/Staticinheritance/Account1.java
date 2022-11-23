package Staticinheritance;

public class Account1 {
	int id;
	String name;
	double balance;

	public Account1(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;

	}

	void show() {
		System.out.println(this.id + " " + this.name + this.balance);
	}

}
