package APIStream;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 5;
		int numbs;

		numbs = IntStream.range(1, n).filter((i) -> n % n == 0).sum();
		System.out.println(numbs);
		Predicate<Integer> primenumber = numbs1 -> n == n;
		// boolean result
		System.out.println(primenumber.test(n));

	}

}
