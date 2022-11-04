package Examples;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Function<Integer,Integer> cube = (a)->a*a*a;
		System.out.println("cube="+cube.apply(5));
		BiFunction<Integer,Integer,Integer> mul = (a,b)->a*b;
		System.out.println("product="+mul.apply(10,11));
		BiFunction<Integer,Integer,Integer> add = (a,b)->a+b;
		System.out.println("addition="+add.apply(10,11));
		Function<Integer,Integer> half =(a)->a/2;
		System.out.println("half of num="+half.apply(12));
		Function<Integer,Integer> twice =(a)->2*a;
		System.out.println("twice="+ twice.apply(14));
	//	Function<Integer,Integer> print=(a)->System.out.println(a);
		//System.out.println(print.apply(10));
		Function<Integer,Boolean> even=(i)->i%2==0; 
		System.out.println("even num="+even.apply(8));
	
	}

}
