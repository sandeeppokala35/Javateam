import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	//public static void main(String[] args) {
	@BeforeSuite
	public void test1() {
		System.out.println("1");
	}
	@BeforeTest
	public void test2() {
		System.out.println("2");
	}
	@BeforeClass
	public void test3() {
		System.out.println("3");
	}
	@BeforeMethod
	public void test4() {
		System.out.println("4");
	}
	@Test
	public void test5() {
		System.out.println("5");
	}



}