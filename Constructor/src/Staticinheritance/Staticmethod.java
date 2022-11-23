package Staticinheritance;

public class Staticmethod {

	public static void main(String[] args) { // main method

		System.out.println("Good Morning");

		Fistclass(); // reference
		Secondclass();// reference
		Sandeeepclass();// reference

	}

	public static void Sandeeepclass() {
		System.out.println("45SANDEEP");

	}

	public static void Fistclass() { // static method
		System.out.println(123456789);

	}

	public static void Secondclass() {
		System.out.println("sandeep");
	}
}