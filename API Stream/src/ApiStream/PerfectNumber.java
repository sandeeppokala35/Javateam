package ApiStream;

import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PerfectNumber {

	public static void main(String[] args) {
		Function<Integer, Integer> factSum = n -> IntStream.range(1, n).filter(i -> n % i == 0).sum();
		IntPredicate isPerfect = (n) -> factSum.apply(n) == n;

		System.out.println(isPerfect.test(6));

		IntStream.range(1, 100).filter(isPerfect).forEach(System.out::println);

	}

}
