package XLSRead;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLNumString {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\JESUS\\OneDrive\\Desktop\\Stigentech project\\Stigentech project\\XLXSRead.xlsx");
		FileInputStream f1 = new FileInputStream(f);

		XSSFWorkbook book = new XSSFWorkbook(f1);
		XSSFSheet s1 = book.getSheet("MyFile1");
		for (int i = 1; i <= s1.getLastRowNum(); i++) {
			for (int j = 0; j < s1.getRow(i).getLastCellNum(); j++) {
				XSSFCell Cell = s1.getRow(i).getCell(j);
				if (Cell.getCellType() == Cell.CELL_TYPE_STRING) {
					System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
				} else if (Cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					System.out.println(s1.getRow(i).getCell(j).getNumericCellValue());
				}
			}
		}

	}

}
