package Staticinheritance;

public class Example_MethodParameterization_Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add();
		// System.out.println(sum(900, 300));
		// sum(500, 400);
		int s = 300;
		int p = s + sum(300, 500);
		System.out.println(p);
		System.out.println(p + sum(800, 900));

	}

	public static void add() {
		int x = 200;
		int y = 400;

		int z = x + y;
		System.out.println("Sum: " + z);
	}

	public static int sum(int x, int y) {
		int z = x + y;
		return z;
	}

}
