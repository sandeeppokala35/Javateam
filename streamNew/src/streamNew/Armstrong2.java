package streamNew;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Armstrong2 {

	public static void main(String[] args) {

		int num = 153;

		/*int sum=	IntStream.iterate(num, n -> n /10)
                .map(n -> n % 10)
                .map(d->d*d*d)
                .limit(3)
                .sum();
               // .forEach(System.out::println);
                System.out.println(sum);*/
		IntFunction<Integer>sumOfCubes=nums->IntStream
				.iterate(num,n->n/10)
				.map(n -> n % 10)
				.map(d->d*d*d)
				.limit(3)
				.sum();
		IntPredicate isArmstrong=n->n== sumOfCubes.apply(n);
		isArmstrong.test(153);
		/*IntStream
		.range(100,1000)
		.filter(isArmstrong)
		.forEach(System.out::println);*/

	}

}
