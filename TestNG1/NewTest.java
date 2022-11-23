import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @BeforeTest
  public void f() {
  }
  @Test
  public void h() {
	  System.out.println("pavan");
  }

  @AfterTest
  public void a() {
	  System.out.println("kumar");
  }

}
