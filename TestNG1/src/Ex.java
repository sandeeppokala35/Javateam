import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex {
	@BeforeTest
	public void a() {
		System.out.println("a");
	}
	@Test
	public void b() {
		System.out.println("b");
	}
	@AfterTest
	public void c() {
		System.out.println("c");
	}

}
