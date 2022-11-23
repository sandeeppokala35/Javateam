package Types;

public class SportsBike extends Vehicles {
	String model="ducatti";	
	double speed=320;
	void model() {
		System.out.println("this vehicle model is "+model);
	}
	void topspeed() {
		System.out.println("this vehicle topspeed is "+speed+"kmph");

	}
}
