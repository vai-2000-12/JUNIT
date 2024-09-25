/*
 *Method Used From Library :- 🔽
 static void :	assertArrayEquals(String message, int[] expecteds, int[] actuals)
     What it Does ↪️ :  Asserts that two int arrays are equal.
*/
package src;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;


public class MTest {
      
    @BeforeClass
    public static void printStatement(){
        System.out.println("Testing Is starting");
    }
   
    @Test
    public void checkAnArray(){
        M  m = new M();

        int[] original = {1, 3, 5, 7, 9};
         
        int[] expected = {9, 7, 5, 3, 1};
        
        int [] actual =  m.reverseArray(original);

        assertArrayEquals("Arrays are Equal", expected, actual);
    }
     
    @AfterClass
    public static void printStatement1(){
        System.out.println("All test Cases Passed..!!");
    }
}
