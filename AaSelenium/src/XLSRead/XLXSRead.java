package XLSRead;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLXSRead {

	public static void main(String[] args) throws Exception {

		File F1 = new File(
				"C:\\Users\\JESUS\\OneDrive\\Desktop\\Stigentech project\\Stigentech project\\XLXSRead.xlsx");
		FileInputStream FF = new FileInputStream(F1);

		XSSFWorkbook workbook = new XSSFWorkbook(FF);
		XSSFSheet sheet = workbook.getSheet("MyFile1");
		System.out.println(sheet.getRow(3).getCell(2).getNumericCellValue());
		System.out.println(sheet.getRow(4).getCell(1).getStringCellValue());
		// System.out.println(sheet.getCellComment(2, 1).getString());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getLastRowNum(); j++)

			{
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}

	}

}