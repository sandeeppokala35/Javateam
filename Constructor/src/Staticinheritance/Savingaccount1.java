package Staticinheritance;

public class Savingaccount1 extends Account1 {

	public Savingaccount1(int id, String name, double balance) {
		super(id, name, balance);

	}

	void show() {
		System.out.println(this.id + " " + this.name + " " + this.balance);

	}

}
