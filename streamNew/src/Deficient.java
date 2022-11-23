import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Deficient {

	public static void main(String[] args) {
		int n = 12;
		int fact;
			fact=IntStream
				.range(1,n)
				.filter((i)->n % i == 0)
				.sum();
				System.out.println("factors="+fact);
				Predicate<Integer> p=(i)->fact<n;
				System.out.println("deficient="+p.test(n));
	}

}
