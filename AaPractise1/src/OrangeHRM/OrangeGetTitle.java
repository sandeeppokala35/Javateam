package OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrangeGetTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// login
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		// PIM-EMPLOYEE LIST
		WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(PIM).perform();
		WebElement employeelist = driver.findElement(By.id("menu_pim_viewEmployeeList"));
		Thread.sleep(3000);
		a.click(employeelist).perform();
		Thread.sleep(3000);
		// CHECKING EMPLOYEE LIST IN TABLE
		driver.findElement(By.linkText("Vijay12")).click();
		Thread.sleep(3000);
		// CLICKING IN TABLE
		driver.findElement(By.linkText("Job")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[6]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		Thread.sleep(3000);
		// CHECKING ALL OPTIONS
		WebElement Dropdown = driver.findElement(By.name("job[job_title]"));
		Thread.sleep(3000);
		Select HRM = new Select(Dropdown);
		Thread.sleep(3000);
		List<WebElement> alloptions = HRM.getOptions();
		Thread.sleep(3000);
		System.out.println(alloptions.size());
		Thread.sleep(3000);

		for (WebElement a1 : alloptions) {
			System.out.println(a1.getText());
		}
		HRM.selectByVisibleText("Testings latest soft2023");
		Thread.sleep(3000);
		System.out.println(HRM.getFirstSelectedOption().getText());

	}

}
