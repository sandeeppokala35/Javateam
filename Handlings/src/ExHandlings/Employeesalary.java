package ExHandlings;

public class Employeesalary {

	public static void main(String[] args) {

		int employeeLoan = 30000;
		int salary = 1000;
		try {
			int amount = profit(employeeLoan, salary);
			if (amount > 0 || amount < 30000)
				System.out.println(" loan eligible");

			else {
				System.out.println("loan not eligible");
			}

		} catch (Exception e) {
			int age;
			System.err.println("Out of range");
		}

		finally {
			System.out.println(employeeLoan + " " + salary);
		}
	}

	static int profit(int employeeLoan, int salary) throws Exception {
		int amount;
		if (salary < 0 && salary > 20000) {

			throw new Exception();
		} else {

			if (employeeLoan >= salary) {
				return amount = salary;
			} else {
				return amount = employeeLoan;

			}

		}

	}
}
