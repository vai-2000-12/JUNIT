package src;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class KTest {

    @BeforeClass
    public static void print(){
     System.out.println("Starting The Test");
    }
    

    @Test
    public void checkIfItItsOdd(){
        K kk = new K();
        assertTrue(kk.isOdd(3));
    }

    @AfterClass
    public static void printStatement(){
        System.out.println("Test Cases Passed");
    }
}
