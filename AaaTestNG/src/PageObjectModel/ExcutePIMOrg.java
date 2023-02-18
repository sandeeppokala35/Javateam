package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExcutePIMOrg {

	@Test
	public void PIM() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();

		FindByPIM pimclick = PageFactory.initElements(driver, FindByPIM.class);

		pimclick.Pim.click();
		pimclick.FName.sendKeys("prem");
		pimclick.MName.sendKeys("ram");
		pimclick.LName.sendKeys("shyam");
		pimclick.Save.click();
	}
}