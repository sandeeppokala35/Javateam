package inheritance;

public class Mobile { // Super class
	private String iphone;

	public Mobile() {
	}

	public Mobile(String iphone) {
		super();
		this.setIphone(iphone);

	}

	void show() {
		System.out.println(this.getIphone());
	}

	public String getIphone() {
		return iphone;
	}

	public void setIphone(String iphone) {
		this.iphone = iphone;
	}

}
