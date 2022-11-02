package numbers;

public class Deficient {

	public static void main(String[] args) {
		int n=23;
		int i,sum=0;
		for(i=1;i<n;i++) {
			if(n % i == 0) 
				sum = sum + i; 
		}
		if(sum < n)   
			System.out.println("True");     

		else
			System.out.println("False");
	}
}