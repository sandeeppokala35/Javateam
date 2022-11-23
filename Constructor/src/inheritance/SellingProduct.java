package inheritance;

public class SellingProduct extends BuyingProduct {

	String Laptop;
	String Cycle;

	public SellingProduct() {
	}

	public SellingProduct(String laptop, String cycle, String car, String bike) {
		super();
		this.Laptop = laptop;
		this.Cycle = cycle;
		this.Car = car;
		this.Bike = bike;
	}

	void show() {
		System.out.println(this.Laptop + " " + this.Cycle + " " + this.Car + " " + this.Bike);

	}

}