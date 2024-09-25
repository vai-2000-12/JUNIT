package src;
import static org.junit.Assume.assumeNotNull;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;

public class OTest {
    
    @BeforeClass
    public static void print(){
         System.out.println("Test is Started..");
    }

    @Test
    public void CheckIfTheArguNotNull(){
         String val1 = "Hello";
         String val2 = "World";
 
         //This Test Will pass the Test Case Since None Of The Arguments Are Null so Test Case Will Be Passed
         assumeNotNull(val1, val2);

         System.out.println("The Test Will Pass Since None Of the Value of the String is Null");
    }

    @Test
    public void CheckIfTheArguNotNull1(){
        String str1 = "Hello";
        String str2 =  null;

        assumeNotNull(str1, str2);

        System.out.println("This Will Not Be printed in The DebuG Console");
    }

    @AfterClass
    public static void printStatement(){
        System.out.println("Testing is Finished");
    }
}
/*
  🔴⚠️  the test will halt and be ignored. If the Value is Found to be Null 
*/ 