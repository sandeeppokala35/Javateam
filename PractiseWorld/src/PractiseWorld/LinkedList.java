package PractiseWorld;

import java.util.LinkedHashSet;

public class LinkedList {

	public static void main(String[] args) {
		LinkedHashSet<Shop> store = new LinkedHashSet<Shop>();

		Shop box = new Shop(102, "box", 5000);
		Shop gun = new Shop(153, "gun", 10000);
		Shop chair = new Shop(220, "chair", 4000);

		store.add(box);
		store.add(gun);
		store.add(chair);

		System.out.println(store);
	}

}
