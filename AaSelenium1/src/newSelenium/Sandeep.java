package newSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sandeep {

	public static void main(String[] args) throws InterruptedException {
		// WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://m.redbus.in");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();

		// driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("sandeep
		// pokala");
		// WebElement login = driver.findElement(By.xpath("//div[@class='mkHrUc']"));
		// Actions act = new Actions(driver);
		// act.dragAndDrop("//div[@class='mkHrUc']", login);
		// act.moveToElement(login).perform();
		// act.click().perform();
		// driver.switchTo().alert().dismiss();

	}
}
