package Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesIdentify {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/JESUS/Downloads/Pages/Pages/TestIFramePage.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("frame1");
		Thread.sleep(3000);
		driver.findElement(By.name("Button5")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame2");
		driver.findElement(By.name("vehicle1")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();

	}

}
