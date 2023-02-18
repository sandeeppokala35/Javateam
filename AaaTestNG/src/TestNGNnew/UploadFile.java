package TestNGNnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {

		String baseUrl = "http://demo.guru99.com/test/upload/";
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		driver.manage().window().maximize();
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\photo123.jfif");

		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();

		System.out.println(uploadElement.getText());

	}

}
