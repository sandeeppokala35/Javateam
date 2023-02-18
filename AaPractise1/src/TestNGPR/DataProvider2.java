package TestNGPR;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider2 {
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

	public static int getLastCellNum(String FileName, String SheetName, int rowNo) throws Exception {
		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);

		int totalCells = sheet.getRow(rowNo).getLastCellNum();
		return totalCells;
	}

	public static int getTotalCells(String FileName, String SheetName, int rowNo) throws Exception {

		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);

		int totalCells = sheet.getRow(rowNo).getLastCellNum();
		return totalCells;
	}

	public static int getData(String FileName, String SheetName, int rowNo) throws Exception {

		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);

		int totalData = sheet.getRow(rowNo).getLastCellNum();
		return totalData;

	}

	public static String getCellData(String FileName, String SheetName, int rowNo, int CellNo) throws Exception {
		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);
		String data = null;
		Cell = sheet.getRow(rowNo).getCell(CellNo);
		if (Cell.getCellType() == Cell.CELL_TYPE_STRING) {
			data = sheet.getRow(rowNo).getCell(CellNo).getStringCellValue();
		} else if (Cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			int v = (int) sheet.getRow(rowNo).getCell(CellNo).getNumericCellValue();
			data = String.valueOf(v);
		}
		return data;
	}

	// create Two dimentional Array
	public static Object[][] getData(String FileName, String SheetName) throws Exception // method creation
	{
		f = new File(FileName);
		fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);
		int totalRows = getTotalRow(FileName, SheetName);
		int totalcols = getTotalCells(FileName, SheetName, 1);
		Object[][] file = new Object[totalRows][totalcols]; // Object intialize arrays create
		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j <= totalcols; j++) {
				file[i - 1][j] = getCellData(FileName, SheetName, i, j); // data insert Array
			}
		}
		return file;

	}

}
