package PractiseWorld;

import java.util.function.BiFunction;
import java.util.function.Function;

public class functionDemo1 {

	public static void main(String[] args) {

		Function<Integer, Integer> cube = (a) -> a * a * a;
		System.out.println(cube.apply(10));
		System.out.println(cube.apply(20));

		Function<Integer, Integer> square = (a) -> a * a;
		System.out.println(square.apply(10));
		System.out.println(square.apply(20));

		Function<Integer, Integer> half = (a) -> a / 2;
		System.out.println(half.apply(10));
		System.out.println(half.apply(20));

		Function<Integer, Integer> twice = (a) -> 2 * a;
		System.out.println(twice.apply(10));
		System.out.println(twice.apply(20));

		BiFunction<Integer, Integer, Integer> multiply = (a, b) -> (a * b);
		System.out.println(multiply.apply(20, 30));

		Function<Integer, Boolean> check = (a) -> (a % 2 == 0);
		System.out.println(check.apply(33));

		BiFunction<Integer, Integer, Integer> multiply1 = (a, b) -> (a * a + b * b);
		System.out.println(multiply1.apply(20, 20));
	}
}
