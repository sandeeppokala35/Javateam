package Types;

public class Product implements Taxable {
	String name;
	double price;
	public static final double TAX=1.5;

	public Product() {

	}
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void getTax() {
	
		System.out.println(this.name+" "+this.price+ " "+"TAX is" +TAX);
		System.out.println("total bill is" +(price+TAX));
	}
}
