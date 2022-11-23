import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("--------------print num-----------------");
		IntStream
		.range(1,21)
		.forEach(i->System.out.println(i));
		System.out.println("--------------even num-----------------");
		IntStream
		.range(1,21)
		.filter((i)->i%2==0)
		.forEach(i->System.out.println(i));
		//System.out.println(sum);

		System.out.println("---------------odd num----------------");
		IntStream
		.range(1,21)
		.filter((i)->i % 2 !=0)
		.forEach(i->System.out.println(i));
		//System.out.println(sum);
		System.out.println("----------------sum of even---------------");
		sum=IntStream
				.range(1,21)
				.filter((i)->i%2==0)
				.sum();
		System.out.println(sum);

		System.out.println("---------------sum of odd----------------");
		sum=IntStream
				.range(1,21)
				.filter((i)->i % 2 !=0)
				.sum();
		System.out.println(sum);

		System.out.println("-----------------print squares--------------");
		IntStream
				.range(1,11)
				.map((i)->i*i)
				.forEach(i->System.out.println(i));
		//System.out.println(sum);
		System.out.println("--------------print cubes-----------------");
		IntStream
				.range(1,11)
				.map((i)->i*i*i)
				.forEach(i->System.out.println(i));
		//System.out.println(sum);
		System.out.println("---------------sum of squares----------------");
		sum=IntStream
				.range(1,11)
				.map((i)->i*i)
				.sum();
		System.out.println(sum);
		System.out.println("-------------sum of squares even num------------------");		
		sum=IntStream
				.range(1,11)
				.map((i)->i*i)
				.filter((i)->i%2==0)
				.sum();
		System.out.println(sum);
		System.out.println("-------------nums divisable by 3------------------");	
		IntStream
				.range(1,11)
				
				.filter((i)->i%3==0)
				.forEach(i->System.out.println(i));
		System.out.println("-------------sum of nums divisable by 3------------------");	
		sum=IntStream
				.range(1,11)
				
				.filter((i)->i%3==0)
				.sum();
		System.out.println(sum);
		System.out.println("-------------sum of squares divisable by 3------------------");	
		sum=IntStream
				.range(1,11)
				.map((i)->i*i)
				.filter((i)->i%3==0)
				.sum();
		System.out.println(sum);
	}

}
