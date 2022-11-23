package Types;

public class FixedDeposit extends Deposit {//sub class
	double amount;
	public FixedDeposit() {
		
	}

	public FixedDeposit(int accountnum,String customername ,double amount) {
		this.setAccountnum(accountnum);
		this.setCustomername(customername);
		this.amount = amount;

	}
	void show() {
		System.out.println(this.getAccountnum()+" "+this.getCustomername()+" "+this.amount);


	}
}
