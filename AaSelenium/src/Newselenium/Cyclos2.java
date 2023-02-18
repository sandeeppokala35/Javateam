package Newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cyclos2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.cyclos.org");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//a[@aria-label='Login']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys("demo");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//action-button[@actionkind='primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='content-title d-flex']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='quick-access-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='content-title d-flex']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-icon ml-2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=' Badar Mohamed Moumin']")).click();

	}

}
