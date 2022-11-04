package homework1;

public class Item1 {
	int id;
	String name;
	double price;
	
	public Item1() {
		// TODO Auto-generated constructor stub
	}
	public Item1(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
		
	public void show() {
			System.out.println(this.id+this.name+this.price);
		}
	
	
	
	@Override
	public String toString() {
		return "Item1 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
