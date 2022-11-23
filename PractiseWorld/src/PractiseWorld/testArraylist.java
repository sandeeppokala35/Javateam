package PractiseWorld;

import java.util.ArrayList;

public class testArraylist {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();

		myList.add("first");
		myList.add("Second");
		myList.add("third");

		System.out.println(myList.get(2));
		System.out.println(myList.size());
		myList.add("Sandeep");
		myList.add("Pavan");
		myList.add("Nadhu");
		System.out.println(myList);

		myList.remove(2);
		System.out.println(myList);
		myList.set(2, "third");
		System.out.println(myList);
		System.out.println(myList.contains("first"));
		System.out.println(myList.get(4));
		myList.clear();
		System.out.println(myList);
	}

}
