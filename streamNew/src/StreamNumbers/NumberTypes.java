package StreamNumbers;

import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class NumberTypes {

	public static void main(String[] args) {
	//	int sum = 153;
		Function<Integer,Integer>factsum=n->IntStream
				.range(1,n)
				.filter(i->n%i==0)
				.sum();
		IntPredicate isPerfect=(n)->factsum.apply(n)==n;
		System.out.println(isPerfect.test(6));
		IntStream
		.range(1, 100)
		.filter(isPerfect)
		.forEach(System.out::println);
		System.out.println("-----------------abundant----------------");
		IntPredicate isAbundant=(n)->factsum.apply(n)>n;
		System.out.println(isAbundant.test(12));
		System.out.println("-----------------deficient----------------");
		IntPredicate isDeficient=(n)->factsum.apply(n)<n;
		System.out.println(isDeficient.test(12));
		System.out.println("-----------------prime----------------");
		Function<Integer,Integer>factsum1=n->IntStream
				.range(2,n)
				.filter(i->n%i==0)
				.sum();
		IntPredicate isPrime=(n)->factsum1.apply(n)==0;
		System.out.println(isPrime.test(7));
		System.out.println("-----------------armstrong----------------");
		Function<Integer,Integer>factsum2=n->IntStream
				.iterate(n, i -> n != 0, i -> i / 10)
				.limit(10)
				.map(i -> n % 10)
				.sum();
		IntPredicate isArmstrong=(n)->factsum2.apply(n)>0;
		System.out.println(isArmstrong.test(156));
		
	}

}
