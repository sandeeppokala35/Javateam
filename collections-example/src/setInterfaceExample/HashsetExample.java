package setInterfaceExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet hs=new HashSet();//randam print
		hs.add(100);
		hs.add(110);
		hs.add(150);
		System.out.println(hs);
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(100);
		lhs.add("Linked");
		lhs.add(150);
		System.out.println(lhs);
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(199);
		ts.add(150);
		ts.add(150);//duplicate
		System.out.println(ts);
	}

}
