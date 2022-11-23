package StreamNumbers;

public class div {

	public static void main(String[] args) {
		int i;
		for(i=2;i<5000;i++) {
			if(i%2==0 && i%3==0 && i%4==0 && i%5==0 && i%6==0 &&i%7==0 && i%8==0 && i%9==0 && i%10==0) {
				System.out.println(i);
			}
		}
	}
}
