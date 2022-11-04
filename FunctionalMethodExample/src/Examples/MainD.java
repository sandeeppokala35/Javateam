package Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.sound.sampled.AudioFileFormat.Type;

import org.w3c.dom.NameList;



public class MainD {

	public static void main(String[] args) {
		List<String> names = new ArrayList <String>();

		Function<Integer,Integer> cube = (a)->a*a*a;//cube function
		System.out.println("cube="+cube.apply(5));

		Supplier<Integer> random=()->(int) (Math.random()*20);//random num supplier
		System.out.println(random.get());
		System.out.println(random.get());
		System.out.println(random.get());
		Predicate<Integer> odd=(i)->i%2!=0; //odd function
		System.out.println("odd num="+odd.test(9));
		Predicate<Integer> marks=(i)->i>= 35; //marks function
		System.out.println("result="+marks.test(36));
		Predicate<Integer> age=(i)->i>=18; //age function
		System.out.println("age="+age.test(36));
		Function<String,String> name=(i)->i.toUpperCase(); //marks function
		System.out.println("name="+name.apply("hello"));
		
		
		String names1[]= {"pavan","sandeep","narendra","avinash","srikanth","rohit"};
		System.out.println(names1[new Random().nextInt(names1.length)]);

		//	HashMap<String,String> h=new HashMap<String,String>();
	/*	names.add("sandeep");
		names.add("narendra");
		names.add("rohit");
		names.add("srikanth");
		names.add("avinash");
		System.out.println(names);

		/*
		 * for(String h: names) { System.out.println(h); }
		 
		Random random_method = new Random(); 
		// nextInt() method 
		int index = random_method.nextInt(names.size()); 

		System.out.println("Random Element is :"
				+ names.get(index)); 

		/*
		 * Iterator itr = names.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */


		/*
		 * for (int i=0; i<arr.length; i++) { Type var = arr[i];
		 * System.out.println(var.toString()); }
		 */
		//	Predicate<Integer> age=().forEach(x -> sum += x);
		; //age function
		//System.out.println("age="+age.test());

	} 
}


