import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example {
	@BeforeClass
	void beforeClass() {
		System.out.println("they will excute the before every class");
	}

	@AfterClass
	void afterClass() {
		System.out.println("they will excute the before every class");
	}

	@BeforeMethod
	void beforeMethod() {
		System.out.println("they will excute the before every method");
	}

	@AfterMethod
	void afterMethod() {
		System.out.println("they will excute the after every method");
	}

	@Test
	public void test1() {
		System.out.println("Testing Process 1");
	}

}
