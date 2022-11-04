package arraylist;

import java.util.ArrayList;
import java.util.function.Function;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList <String>Name=new ArrayList<String>();
		Name.add("pavan");//adding in array
		Name.add("sandeep");
		Name.add("narendra");
		System.out.println(Name);
		Name.add("rohit");
		System.out.println(Name);
		Name.add("srikanth");
		Name.add("avinash");
		System.out.println(Name);
		Name.remove(0);//removed paticular position [0]
		System.out.println(Name);
		Name.set(1,"pavan");//replaced position[1]
		System.out.println(Name);
		System.out.println(Name.contains("pavan"));//searching available or not
		System.out.println(Name.get(3));//getting value
		System.out.println(Name.size());//size of array
		Name.clear();//clear all in array
		System.out.println(Name);
		
	//	System.out.println(Name.size());//size of array
		//Function<String,String> names=(name)->System.out.println(Name);
	}

}
