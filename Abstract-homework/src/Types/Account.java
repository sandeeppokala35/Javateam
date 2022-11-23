package Types;

public abstract class Account {
	double result;

	public Account() {

	}
	public Account(double result) {
		super();
		this.result = result;
	}

	abstract void interest();
	void show() {
		System.out.println(result);
	}

}
