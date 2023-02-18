package ApiStream;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class DeficientNumber {

	public static void main(String[] args) {

		int n = 14;
		int fact;

		fact = IntStream.range(1, n).filter((i) -> n % i == 0).sum();
		System.out.println(fact);
		Predicate<Integer> perfectnumber = fact1 -> fact < n;
		// boolean result
		System.out.println(perfectnumber.test(n));

	}

}
