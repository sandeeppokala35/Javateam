package Constructor;

public class Product {

	String name;
	double price;

	// Constructor ( To initialize )

	Product() {
		this.name = "";
		this.price = 500;
	}

	Product(String l_name, double l_price) {
		this.name = l_name;
		this.price = l_price;
	}

	// methods ( To process data )

	void show() {
		System.out.println(this.name + " " + this.price);
	}

}
