package StreamNumbers;

import java.util.Arrays;
import java.util.List;

public class Match {

	public static void main(String[] args) {
		List<String> l=Arrays.asList("java","corejava","advance java","java script","react js","c","c++","html");
		Boolean b=l.stream()
				.anyMatch(m->m.contains("java"));//ANY ONE MATCH
		System.out.println(b);
		
		b=l.stream()
				.allMatch(m->m.contains("java"));//ALL SHOULD MATCH
		System.out.println(b);
		
		b=l.stream()
				.noneMatch(m->m.contains("Java"));//NO ELEMENT SHOULD PRESENT
		System.out.println(b);
	}

}
