package src;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class PTest {

    @BeforeClass   
    public static void print(){
        System.out.println("Starting the Test..");
    }

    @Test
    public void CheckIfEndsWith(){
        P p = new P();

        // Get the actual string from the Valid() method
        String actualString = p.Valid();

        // Check if the string ends with "pur"
        assertThat(actualString, endsWith("pur"));
        System.out.println("Your Test Case is Passed ..The String Ends With pur");
        
    }
    @AfterClass
    public static void printStatement(){
      System.out.println("Test Case Passed And All test Cases Done!!");
    }
}
 /*
  java.lang.AssertionError: 
  Expected: a string ending with "put"
     but: was "Jabalpur"
        at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)
        at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)
        at src.PTest.CheckIfEndsWith(PTest.java:24)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
        at java.base/java.lang.reflect.Method.invoke(Method.java:578)
        at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
*/ 
