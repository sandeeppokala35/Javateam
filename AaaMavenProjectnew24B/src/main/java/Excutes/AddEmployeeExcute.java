package Excutes;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.PIMPage;
import ReusableMulti.BaseClass;
import ReusableMulti.XLBasesir1;

public class AddEmployeeExcute extends BaseClass {
	@Test(dataProvider = "employeeData", enabled = true)
	public static void addEmployee(String fname, String mname, String lname) throws Exception {

		PIMPage PIMPageObj = PageFactory.initElements(driver, PIMPage.class);
		test = extent.createTest("Add Employee");
		// method("menu_pim_viewPimModule");
		// Actions a = new Actions(driver);
		mousehover(PIMPageObj.PIMMenu);
		test.log(Status.INFO, "FirstName Entered");
		Click(PIMPageObj.menu_pim_AddEmployee);
		test.log(Status.INFO, "Click to AddEmployee");
		enterData(PIMPageObj.AddEmployee_FName, fname);
		test.log(Status.INFO, "FirstName Adding");
		enterData(PIMPageObj.AddEmployee_MName, mname);
		test.log(Status.INFO, "MiddleName Entered");
		enterData(PIMPageObj.AddEmployee_LName, lname);
		test.log(Status.INFO, "LastName Entered");
		Click(PIMPageObj.AddEmployee_SaveButton);
		test.log(Status.PASS, "LastName Entered");
	}

	@DataProvider
	public Object[][] employeeData() throws Exception {
		XLBasesir1 excelObject = new XLBasesir1();
		String FileName = System.getProperty("user.dir") + "\\TestData\\XLFile.xlsx";
		String SheetName = "AddEmployee1";

		return XLBasesir1.getData(FileName, SheetName);

	}

}