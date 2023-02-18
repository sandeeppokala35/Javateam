package TestNGNnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DataProviderRead {
	public static WebDriver driver;

	@BeforeSuite
	public void init() throws Exception {

		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// login
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}

	@Test(dataProvider = "employeeData")
	public void method1(String fname, String mname, String lname) throws Exception {
		Thread.sleep(3000);
		WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions a = new Actions(driver);
		a.moveToElement(PIM).perform();
		WebElement addemployee = driver.findElement(By.id("menu_pim_addEmployee"));
		a.click(addemployee).perform();
		Thread.sleep(3000);

		driver.findElement(By.name("firstName")).sendKeys(fname);
		Thread.sleep(3000);
		driver.findElement(By.name("middleName")).sendKeys(mname);
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		Thread.sleep(3000);

	}
}
