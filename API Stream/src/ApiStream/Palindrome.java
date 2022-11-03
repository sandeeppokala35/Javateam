package ApiStream;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		int x = 454;
		int s, sum = 0;
		int temp = x;
		int fact;

		fact = IntStream.range(1, x).filter((i) -> x % i == 0).sum();
		System.out.println(fact);
		Predicate<Integer> Palindrome = fact1 -> sum * 10 == x;
		// boolean result
		System.out.println(Palindrome.test(x));

	}

}