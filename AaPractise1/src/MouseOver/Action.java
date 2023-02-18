package MouseOver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Action {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("frmList_ohrmListComponent")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("tableWrapper")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Akshar Akshar")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Job")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
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
		HRM.selectByVisibleText("Tester123");
		Thread.sleep(3000);
		System.out.println(HRM.getFirstSelectedOption().getText());

	}

}
