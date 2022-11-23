package Requirements;

public class Testing1 {

	public static void main(String[] args) throws TooOldException{
		int age=65;
		try {

			 if(age>60){
				throw new TooOldException("your age already crossed");
			}
			else {
				System.out.println("Thanks of registration");
			}
		} catch (Exception e) {
			//System.out.println("thanks of registration");
			e.printStackTrace();
			// TODO Auto-generated method stub

		}

	}
}
