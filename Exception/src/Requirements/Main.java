package Requirements;

public class Main {

	public static void main(String[] args) {
		int age=62;//variable
		try {
			marriage(age);//method

		} catch (Exception e) {
			//System.err.println("Thanks of registration");
			e.printStackTrace();
		}

	}
	public static void marriage(int age)throws TooYoungException, TooOldException{


		if(age<18) {
			throw new TooYoungException("please wait some more years");
		}
		else if(age>60){
			throw new TooOldException("your age already crossed");
		}
		else {
			System.out.println("Thanks of registration");
		}
	}

}


