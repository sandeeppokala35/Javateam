package Newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JESUS\\Downloads\\chromedriver.exe");
		driver.get("https://facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Suresh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("psrlds");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sureshpsrlds850@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sureshpsrlds850@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("9948349066");

		// Select(driver.findElement(By.xpath("//select[@id='day']"))).selectByIndex(7);
		Thread.sleep(3000);

		new Select(driver.findElement(By.xpath("//select[@id='day']"))).selectByValue("10");
		Thread.sleep(3000);

		new Select(driver.findElement(By.xpath("//select[@id='month']"))).selectByValue("11");
		Thread.sleep(3000);

		new Select(driver.findElement(By.xpath("//select[@id='year']"))).selectByValue("1995");
		Thread.sleep(3000);
		// new Select(driver.findElement(By.xpath("//input[@type='radio']")).
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.findElement(By.xpath("//div[@aria-label='More options']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='listitem']")).click();
		driver.close();

	}

}
