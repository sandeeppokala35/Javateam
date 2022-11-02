package usingConstructor;

public class Student1 {
String name;
String contactNo;
String collegeName;
int id;

Student1(String l_contactNo,String l_collegeName,int l_id){
this.contactNo=l_contactNo;
this.collegeName=l_collegeName;
this.id=l_id;
}
Student1(int id,String name){
	this.contactNo="9542173559";
    this.collegeName="RGM";
    this.id=1011;
    this.name="pavan";    
}
void show(){
	System.out.println("name: "+"contactNo: "+"collegeName: "+"id: ");
}
}

