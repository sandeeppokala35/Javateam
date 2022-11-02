package shapes;

public class Circle extends Shape {
	int radius;
	public Circle() {
		
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		this.result=3.14159*this.radius*this.radius;//result=pi*r^2
	}

}
