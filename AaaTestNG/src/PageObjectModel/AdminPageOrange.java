package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AdminPageOrange {

	@Test

	public void Admin() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();

		FindByAdmin adminpage = PageFactory.initElements(driver, FindByAdmin.class);

		adminpage.Admin.click();

		adminpage.job.click();

		adminpage.jobTitle.click();

		adminpage.AddButton.click();

		adminpage.JobTitles.sendKeys("SoftwareEngeeniring2023P");

		adminpage.JobDescription.sendKeys("SFT23");
		adminpage.JobNote.sendKeys("Note23");
		adminpage.SaveButton.click();

	}
}