package ApiStream;

import java.util.stream.IntStream;

public class AmstrongNumber {

	public static void main(String[] args) {
		int nums = 153;

		IntStream.iterate(nums, n -> n / 10).map(n -> n % 10).limit(3).forEach(System.out::println);

		int Sum = IntStream.iterate(nums, n -> n / 10).map(n -> n % 10).map(d -> d * d * d).limit(3).sum();
		System.out.println(Sum);

		IntStream.iterate(nums, n -> n / 10).map(n -> n % 10).map(d -> d * d * d).limit(3).forEach(System.out::println);

	}
}
