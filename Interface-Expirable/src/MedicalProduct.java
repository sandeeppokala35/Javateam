
public  class MedicalProduct implements Expirable{
	String name;
	double price;
	public static final int EXPIRYMONTH=02;
	public static final int EXPIRYYEAR=2023;
	MedicalProduct(){

	}

	public MedicalProduct( String name, double price) {
		super();
		this.name = name;
		this.price = price;
		//this.EXPIRYMONTH = EXPIRYMONTH;
		//this.EXPIRYYEAR = EXPIRYYEAR;
	}


	public void getExpiryMonth() {

		System.out.println(this.EXPIRYMONTH);
	}

	@Override
	public final void getExpiryYear() {
		System.out.println(this.EXPIRYYEAR);

	}
}

