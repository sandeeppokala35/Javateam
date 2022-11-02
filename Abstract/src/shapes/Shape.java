package shapes;

public abstract class Shape {
	double result;
	public Shape() {
	}
	
	abstract void area();
	void show() {
		System.out.println(result);
	}
}
