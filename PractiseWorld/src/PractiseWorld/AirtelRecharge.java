package PractiseWorld;

public class AirtelRecharge implements Expirable {
	String name;
	double price;
	public static final int EXPIRYMONTH = 12;
	public static final int EXPIRYPRICE = 560;

	AirtelRecharge() {
	}

	public AirtelRecharge(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public void getExpirableMonth() {
		System.out.println(this.EXPIRYMONTH);

	}

	@Override
	public void getExpirableDate() {
		System.out.println(this.EXPIRYPRICE);
	}

}
