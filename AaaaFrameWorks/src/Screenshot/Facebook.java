package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Dhanush Yadav");
		driver.findElement(By.id("pass")).sendKeys("viral dhanush");
		driver.findElement(By.name("login")).sendKeys("viral dhanush");

	}

}
