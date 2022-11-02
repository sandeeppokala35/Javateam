package usingConstructor;

public class Student {
	String name;
	double marks;
	Student(){
		this.name="pavan";
		this.marks=78;
	}
	Student(String l_name,double l_marks){
		this.name=l_name;
		this.marks=l_marks;
	}
	void show(){
		System.out.println(this.name+" "+this.marks);
	}
}
