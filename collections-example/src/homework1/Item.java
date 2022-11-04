package homework1;

public class Item {
	int id;
	String name;
	double price;
	public Item() {

	}
	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	//void show(){
	//	System.out.println(this.id+this.name+this.price);
	//}
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
	public void show(){
		System.out.println(this.id+this.name+this.price);
	}
	
}
