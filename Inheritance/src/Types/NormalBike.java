package Types;

public class NormalBike extends Vehicles{
	String model="pulsar";	
	double speed=100;
	void model() {
		System.out.println("this vehicle model is "+model);
	}
	void topspeed() {
		System.out.println("this vehicle topspeed is "+speed+"kmph");



	}
}