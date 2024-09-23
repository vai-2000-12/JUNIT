package src;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// -- 1  
// Learned How to start with Junit And started Learning How to Write the Unit test Cases Using Java
// Learned The Annotation @assertEquals() which expects that actual Result and Expected Result should 
// be same.. Then only the results will be passed 
public class AddNumbersTest {
    @Test
    public void testNumber(){
     AddNumbers ad = new AddNumbers();
      int res = ad.addNumbers(2, 3);
      assertEquals(5, res);
    }

    @Test
    public void testNumberWithZero(){
     AddNumbers ad = new AddNumbers();
      int res = ad.addNumbers(0, 3);
      assertEquals(3, res);
    }
}
