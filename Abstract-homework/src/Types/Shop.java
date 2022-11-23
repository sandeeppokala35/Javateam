package Types;

public class Shop {

	public static void main(String[] args) {
		StationeryProduct sp=new StationeryProduct("pen",15);
		sp.Details();
		sp.show();
		MedicalProduct mp= new MedicalProduct("dolo",40,"2023","oct");
		mp.Details();
		mp.show();

	}

}
