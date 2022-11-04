package Requirements;

public class Person1 {

	public static void main(String[] args) {
		int validage=18;
		int actualage=17;
		
		try {
			int result=age(validage,actualage);
			System.out.println(result);
			if(result<18) {
			System.out.println("major:"+result);
			}
			else
				System.out.println("minor");
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("out of range");
		}
		finally {
			System.out.println(validage+" "+actualage);
		}
	}
	static int age(int validage,int actualage)throws Exception{
		if(actualage>validage) {
			throw new Exception();
		}
		int result = actualage;
		return result;
	}
}

