package Types;

public class MedicalProduct extends Product {
String name1;
double price;
String expiryyear;
String expirymonth;
	public MedicalProduct() {
		
	}

	public MedicalProduct(String name1, double price, String expiryyear, String expirymonth) {
		super();
		this.name1 = name1;
		this.price = price;
		this.expiryyear = expiryyear;
		this.expirymonth = expirymonth;
	}

	@Override
	void Details() {
		//System.out.println(this.name1+" "+this.price+" "+this.expiryyear+" "+this.expirymonth);
	this.info=this.name1+" "+this.price+" "+this.expiryyear+" "+this.expirymonth;
	}

}
