package src;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;

//--1
//Learned About the @BeforeClass and @AfterClass Annotation using Junit 
// We can use this Class To print Something After or Before The Test Cases

// ---2
//  I learned About the @assertNotEquals() which basically means if the expected Res
// is not equal with Actual  Result then it will Pass the Test Cases

public class MultiplyNumberTest {
    MultiplyNumber ml ;
    
    @Before
    public void setUp(){
      ml = new MultiplyNumber();
    }

    @BeforeClass
    public static void BeforeTear(){
        System.out.println("Running the Test Cases .. Wait");
    }

    @Test
    public void MulOfTwoNumbers(){
        int res = ml.multiply(2, 4);
        assertNotEquals(9, res);
    }
     
    @Test
    public void MultOfTwoNumbers(){
        int res = ml.multiply(2, 4);
        assertEquals(8, res);
    }
     
    @AfterClass
    public static void tearDown(){
        System.out.println("All Test Case Passed!!");
    }
}
