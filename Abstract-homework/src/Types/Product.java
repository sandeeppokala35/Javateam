package Types;

public abstract class Product {

	String info;
	String name;
	double price;
	public Product() {

	}
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	abstract void Details();
	void show() {
	System.out.println(info);
	}

}