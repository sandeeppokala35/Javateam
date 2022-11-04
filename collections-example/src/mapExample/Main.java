package mapExample;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("1010", "dhanraj");
		h.put("1011", "pavan");
		if(h.containsKey("1011")) {
			h.put("1012",h.get("vamshi"));
		}
		//h.put(null, null)
		System.out.println(h);
		System.out.println(h.containsKey("1010"));
		
	}

}
