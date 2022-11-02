package numbers;

public class Palindrome {
	public static boolean main(String[] args) {
	/*	int n=121,r,sum=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		if(temp==sum) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}*/
		int x=122;
		int a = 0;
	    int b = x - 1;
	    while (b > a) {
	        if ((a) != (b)) {
	            return false;
	        }
	        a++;
	        b--;
	    }
	    return true;
	}
		
		
}
