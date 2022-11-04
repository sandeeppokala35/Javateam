package Requirements;

public class Employee {

	public static void main(String[] args) {
		int validsalary=20000;
		int employeesalary=130;
		try {

			int result=value(validsalary,employeesalary);
			if(result>=0 && result<20000) {
				System.out.println("not eligible");
			}
			else
				System.out.println("eligible");
		} catch (Exception e) {
			//System.err.println("minor");

			System.err.println("Out of range");
		}
		finally {

			System.out.println(validsalary+" "+employeesalary);}


	}
	static int value(int validsalary,int employeesalary)throws Exception{
		int result;
		if(employeesalary<5000|| employeesalary>100000){
			throw new Exception();
		}
		else{

			if(validsalary>=employeesalary) {
				return	result=employeesalary;
			}
			else {
				return result = validsalary;
			}
			//int result;
		}				


	}

}
