package Excutes;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.PIMPage;
import ReusableMulti.BaseClass;
import ReusableMulti.XLBasesir1;

public class AddEmployeeExcute extends BaseClass {
	@Test(dataProvider = "employeeData")
	public static void addEmployee(String fname, String mname, String lname) throws Exception {

		PIMPage PIMPageObj = PageFactory.initElements(driver, PIMPage.class);
		// method("menu_pim_viewPimModule");
		Actions a = new Actions(driver);
		mousehover(PIMPageObj.PIMMenu);
		Click(PIMPageObj.menu_pim_AddEmployee);

		enterData(PIMPageObj.AddEmployee_FName, fname);
		enterData(PIMPageObj.AddEmployee_MName, mname);
		enterData(PIMPageObj.AddEmployee_LName, lname);
		Click(PIMPageObj.AddEmployee_SaveButton);

	}

	@DataProvider
	public Object[][] employeeData() throws Exception {
		XLBasesir1 excelObject = new XLBasesir1();
		String FileName = System.getProperty("user.dir") + "\\TestData\\XLFile.xlsx";
		String SheetName = "AddEmployee1";

		return XLBasesir1.getData(FileName, SheetName);

	}

}