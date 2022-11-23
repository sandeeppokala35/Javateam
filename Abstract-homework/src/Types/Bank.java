package Types;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa=new SavingAccount(5,100000,1);
		sa.interest();
		sa.show();
	
		CurrentAccount ca=new CurrentAccount(4,100000,1);
		ca.interest();
		ca.show();
		
	}

}
