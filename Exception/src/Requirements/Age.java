package Requirements;

public class Age {

	public static void main(String[] args) {
		int age=120;//variable
		try {
			validateage(age);//method
			if(age>=18) {
				System.out.println("major");
			}
			else {
				System.out.println("minor");
			}
		} catch (Exception e) {
			System.err.println("no access");
			//e.printStackTrace();
		}

	}
	public static void validateage(int age)throws Exception{
		if (age<0||age>100) {
			throw new Exception();
		}

	}
}

