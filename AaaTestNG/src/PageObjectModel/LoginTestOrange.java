package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestOrange {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();

		OrangeLoginPage loginpage = PageFactory.initElements(driver, OrangeLoginPage.class);// intialize the
																							// PageFactory
		loginpage.Username.sendKeys("Admin");

		loginpage.Password.sendKeys("Qedge123!@#");

		loginpage.LoginButton.click();

	}

}