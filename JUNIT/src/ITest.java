//This Test Was To learn About  @Assume Annotation which is Having the Two Methods assumeFalse(), assumeTrue();
package src;
import static org.junit.Assert.assertEquals;
import org.junit.Assume;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Ignore;



public class ITest {
    
    @BeforeClass
    public static void print(){
        System.out.println("Test Will Start");
    }
    
    @Test
    public void testEven(){
        I k = new I();
       Assume.assumeTrue(k.isEven(4));

       assertEquals(true, k.isEven(4));
    }
    
    @Ignore
    @Test
    public void testDivision(){
          I k = new I();
          Assume.assumeFalse(0 == 0); //this test will be skipped since 0 == 0 will return true
          //Assume.assumeTrue(0 == 0)
          assertEquals(2, k.divide(10, 2));
        //   assertEquals(5, k.divide(10, 2));  This comments If I open It then This Will TOO pass in Testing But Delete the Ignore Annotation
    }
 

    //This is to Print Some lines in Debug Console and same follows For the BeforeClass Annotation
    @AfterClass
    public static void print1(){
     System.out.println("All the Test Case Passed..!!👌😊");
    }
}