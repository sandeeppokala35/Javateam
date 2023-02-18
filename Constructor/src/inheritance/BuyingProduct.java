package inheritance;

public class BuyingProduct {

	String Car;
	String Bike;

	public BuyingProduct() {
	}

	public BuyingProduct(String car, String bike) {
		super();
		this.Car = car;
		this.Bike = bike;
	}

	void show() {
		System.out.println(this.Car + " " + this.Bike);
	}

}
