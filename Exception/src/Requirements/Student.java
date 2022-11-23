package Requirements;

public class Student {

	public static void main(String[] args) {
		int passmarks=75;
		int resultmarks=0;
		try {

			int result=value(passmarks,resultmarks);
			if(result>=0 && result<35) {
				System.out.println("fail");
			}
			else
				System.out.println("pass");
		} catch (Exception e) {
			//System.err.println("minor");

			System.err.println("Out of range");
		}
		finally {

			System.out.println(resultmarks+" "+passmarks);
			}


	}
	static int value(int passmarks,int resultmarks)throws Exception{
		int result;
		if(resultmarks<0|| resultmarks>100){
			throw new Exception();
		}
		else{

			if(passmarks>=resultmarks) {
				return	result=resultmarks;
			}
			else {
				return result = passmarks;
			}
			//int result;
		}				

	} 

	}


