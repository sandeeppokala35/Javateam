package Newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\" + "chromedriver.exe");

		driver.get("https://www.shaadi.com"); // get the Officer timer link
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()); // Printing Title

		driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile no. / Email ID']")).sendKeys("7036037900");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("sandeep");
		driver.findElement(By.xpath("//button[@data-testid='login_with_otp']")).click();
		// driver.quit(); // Close the Browser
	}

}
