package Requirements;

public class Person {

	public static void main(String[] args) {
		int validage=18;
		int personage=-1;
		try {

			int result=Age(validage,personage);
			if(result>0 && result<18) {
				System.out.println("minor");
			}
			else
				System.out.println("major");
		}
		catch (Exception e) {
			//System.err.println("minor");

			System.err.println("Out of range");
		}
		finally {

			System.out.println(personage+" "+validage);
			}


	}
	static int Age(int validage,int personage)throws Exception{
		int result;
		if(personage<1|| personage>100){
			throw new Exception();
		}
		else{

			if(validage>=personage) {
				return	result=personage;
			}
			else {
				return result = validage;
			}
			//int result;
		}				

	}
}
