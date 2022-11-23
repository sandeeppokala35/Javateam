package Types;

public class Account {//super class
	private int id;
	private String name;
	public Account() {
		
	}
	public Account(int id, String name) {
		super();
		this.setId(id);
		this.setName(name);

	}
	void show() {
		System.out.println(this.getId()+" "+this.getName());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
