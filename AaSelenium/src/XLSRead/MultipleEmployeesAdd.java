package XLSRead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleEmployeesAdd {

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
		String SheetName = "Sheet1";
		Thread.sleep(1000);
		XLBase e = new XLBase();
		int totalRows = XLBase.getTotalRow(FileName, SheetName);
		for (int i = 1; i <= totalRows; i++) {
			Actions action = new Actions(driver);
			WebElement addEmployee = driver.findElement(By.id("menu_pim_viewPimModule"));
			action.moveToElement(addEmployee).perform();
			Thread.sleep(3000);
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			String FName1 = XLBase.getCellData(FileName, SheetName, i, 0);
			String MName2 = XLBase.getCellData(FileName, SheetName, i, 1);
			String LName3 = XLBase.getCellData(FileName, SheetName, i, 2);

			driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(FName1);
			Thread.sleep(1000);
			driver.findElement(By.id("middleName")).sendKeys(MName2);
			Thread.sleep(1000);
			driver.findElement(By.id("lastName")).sendKeys(LName3);
			Thread.sleep(1000);
			driver.findElement(By.id("btnSave")).click();

		}

	}

}