package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeLoginPage {

	@FindBy(id = "txtUsername")
	public WebElement Username;

	@FindBy(id = "txtPassword")
	public WebElement Password;

	@FindBy(id = "btnLogin")
	public WebElement LoginButton;

}
