package Staticinheritance;

public class TestBike {

	public static void main(String[] args) {

		Bike b = new Bike(); // create of object of the bike
		b.colour = "Black";
		b.startBike();

		makeHonda m = new makeHonda(); // create object makeHonda Class
		m.colour = "BLUE";
		m.startBike();
		m.tyreTypes();
		m.breakBike();
		m.stopBike();
	}

}
