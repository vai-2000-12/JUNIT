package src;
import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

public class GTest {
      static G gg;
      
      @SuppressWarnings("deprecation")
      @Rule
      public ExpectedException  ec = ExpectedException.none();


    @BeforeClass
    public static void setUp(){
        gg = new G();
        System.out.println("Test Will Start...!!");
    }

    @Test 
    public void checkDivision(){
        int res = gg.divide(10, 2);
        assertEquals(5, res);
        System.out.println("Check Divison Done...!!");
    }
     
   @Test
   public void DivideByZeroException(){
    ec.expect(IllegalArgumentException.class);
    ec.expectMessage("Cannot Divide By Zero");
    gg.divide(10, 0);
   } 
}
