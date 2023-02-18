package testNG123;

import org.testng.annotations.Test;

public class TestNG1 {

	@Test(groups = { "Regression" })

	public void TC1() {
		System.out.println("Regression");
	}

	@Test(groups = { "Smoke" })

	public void TC2() {
		System.out.println("Smoke");
	}

	@Test(groups = { "Regression" })

	public void TC3() {
		System.out.println("Regression");
	}

	@Test(groups = { "Smoke" })
	public void TC4() {
		System.out.println("Smoke");

	}

	@Test(groups = { "Regression" })
	public void TC5() {
		System.out.println("Regression");
	}

	@Test(groups = { "Smoke" })
	public void TC6() {
		System.out.println("Smoke");
	}
}
