package shapes;

public class Graphics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1=new Circle(10);
		c1.area();
		c1.show();
		 
		Rectangle r=new Rectangle(5,5);
		r.area();
		r.show();
		
		Triangle t=new Triangle(2,4);
		t.area();
		t.show();
		
		Square s=new Square(6);
		s.area();
		s.show();
	}

}
