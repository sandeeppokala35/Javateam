package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTestNG {
	@BeforeSuite
	public void loginFun() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("RickRonald12");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("PU4PQ1");
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();

	}

	@Test
	public void addEmployee() {
		System.out.println("Employee 1");
	}
}