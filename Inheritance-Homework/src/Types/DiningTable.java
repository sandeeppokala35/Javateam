package Types;

public class DiningTable extends Tables {
	String size;
	public DiningTable() {

	}
	public DiningTable(String material,String size) {
		super();
		this.size = size;
		this.setMaterial(material);
	}
	public void show() {
		System.out.println(this.getMaterial()+" "+this.size);
	}
}
