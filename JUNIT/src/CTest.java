package src;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;

//-- 1 
//The @Before annotation ensures that the  method is run before Any test case.
// Here its Checking that Object is made of the Class That has to go for Unit Testing..

//--2
// The @After anotation ensures that any method with this type of annotation will only run 
//after the Test Cases
public class CTest {

    private C c;
   
    @Before
    public void setUp(){
     c =  new C();
    }

    @Test
    public void addTest(){
        int res = c.add(2, 3);
        assertEquals(5, res);
    }
   
    // This is the Test for the Zero Numbers
    @Test
    public void addTestUsingZero(){
        int res = c.add(0, 3);
        assertEquals(3, res);
    }

    @Test
    public void addTestwithNeg(){
        int res = c.add(-1, 2);
        assertNotEquals(res, -1);
        assertEquals(res, 1);
    }
}
