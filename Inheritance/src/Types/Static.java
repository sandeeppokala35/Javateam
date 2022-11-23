package Types;



public class Static {
	static String name;
	double salary;
	Static(){
		this.name="pavan";
		this.salary=78;
	}
	Static(String l_name,double l_salary){
		this.name=l_name;
		this.salary=l_salary;
	}
	void show(){
		System.out.println(this.name+" "+this.salary);
	}


	public static void main(String[] args) {
		Static p =new Static("sandeep",70000);
		p.show();

		Static.name="bunny";
	}
}
