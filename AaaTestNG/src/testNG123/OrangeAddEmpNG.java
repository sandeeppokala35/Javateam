package testNG123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrangeAddEmpNG {
	@Test
	public void method2() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/pim/addEmployee");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement PIMMenu = driver.findElement(By.id("mainMenuFirstLevelUnorderedList"));
		Thread.sleep(3000);
		act.moveToElement(PIMMenu).perform();
		Thread.sleep(3000);
		WebElement addEmployee = driver.findElement(By.id("menu_pim_viewPimModule"));
		act.click(addEmployee).perform();
		act.contextClick(addEmployee);
		Thread.sleep(3000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Testing2023");
		Thread.sleep(3000);
		driver.findElement(By.name("middleName")).sendKeys("SoftWork");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("12271");
		Thread.sleep(3000);
		Actions upload = new Actions(driver);
		Thread.sleep(3000);
		upload.click(driver.findElement(By.xpath("//*[@id=\"photofile\"]"))).perform();
		Thread.sleep(6000);
		// String exePath = "C:\\AUIOrange\\OrangeHrmUp.exe";
		// Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\AUIOrange\\\\OrangeHrmUp.exe");
		Thread.sleep(12000);
		// driver.findElement(By.id("btnSave")).click();
	}
}
