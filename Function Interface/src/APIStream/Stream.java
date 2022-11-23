package APIStream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream {

	public static void main(String[] args) {
		int sum = 0;
		// skip 5 first elements
		IntStream.range(1, 11).skip(5).forEach(n -> System.out.println(n));

		// Average of suares of print array
		Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(x -> System.out.println(x));

	}

}
