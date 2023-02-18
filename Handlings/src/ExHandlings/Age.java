package ExHandlings;

public final class Age {

	public static void main(String[] args) {

		int voteage = 18;
		int personage = 25;
		try {
			int age = age(voteage, personage);
			if (age > 0 || age < 18)
				System.out.println("Major ");

			else {
				System.out.println("Minor");
			}

		} catch (Exception e) {
			int age;
			System.err.println("Out of range");
		}

		finally {
			System.out.println(voteage + " " + personage);
		}
	}

	static int age(int voteage, int personage) throws Exception {
		int age;
		if (personage < 0 || personage > 100) {

			throw new Exception();
		} else {

		}
		if (voteage >= personage) {
			return age = personage;
		} else {
			return age = voteage;

		}

	}

}
