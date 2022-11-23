package StreamNumbers;

public class HappyNumber {

	public static void main(String[] args) {
		int temp,num,r,sum = 0;
		temp = 90;
		while(temp>9) {
			sum=0;
			while(temp!=0) {
				r=temp%10;
				sum=sum+r*r;
				temp=temp/10;
			}
			temp=sum;
		}
		if(sum==1) {
			System.out.println("happy num");
		}
		else {
			System.out.println("not happy");
		}
	}
}
