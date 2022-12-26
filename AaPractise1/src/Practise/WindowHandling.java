package Practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/JESUS/Downloads/NewWindow.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("HTML tutorial!")).click();

		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		Set<String> childList = driver.getWindowHandles();
		Iterator<String> it = childList.iterator();
		Thread.sleep(3000);
		while (it.hasNext())

		{
			String childName = it.next();
			if (!parent.contentEquals(childName)) {
				driver.switchTo().window(childName);
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(2000);

			}

		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close();
	}

}
