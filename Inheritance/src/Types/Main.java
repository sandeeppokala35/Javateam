package Types;

public class Main {

	public static void main(String[] args) {
		//Vehicles v=new Vehicles();
		NormalBike pulsar=new NormalBike();
		NormalBike normalspeed=new NormalBike();
		oldBike re=new oldBike();
		oldBike averagespeed=new oldBike();
		SportsBike ducatti=new SportsBike();
		SportsBike racing=new SportsBike();
		pulsar.model();
		normalspeed.topspeed();
		re.model();
		averagespeed.topspeed();
		ducatti.model();
		racing.topspeed();

	}

}
