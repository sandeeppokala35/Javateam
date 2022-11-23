import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGTest {
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }


  @Test
  public void test1Test() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void test2Test() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void test3Test() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void test4Test() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void test5Test() {
    throw new RuntimeException("Test not implemented");
  }
}
