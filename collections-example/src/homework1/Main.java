package homework1;

import java.util.ArrayList;

import Homework.Employee;

public class Main {

	public static void main(String[] args) {
		ArrayList<Item1> cart= new ArrayList<Item1>();
		Item1 pen=new Item1(12,"Bitco",20);
		//Item1 pencil=new Item1(11,"pencil",10);
		cart.add(pen);
	//	cart.add(pencil);
		//cart.add(pencil);
		//System.out.println(cart);
		for(Item1 I :cart) {
			System.out.println(I);
		}
		//System.out.println(cart);
	}

}
