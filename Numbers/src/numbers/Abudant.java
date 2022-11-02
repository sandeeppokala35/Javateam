package numbers;

public class Abudant {

	public static void main(String[] args) {
		int n=9;
		int i,sum=0;
		for(i=1;i<20;i++) {
			if(n % i == 0) 
				sum = sum + i; 
		}
		if(sum > n)   
			System.out.println("True");     

		else
			System.out.println("False");
	}
}

