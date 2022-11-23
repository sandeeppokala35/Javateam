package Types;

public class Vehicle {
	
	String name;
	Vehicle(){
		this.name="pulsar";
	}
	Vehicle(String l_name){
		this.name=l_name;
	}
	void show() {
		System.out.println(this.name);
	}

	class bike extends Vehicle{

		public static void main(String[] args) {
			Vehicle v=new Vehicle("pulsar");
			v.show();

		}
	}
}