package PractiseWorld;

public class Items {

	int id;
	String name;
	double price;

	public Items() {

	}

	public Items(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	void show() {
		System.out.println(this.id + " " + this.name + " " + this.price);
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
