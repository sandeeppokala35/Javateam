package inheritance;

public class Parrot {// super class
	private String feathers;// variable

	public Parrot() {// constructor 1 default
	}

	public Parrot(String feathers) {// constructor 2
		super();
		this.setFeathers(feathers);
	}

	protected void show() {
		System.out.println(this.getFeathers());
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

}
