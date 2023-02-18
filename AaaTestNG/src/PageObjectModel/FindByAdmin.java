package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindByAdmin {

	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement Admin;

	@FindBy(id = "menu_admin_Job")
	public WebElement job;

	@FindBy(id = "menu_admin_viewJobTitleList")
	public WebElement jobTitle;

	@FindBy(id = "btnAdd")
	public WebElement AddButton;

	@FindBy(id = "jobTitle_jobTitle")
	public WebElement JobTitles;

	@FindBy(id = "jobTitle_jobDescription")
	public WebElement JobDescription;

	@FindBy(id = "jobTitle_note")
	public WebElement JobNote;

	@FindBy(id = "btnSave")
	public WebElement SaveButton;
}
