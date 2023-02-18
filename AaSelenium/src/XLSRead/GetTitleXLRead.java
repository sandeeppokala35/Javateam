package XLSRead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetTitleXLRead {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		String FileName = "C:\\AUI2\\XLFile.xlsx";
		String SheetName = "Sheet2";
		Thread.sleep(1000);
		XLBase e = new XLBase();
		int totalRows = XLBase.getTotalRow(FileName, SheetName);
		for (int i = 1; i <= totalRows; i++) {

			WebElement Admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
			Thread.sleep(3000);
			Actions a1 = new Actions(driver);
			a1.moveToElement(Admin).perform();
			Thread.sleep(3000);
			WebElement Job = driver.findElement(By.id("menu_admin_Job"));
			a1.moveToElement(Job).perform();
			Thread.sleep(3000);
			WebElement JobTitle = driver.findElement(By.id("menu_admin_viewJobTitleList"));
			a1.click(JobTitle).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
			String Textfield = XLBase.getCellData(FileName, SheetName, i, 0);
			driver.findElement(By.id("jobTitle_jobTitle")).sendKeys(Textfield);

		}

	}
}