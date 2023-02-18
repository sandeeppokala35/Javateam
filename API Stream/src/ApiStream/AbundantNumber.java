package ApiStream;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class AbundantNumber {

	public static void main(String[] args) {

		int n = 24;
		int nums;
		nums = IntStream.range(1, n).filter((i) -> n % i == 0).sum();
		System.out.println(nums);
		Predicate<Integer> abundantnumber = nums1 -> nums > n;
		// boolean result
		System.out.println(abundantnumber.test(n));
	}

}
