package PractiseWorld;

import java.util.LinkedList;

public class LinkdenList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add("sandeep");
		list.add("Suryapet");
		list.add("Sbi account");
		System.out.println(list);

		list.add("Sandeep");
		list.add("Pavan");
		list.add("Nadhu");
		list.add("Friends");
		System.out.println(list);
		System.out.println(list.contains("Sbi account"));
		System.out.println(list.size());
		list.remove(3);
		System.out.println(list);
		list.clear();
		System.out.println(list);

	}

}
