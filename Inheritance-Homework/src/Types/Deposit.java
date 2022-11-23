package Types;

public class Deposit {//super class
	private int accountnum;
	private String customername;
	public Deposit() {
		
	}
	public Deposit(int accountnum, String customername) {
		super();
		this.setAccountnum(accountnum);
		this.setCustomername(customername);

	}
	void show() {
		System.out.println(this.getAccountnum()+" "+this.getCustomername());
	}
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
}
