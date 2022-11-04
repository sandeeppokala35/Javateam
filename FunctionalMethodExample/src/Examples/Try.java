package Examples;

import java.util.function.BiFunction;

public class Try implements BiFunction<Integer,Integer,Integer>{

	@Override
	public Integer apply(Integer t, Integer u) {
		
		return (t+u);
	}
public static void main(String[] args) {
//	BiFunction<Integer,Integer,Integer> b=new BiFunction();
}
}
