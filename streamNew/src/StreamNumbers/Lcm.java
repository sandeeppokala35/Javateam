package StreamNumbers;

public class Lcm {

	//public static void main(String[] args) {
		 final static int n = 10;

		    static int lcm(int first, int last) {
		        while (last != 0) {
		            int temp = first;//1
		            first = last;//2
		            last = temp % last;
		        }
		        return first;//false
		    }

		    public static void main(String[] args) {
		        int r = 1;
		        for (int i = 1; i <= n; i++) {
		            int x = lcm(i, r);
		            r = r / x * i;
		        }
		        System.out.println(r);
		    
		
	}

}
