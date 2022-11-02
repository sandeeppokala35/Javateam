package numbers;

public class Prime {

	public static void main(String[] args) {
		int num=7;
		int sum=0;
		for(int i=2;i<=num-1;i++){
			if(num%i==0) {
				sum=sum+1;
			}
		}
		if(sum==0) {
			System.out.println(num+"is prime number");
		}
		else {
			System.out.println(num+"is not prime number");
		}

	}

}
