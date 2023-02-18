package Newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.navigate().to("https://m.redbus.in");
		driver.manage().window().maximize();
		String title = driver.getTitle(); // print title of the webpage
		System.out.println("title");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());// print the current URL Webpage
		driver.findElement(By.xpath("//input[@tabindex='1']")).sendKeys("Suryapet (telangana)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Suryapet (telangana)");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//li[@data-id='266339']")).click();
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).sendKeys("12-12-2022");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class='current day']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[2]/ul/div[1]/li/div/div[2]/div[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[2]/ul/div[1]/li/div[2]/div[2]/div[1]/div/div/div/div[2]/div[3]/div[2]/canvas"))
				.click();
	}

}
