package XLSRead;

public class XLReader1 {

	public static void main(String[] args) throws Exception {
		String FileName = "C:\\Users\\JESUS\\OneDrive\\Desktop\\Stigentech project\\Stigentech project\\XLXSRead.xlsx";
		String SheetName = "MyFile1";
		XLBase e = new XLBase();

		String Fname = XLBase.getCellData(FileName, SheetName, 1, 0);
		String Mname = XLBase.getCellData(FileName, SheetName, 1, 1);
		String Lname = XLBase.getCellData(FileName, SheetName, 1, 2);

		System.out.println(Fname);
		System.out.println(Mname);
		System.out.println(Lname);

		String Fname1 = XLBase.getCellData(FileName, SheetName, 2, 0);
		String Mname1 = XLBase.getCellData(FileName, SheetName, 2, 1);
		String Lname1 = XLBase.getCellData(FileName, SheetName, 2, 2);

		System.out.println(Fname1);
		System.out.println(Mname1);
		System.out.println(Lname1);

	}

}
