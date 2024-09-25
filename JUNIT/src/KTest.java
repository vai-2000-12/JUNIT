package src;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class KTest {

    @BeforeClass
    public static void print(){
     System.out.println("Starting The Test");
    }
    

    @Test
    public void checkIfItItsOdd(){
        K kk = new K();
        assertTrue(kk.isOdd(3));
        // assertFalse(kk.isOdd(3));
        /*
          In this assertFalse Since the Number is Odd and  
          thats the reason its showing AssertionError
          🔽
         *java.lang.AssertionError
        at org.junit.Assert.fail(Assert.java:87)
        at org.junit.Assert.assertTrue(Assert.java:42)
        at org.junit.Assert.assertFalse(Assert.java:65)
        at org.junit.Assert.assertFalse(Assert.java:75)
        at src.KTest.checkIfItItsOdd(KTest.java:20)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
        at java.base/java.lang.reflect.Method.invoke(Method.java:578)
        at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
        at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
        at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
        at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
        at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
        at org.junit.runners.BlockJUnit4ClassRunner$1.evaluate(BlockJUnit4ClassRunner.java:100)
        at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:366)
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:103)
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:63)
        at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
        at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
        at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
        at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
        at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
        */
    }

    @AfterClass
    public static void printStatement(){
        System.out.println("Test Cases Passed");
    }
}
