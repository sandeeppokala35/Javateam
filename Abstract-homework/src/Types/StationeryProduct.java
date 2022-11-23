package Types;

public class StationeryProduct extends Product {

	public StationeryProduct() {
		
	}

	public StationeryProduct(String name, double price) {
		super(name, price);
		
	}

	@Override
	void Details() {
	//System.out.println(this.name+" "+this.price);
	this.info=this.name+" "+this.price;
	}

}
