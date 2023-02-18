package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/JESUS/Downloads/Pages/Pages/TestIFramePage.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Dropdown = driver.findElement(By.name("dropdown"));
		Select select = new Select(Dropdown);
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByIndex(0);
		Thread.sleep(3000);
		select.selectByIndex(3);

	}

}
