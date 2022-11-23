package inheritance;

public class Laptop extends Mobile {

	String Dell;

	public Laptop() {
	}

	public Laptop(String Dell, String iphone) {
		super();
		this.Dell = Dell;
		this.setIphone(iphone);
	}

	void show() {
		System.out.println(this.Dell + " " + this.getIphone());
	}

}
