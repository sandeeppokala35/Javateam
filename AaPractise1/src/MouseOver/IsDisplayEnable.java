package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayEnable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.name("username")).isDisplayed());
		System.out.println(driver.findElement(By.name("username")).isEnabled());
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));

	}
}
