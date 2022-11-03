package ApiStream;

public class Lcm {

	final static int n = 10;

	static int lcm(int a, int b) {
		while (b != 0) {
			int temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}

	public static void main(String[] args) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			int value = lcm(i, result);
			result = result / value * i;
		}
		System.out.println(result);

	}

}
