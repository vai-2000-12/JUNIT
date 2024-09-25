/*
Library Method used 😇 :- static void	assertArrayEquals(int[] expecteds, int[] actuals)
          Asserts that two int arrays are equal. 
*/
package src;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class LTest {
  
    @BeforeClass
    public static void print()
    {
        System.out.println("Testing started");
    }

   @Test
   public void testArray(){
      L l = new L();
     int [] original = {1, 2, 3, 4 ,5};
      
     int [] expectedArray = {5, 4, 3, 2, 1};

     int [] actualArray =  l.reverseArray(original);
     
     assertArrayEquals(expectedArray,actualArray);
   }

   @AfterClass
   public static void printStatement1(){
    System.out.println("All test Cases Passed .. !! Thanks For Testing");
   }

}
