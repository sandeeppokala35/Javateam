package shapes;

public class Square extends Shape {
	int side;

	public Square() {
		// TODO Auto-generated constructor stub
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		this.result=this.side*this.side;
	}

}
