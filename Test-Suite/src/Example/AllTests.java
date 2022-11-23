package Example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CubeTest.class,MarksTest.class,palindromeTest.class,PrimeTest.class})
public class AllTests { 

}
