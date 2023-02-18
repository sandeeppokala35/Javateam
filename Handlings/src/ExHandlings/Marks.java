package ExHandlings;

public class Marks {

	public static void main(String[] args) {
		int passmarks = 35;
		int marks = 0;
		try {

			int result = value(passmarks, marks);
			if (result >= 0 && result < 35) {
				System.out.println("fail");
			} else
				System.out.println("pass");
		} catch (Exception e) {

			System.err.println("Out of range");
		} finally {

			System.out.println(marks + " " + passmarks);
		}

	}

	static int value(int passmarks, int marks) throws Exception {
		int result;
		if (marks < 0 || marks > 100) {
			throw new Exception();
		} else {

			if (passmarks >= marks) {
				return result = marks;
			} else {
				return result = passmarks;
			}

		}

	}

}
