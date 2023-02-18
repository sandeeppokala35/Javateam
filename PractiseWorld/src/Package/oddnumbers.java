package Package;

public class oddnumbers {

	int min = 1;
	int max = 50;

	public void show() {
		{
			for (int n = min; n <= max; n++) {
				if (n % 2 != 0)
					System.out.println("oddnumbers:" + n);

			}
		}

	}

}