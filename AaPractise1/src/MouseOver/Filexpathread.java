package MouseOver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filexpathread {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Properties config = new Properties();

		File f = new File("C:\\Users\\JESUS\\eclipse-workspace\\AaPractise1\\src\\MouseOver\\Files.properties");
		FileInputStream fis = new FileInputStream(f);

		config.load(fis);
		driver.get(config.getProperty("URL"));
		driver.manage().window().maximize();

		driver.findElement(By.name("txtUsername")).sendKeys(config.getProperty("Admin_UserName"));
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys(config.getProperty("Admin_Password"));
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();

	}

}
