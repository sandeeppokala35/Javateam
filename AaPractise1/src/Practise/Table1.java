package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/JESUS/OneDrive/Desktop/Table.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.xpath("/html/body/table"));
		Thread.sleep(3000);
		List<WebElement> totalRows = table.findElements(By.tagName("tr"));
		Thread.sleep(3000);
		System.out.println(totalRows.size());
		Thread.sleep(3000);
		for (int row = 1; row < totalRows.size(); row++)
			System.out.println(totalRows.get(row).getText());
		Thread.sleep(3000);
		List<WebElement> totalColums = totalRows.get(1).findElements(By.tagName("td"));
		System.out.println(totalColums.size());
		Thread.sleep(3000);
		for (int col = 1; col < totalColums.size(); col++)

			System.out.println(totalColums.get(col).getText());

	}

}
