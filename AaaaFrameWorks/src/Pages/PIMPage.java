package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPage {
	// PIM Menu
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement PIMMenu;

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement menu_pim_AddEmployee;

	@FindBy(id = "firstName")
	public WebElement AddEmployee_FName;

	@FindBy(id = "middleName")
	public WebElement AddEmployee_MName;

	@FindBy(id = "lastName")
	public WebElement AddEmployee_LName;

	@FindBy(id = "btnSave")
	public WebElement AddEmployee_SaveButton;

	// Employee List

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement PIMmenu_employelist;

	@FindBy(id = "empsearch_employee_status")
	public WebElement PIMmenu_employelist_EmploymentStatus;

}
