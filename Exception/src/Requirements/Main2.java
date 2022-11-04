package Requirements;

public class Main2 {

	public static void main(String[] args) {
		int age=22;
		try {
			m(age);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void m(int age)throws TooYoungException,TooOldException{
			if(age<18) {
				throw new TooYoungException(" pelli chesukonu");
			}
				else if(age>60) {
				throw new TooOldException ("paniki ravu inka pelli ki");
			}
			else {
				System.out.println("pelli apudu masth untadi");
			}
		}
	}


