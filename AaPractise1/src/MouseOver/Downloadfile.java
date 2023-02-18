package MouseOver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();

		// download Text File
		driver.findElement(By.id("textbox")).sendKeys("SoftwareTesting");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();

		isFileExist("C:\\Users\\JESUS\\Downloads\\info (1).txt");
		// download PDF File
		driver.findElement(By.id("pdfbox")).sendKeys("SoftwareTesting");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();

	}

	// File existed or Not
	static boolean isFileExist(String path) {
		File f = new File(path);
		if (f.exists()) {
			return true; // file is exist return is true....
		}

		else {
			return false;
		}

	}

}
