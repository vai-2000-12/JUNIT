package src;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;


public class ETest {
     
    E e;

    @Before
    public void setUp(){
       e = new E();
    } 

    @BeforeClass
    public static  void printStatement(){ 
        System.out.println("The Test Case Is Running!!.. Wait");
    }

    @Test
    public void SubtractTwoNumber(){
        int res = e.Subtract(3, 2);
        assertEquals(1, res);
    }

    @Ignore
    @AfterClass
    public static void print(){
          System.out.println("This Test Case Was Ignored..!!");
    } 
}
