package StreamNumbers;

public class NeonNumber {

	public static void main(String[] args) {
		//int num = sc.nextInt();//9
		int n = 9;
		int sq = n * n;//9*9=81
		int sum = 0;
		while(sq != 0) {
			int r =sq % 10;//1
			sum =sum + r;
			sq= sq/ 10;
		}
		if(sum== n) {//9==9 true
			System.out.println("Neon number ="+n);
		}
		else {
			System.out.println("Not Neon number ="+n);

		}

	}
}
