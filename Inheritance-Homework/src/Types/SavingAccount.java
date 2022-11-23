package Types;

public class SavingAccount extends Account{//sub class
	double balance;
	public SavingAccount() {

	}

	public SavingAccount(int id,String name ,double balance) {

		this.setId(id);
		this.setName(name);
		this.balance =balance;

	}
	public void show() {
		System.out.println(this.getId()+" "+this.getName()+" "+this.balance);


	}
}