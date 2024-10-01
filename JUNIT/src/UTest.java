package src;
import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;



public class UTest {
    
    @BeforeClass
    public static void printStatus() {
        System.out.println("Test Started");
    }
    

    @Test
    public void CheckMultiplyMethod() {
        U u = new U();
        int res = u.multiply(2, 3);
        assertEquals(6, res);
    }

    @Ignore
    @Test
    public void CheckAdd() {
        U u = new U();
        int res = u.add(2, 3);
        assertEquals(5, res);
    }

    @AfterClass
    public static void main() {
     
        Result result = JUnitCore.runClasses(UTest.class);
        System.out.println("The Number of Test Cases Run is: " + result.getRunCount());
        System.out.println("The Number of Ignored Test Cases  are : " + result.getIgnoreCount());
        
    }
}
/* 
 🔴 This result will be printed In the Debug Console..
 ⚠️ One new thing I got to know that if We are applying the Any Annotation in main Method it should have no parameters
The Number of Test Cases Run is: 1
The Number of Ignored Test Cases  are : 1
*/
