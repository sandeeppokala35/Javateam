package APIStream;

import java.util.stream.IntStream;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		// print 1 to 20 numbers
		IntStream.range(1, 20).forEach(n -> System.out.println(n));
		System.out.println("-----------------------------");
		// Print Even numbers
		IntStream.range(1, 21).filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
		System.out.println("------------------------------");
		// Square 1 to 10
		IntStream.range(1, 11).map(n -> n * n).forEach(n -> System.out.println(n));

		System.out.println("--------------------------------------------");
		// Print Sum of Even Numbers
		sum = IntStream.range(1, 20).filter(n -> n % 2 == 0).sum();
		System.out.println(sum);
		System.out.println("--------------------------------------------");
		// Print Sum of Odd Numbers
		sum = IntStream.range(1, 21).filter(n -> n % 2 != 0).sum();
		System.out.println(sum);
		System.out.println("--------------------------------------------");
		// Square Numbers
		IntStream.range(1, 21).map(n -> n * n).forEach(n -> System.out.println(n));
		System.out.println("--------------------------------------------");
		// Cube Numbers
		IntStream.range(1, 10).map(n -> n * n * n).forEach(n -> System.out.println(n));

		System.out.println("--------------------------------------------");
		// Sum of Even Square Numbers
		sum = IntStream.range(1, 10).filter(n -> n % 2 == 0).map(n -> n * n).sum();
		System.out.println(sum);
		System.out.println("--------------------------------------------");
		// divisible by 3
		IntStream.range(1, 21).filter(n -> n % 3 == 0).forEach(n -> System.out.println(n));
		System.out.println("--------------------------------------------");
		// Square divisible by 3
		IntStream.range(1, 21).filter(n -> n % 3 == 0).map(n -> n * n).forEach(n -> System.out.println(n));

		System.out.println("--------------------------------------------");
	}

}