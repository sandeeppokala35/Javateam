package PractiseWorld;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<Items> swipe = new ArrayList<Items>();

		Items book = new Items(012, "book", 50);
		Items mouse = new Items(412, "mouse", 350);
		Items shoes = new Items(321, "shoes", 500);

		swipe.add(book);
		swipe.add(mouse);
		swipe.add(shoes);
		System.out.println(swipe.size());
		for (Items items : swipe) {
			System.out.println(items);
		}

	}

}