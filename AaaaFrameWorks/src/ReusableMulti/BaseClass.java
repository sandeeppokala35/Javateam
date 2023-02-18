package ReusableMulti;

import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;

import Pages.OrangeLoginPage;

public class BaseClass { // every script baseclass is ParentClass

	public static WebDriver driver; // webdriver define onlyone we can use throughout project Global access any area

	public static Properties prop;

	public static Actions action;

	public static void init() throws Exception // Webdriver intialized Local
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir") + "\\Config.PropertyFile"));
		prop.load(fis);
		if (prop.getProperty("BROWSER").equalsIgnoreCase("chrome"))

		{
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Others\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("BROWSER").equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Others\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		action = new Actions(driver);
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();

	}

	@BeforeSuite
	public void sampletest() throws Exception { // method
		init();
		OrangeLoginPage loginpage = PageFactory.initElements(driver, OrangeLoginPage.class);

		enterData(loginpage.Username, "Admin");
		enterData(loginpage.Password, "Qedge123!@#");
		Click(loginpage.LoginButton);

	}

	public static void ClearData(WebElement element) {
		element.clear();
	}

	public static void enterData(WebElement element, String data) { // pass the webelement
		element.sendKeys(data);
	}

	public static void Click(WebElement element) {
		element.click();
	}

	// select by visibleTest
	public static void selectbyvisibleTest(WebElement element, String Text) {
		Select s = new Select(element);
		s.selectByVisibleText(Text);
	}

	// select by index
	public static void selectbyindex(WebElement element, int Text) {
		Select s = new Select(element);
		s.selectByIndex(Text);
	}

	// mouse hover
	public static void mousehover(WebElement element) {
		action.moveToElement(element).perform();
	}

	public static void frameswitch(WebElement element) {
		Frame f = new Frame();
		driver.switchTo().parentFrame();

	}

	public static void windowswitch(String element, String text) {
		driver.switchTo().window(element);
	}

	public static void screenShots(WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE); // converting the file
		// path define
		String path = "C:\\Screenshotpath\\Image" + "System.currentTimeMillis()+.png";

		File convt = new File(path); // File convertion covert
		FileUtils.copyFile(src, convt);

	}
}
