package XLSRead;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLXSforloop {

	public static void main(String[] args) throws Exception {

		File F1 = new File(
				"C:\\Users\\JESUS\\OneDrive\\Desktop\\Stigentech project\\Stigentech project\\XLXSRead.xlsx");// XL
		// Path
		// imports
		FileInputStream FF = new FileInputStream(F1);

		XSSFWorkbook workbook = new XSSFWorkbook(FF); // Workbook Handle create object
		XSSFSheet sheet = workbook.getSheet("MyFile1");
		XSSFSheet sheet1 = workbook.getSheet("MyFile1");

		for (int i = 0; i < sheet.getLastRowNum(); i++)

		{
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++)

			{

				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}

		}

	}

}
