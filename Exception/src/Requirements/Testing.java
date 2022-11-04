package Requirements;

public class Testing {

	public static void main(String[] args) throws TooYoungException{
		int age=17;
		try {

			if(age<18) {
				throw new TooYoungException("please wait some more years");
			}
			//else if(age>60){
			//	throw new TooOldException("your age already crossed");
		//	}
			else {
				System.out.println("Thanks of registration");
			}
		} catch (Exception e) {
			//System.out.println("thanks of registration");
			e.printStackTrace();
		}
		//if(age<18) {
		//throw new TooYoungException("please wait some more years");
		//}
		//else if(age>60) {
		//	throw new TooOldException("your age already crossed");
		//	}
		//else {
		//	System.out.println("thanks of registration");
		//}
	}
}

