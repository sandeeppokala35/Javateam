package ApiStream;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PerfectNumber1 {

	public static void main(String[] args) {
		int n = 28;
		int fact;

		fact = IntStream.range(1, n).filter((i) -> n % i == 0).sum();
		System.out.println(fact);
		Predicate<Integer> primenumber = fact2 -> fact == n;
		// boolean result
		System.out.println(primenumber.test(n));

	}

}
