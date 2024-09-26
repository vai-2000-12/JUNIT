package src;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class QTest {
  @BeforeClass
  public static void print(){
      System.out.println("Test is Started");
  }


  @Test
  public void CheckString(){
    Q q = new Q();
     
     String actualString = q.isSubstringPresent();
    assertThat(actualString , containsString("Kar"));
  }

  @AfterClass
  public static void print1(){
      System.out.println("All test Cases Finished");
  }
}
