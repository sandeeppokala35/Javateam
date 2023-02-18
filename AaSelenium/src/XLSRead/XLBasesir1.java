package XLSRead;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLBasesir1 {
	public static File f;
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell Cell;

	public static int getTotalRow(String FileName, String SheetName) throws Exception {

		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);

		int totalRows = sheet.getLastRowNum();
		return totalRows;

	}

	public static int getTotalCells(String FileName, String SheetName, int rowNo) throws Exception {

		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);

		int totalCells = sheet.getRow(rowNo).getLastCellNum();
		return totalCells;

	}

	public static String getCellData(String FileName, String SheetName, int rowNo, int CellNo) throws Exception {
		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);
		String data = null;
		Cell = sheet.getRow(rowNo).getCell(CellNo);
		if (Cell.getCellType() == Cell.CELL_TYPE_STRING)
			data = sheet.getRow(rowNo).getCell(CellNo).getStringCellValue();

		else if (Cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			int v = (int) sheet.getRow(rowNo).getCell(CellNo).getNumericCellValue();
			data = String.valueOf(v);
		}
		return data;
	}

	public static Object[][] getData(String FileName, String SheetName) throws Exception // method creation
	{
		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);
		int totalRows = getTotalRow(FileName, SheetName);
		int totalcols = getTotalCells(FileName, SheetName, 1);
		Object[][] data = new Object[totalRows][totalcols]; // Object intialize arrays create
		for (int row = 1; row <= totalRows; row++) {
			for (int col = 0; col < totalcols; col++) {
				data[row - 1][col] = getCellData(FileName, SheetName, row, col); // data insert Array
			}
		}
		return data;

	}

}
