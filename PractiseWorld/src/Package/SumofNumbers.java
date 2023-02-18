package Package;

public class SumofNumbers {

	int start = 1;
	int limit = 20;
	int step = 1;
	int sum = 0;

	public void show() {

		for (int n = start; n <= 20; n++) {
			sum = sum + n;
		}
		System.out.println(sum);
	}
}