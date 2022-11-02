package shapes;

public class Rectangle extends Shape{
	int l;
	int b;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	void area() {
		this.result = this.l*this.b;
	}
}
