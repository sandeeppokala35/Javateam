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
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Pages.OrangeLoginPage;

public class BaseClass { // every script baseclass is ParentClass

	public static WebDriver driver; // webdriver define onlyone we can use throughout project Global access any area

	public static Properties prop;

	public static Actions action;
	// Reports
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

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
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/TestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Test Reports");
		htmlReporter.config().setReportName("Test Reports ");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);

		OrangeLoginPage loginpage = PageFactory.initElements(driver, OrangeLoginPage.class);

		enterData(loginpage.Username, "Admin");
		enterData(loginpage.Password, "Qedge123!@#");
		Click(loginpage.LoginButton);

	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:",
					ExtentColor.RED));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}

	}

	@AfterSuite
	public void reportGenerate() {
		System.out.println("In report Generate");
		extent.flush();

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
		FileUtils.copyFile(src, convt); //common io 2.0 dependenices

	}
}
