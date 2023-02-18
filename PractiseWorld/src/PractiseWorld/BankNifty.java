package PractiseWorld;

public final class BankNifty implements Trading {

	String stockname;
	double closingprice;

	public BankNifty() {

	}

	public BankNifty(String stockname, double closingprice) {
		this.stockname = stockname;
		this.closingprice = closingprice;
	}

	@Override
	public void getTrading() {

		System.out.println(this.stockname + " " + this.closingprice);

	}

}
