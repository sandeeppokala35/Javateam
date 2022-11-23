package Types;

public class Tables {
	
	private String material;
	public Tables() {
		
	}
	
	public Tables( String material) {
		super();
		this.setMaterial(material);
	}

	
	public void show() {
		System.out.println(this.getMaterial());
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
