package src;
import org.junit.runner.JUnitCore;
import static org.junit.Assert.assertEquals;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;


public class TTest {
    @BeforeClass 
    public static void print(){
        System.out.println("Testing Started");
    }

    // This Test will Pass
    @Test
    public void checkAdd(){
        T t = new T();
        int res = t.add(2, 3);
        assertEquals(5, res);
    }

    @Test
     public void CheckSub(){
        T t = new T();
        int res = t.subtract(3, 1);
        //  assertEquals(1, res);  // The Test Will Fail
         assertEquals(2, res);
     }



    @AfterClass 
    public static void print1(){
        System.out.println("Testing Completed..!! All test Cases Runned");
    }
    public static void main(String [] args){

       Result result = JUnitCore.runClasses(T.class); 
        
       if(!result.wasSuccessful()){
         for(Failure failure : result.getFailures()){
             System.out.println("Failure Message  :" + failure.getMessage());
            System.out.println("Test Failed :" + failure.getTestHeader());
         }
       }else {
          System.out.println("All Test Case Passed");
       }
    }
}
