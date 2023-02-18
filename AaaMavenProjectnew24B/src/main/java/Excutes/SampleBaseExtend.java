package Excutes;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.OrangeLoginPage;
import ReusableMulti.BaseClass;

public class SampleBaseExtend extends BaseClass {
	@Test
	public void sampletest() throws Exception { // method
		init();
		OrangeLoginPage loginpage = PageFactory.initElements(driver, OrangeLoginPage.class);

		enterData(loginpage.Username, "Admin");
		enterData(loginpage.Password, "Qedge123!@#");
		Click(loginpage.LoginButton);

	}

}
