package ExHandlings;

public class Age1 {

	public static void main(String[] args) {
		int age = 20;
		try {
			Age1(age);

			if (age >= 18) {
				System.out.println("Major");
			} else {
				System.out.println("Minor");
			}
		} catch (Exception e) {
			System.err.println("Invalid age");

		}

	}

	static void Age1(int age) throws Exception {
		if (age < 0 || age > 100)
			;
		throw new Exception();

	}
}
