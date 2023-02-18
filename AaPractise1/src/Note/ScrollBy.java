package Note;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		driver.manage().window().maximize();

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		System.out.println("Successfully  scrolled");
		Thread.sleep(2000);
		// driver.close();
	}

}
