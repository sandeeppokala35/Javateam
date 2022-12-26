package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeGettitle {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]").
		Thread.sleep(3000);

		WebElement Job = driver.findElement(By.id("menu_admin_Job"));
		Thread.sleep(3000);

		driver.findElement(By.name("btnAdd")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Testings latest soft2023");
		Thread.sleep(3000);
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Officials 2022");
		Thread.sleep(3000);
		driver.findElement(By.id("jobTitle_note")).sendKeys("Add 100");
		Thread.sleep(3000);
		driver.findElement(By.name("btnSave")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[6]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("job[job_title]")).click();
		Thread.sleep(3000);
		WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"job_job_title\"]/option[7]"));
		WebElement selectoptiop = Dropdown
				.findElement(By.xpath("//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[1]/label"));
		Thread.sleep(3000);
		Select select2 = new Select(Dropdown);
		Thread.sleep(3000);
		if (Dropdown.getText().equals("Testings latest soft2023"))

		{
			System.out.println("Found in List:" + selectoptiop);
		}

	}

}
