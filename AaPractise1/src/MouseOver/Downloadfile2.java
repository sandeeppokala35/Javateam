package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://C://Users//JESUS//OneDrive//Desktop//Download.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn")).click();

	}

}
