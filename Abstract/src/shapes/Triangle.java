package shapes;

public class Triangle extends Shape {
	int base;
	int height;
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		this.result=0.5*this.base*this.height;
	}

}
