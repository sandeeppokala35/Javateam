package Demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ReverseFuction {

	public static void main(String[] args) {

		Predicate<Integer> isOdd = (n) -> n % 2 == 0;
		System.out.println(isOdd.test(15));
		System.out.println(isOdd.test(2548)); // return only Boolean
		System.out.println("----------------------------");

		Consumer<Integer> printCube = (n) -> System.out.println(n * n * n);
		printCube.accept(12);
		printCube.accept(20);
		System.out.println("----------------------------");

		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());
		System.out.println(random.get());
		System.out.println(random.get());
		System.out.println("----------------------------");

		Function<String, String> capital = (a) -> a.toUpperCase();
		System.out.println(capital.apply("nandu,pavan"));
		System.out.println("----------------------------");

		Function<Integer, Integer> sum = (n) -> n + n % 10;

		System.out.println(sum.apply(20));

		Predicate<Integer> pass = (p) -> p >= 36;
		System.out.println(pass.test(35));

		Predicate<Integer> personage = (a) -> a >= 21;
		System.out.println(personage.test(32));

		Predicate<Integer> salary = (a) -> a >= 10000;
		System.out.println(salary.test(9999));

	}
}
