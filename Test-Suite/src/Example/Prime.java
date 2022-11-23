package Example;

public class Prime {
	public  static Boolean isPrime(int n) {
		//int i = 10;
		for(int i=2;i<=n-1;i++){
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
