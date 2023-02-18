package inheritance;

public class Peacock extends Parrot {// sub class
	String eyes;// variable

	public Peacock() {
	}

	public Peacock(String feathers, String eyes) {
		super();
		this.eyes = eyes;
		this.setFeathers(feathers);
	}

	public void show() {
		System.out.println(this.getFeathers() + " " + this.eyes);

	}
}
