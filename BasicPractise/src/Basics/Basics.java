package Basics;

import java.util.function.Function;
import java.util.function.Predicate;

public class Basics {

	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i * i;
		System.out.println("The square of 40:" + f.apply(40));
		System.out.println("The square of 40:" + f.apply(50));
		// i want check whether the even number or not

		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(4));

	}

}
