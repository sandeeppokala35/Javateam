import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		//int number;
		int n = 121;
		int sum;
		int temp = n;
			sum=IntStream
				.iterate(1,i->n+1)
				.limit(500)
				.filter((i)->n>0)
				
				.sum();
				//System.out.println("factors="+sum);
				Predicate<Integer> p=(i)->temp==sum;
				System.out.println("palindrome="+p.test(n));
	/*	return n == IntStream.iterate((int) number, n -> n != 0, i -> i / 10)
                .map(n -> n % 10)
                .reduce(0, (a, b) -> a * 10 + b);*/


	}
}
