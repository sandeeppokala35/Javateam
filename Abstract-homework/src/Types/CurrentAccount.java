package Types;

public class CurrentAccount extends Account {
	double rateofinterest;
	double principle;
	int month;
	public CurrentAccount() {

	}
	
	public CurrentAccount(double rateofinterest, double principle, int month) {
		super();
		this.rateofinterest = rateofinterest;
		this.principle = principle;
		this.month = month;
	}

	void interest() {
	//	System.out.println(this.interest);
		this.result=(this.rateofinterest*this.principle*this.month)/100;
	}
}
