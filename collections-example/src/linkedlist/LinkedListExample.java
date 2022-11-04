package linkedlist;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> Name=new LinkedList<String>();
		Name.add("pavan");//adding in array
		Name.add("sandeep");
		Name.add("narendra");
		System.out.println(Name);
		Name.addFirst("srikanth");//add first index
		System.out.println(Name);
		Name.addLast("avinash");//add last index
		System.out.println(Name);
		Name.add(3,"aravind");
		System.out.println(Name);
		Name.removeLast();//remove last index
		System.out.println(Name);
		Name.removeFirst();//remove first index
		System.out.println(Name);
		
		Name.set(0,"rohit");//replacing the element
		System.out.println(Name);
		
		System.out.println(Name.contains("ramesh"));
		System.out.println(Name.getFirst());//get first value
		System.out.println(Name.getLast());//get last value
		System.out.println(Name.size());//length of an array
	}

}
