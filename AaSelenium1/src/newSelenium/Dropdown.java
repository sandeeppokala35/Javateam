package newSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/JESUS/OneDrive/Desktop/doc.html");
		driver.manage().window().maximize();

		WebElement Dropdown = driver.findElement(By.name("college"));
		Thread.sleep(3000);
		Select select = new Select(Dropdown);
		Thread.sleep(3000);
		select.selectByVisibleText("Third");
		Thread.sleep(3000);
		select.selectByIndex(0);
		Thread.sleep(3000);
		select.selectByValue("saab");

		WebElement Dropdown1 = driver.findElement(By.id("b.tech"));
		Thread.sleep(3000);
		Select select1 = new Select(Dropdown1);
		select1.selectByVisibleText("CSE");
		Thread.sleep(3000);
		select1.deselectByVisibleText("CIVIL");
		Thread.sleep(3000);
		select1.selectByVisibleText("MECH");
		Thread.sleep(3000);
		select1.selectByVisibleText("ECE");
		Thread.sleep(3000);
		select1.selectByVisibleText("CSE");
		Thread.sleep(3000);
		select1.selectByVisibleText("CIVIL");
		Thread.sleep(3000);
		select1.deselectAll();

	}

}
