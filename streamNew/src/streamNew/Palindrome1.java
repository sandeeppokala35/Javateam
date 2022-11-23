package streamNew;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Palindrome1 {

	public static void main(String[] args) {
		int n = 121;
		int sum;
		int temp = n;
			IntStream
			.range(1,n%10);
			IntStream
				.range(1,n/10);
			sum=IntStream
				.range(n%10, temp)
				.filter((i)->n>0)
				.sum();
				//System.out.println("factors="+sum);
				Predicate<Integer> p=(i)->temp==sum;
				System.out.println("palindrome="+p.test(n));

	}

}


