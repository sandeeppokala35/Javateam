package Examples;

import java.util.ArrayList;
import java.util.List;



public class MethodReferenceExample {

	public static void main(String[] args) {
		List names = new ArrayList();

		names.add("sandeep");
		names.add("narendra");
		names.add("rohit");
		names.add("srikanth");
		names.add("avinash");
		System.out.println(names);
		 names.forEach(System.out::println);
	}
}

