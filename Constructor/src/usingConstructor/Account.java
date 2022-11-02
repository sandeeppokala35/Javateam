package usingConstructor;

public class Account {
	String name;

	double balance;
	double balance1;

	Account(){
		this.name="narender";
		
		this.balance=105.75;
		this.balance1=1000;
		
	}
	Account(String l_name,double l_balance){
		this.name=l_name;
	
		this.balance=l_balance;
	}
	
	
	void show() {
		System.out.println(this.name+" "+this.balance);
	}
}


