import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Prime {

	public static void main(String[] args) {
		int n = 5;
		int sum;
			sum=IntStream
				.range(2,n-1)
				.filter((i)->n % i == 0)
				.sum();
				//System.out.println("factors="+sum);
				Predicate<Integer> p=(i)->sum==0;
				System.out.println("prime="+p.test(n));
	}

}
