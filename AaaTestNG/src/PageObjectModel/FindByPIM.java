package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindByPIM {

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement Pim;

	@FindBy(id = "firstName")
	public WebElement FName;

	@FindBy(id = "middleName")
	public WebElement MName;

	@FindBy(id = "lastName")
	public WebElement LName;

	@FindBy(id = "btnSave")
	public WebElement Save;

}
