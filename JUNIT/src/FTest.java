package src;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FTest {
    
    F ft ;

    //Name for this can be anything : This is Just For Practice:
    @Before
    public void setUp(){
        ft = new F();
    }
 
    @BeforeClass
    public static void print(){
        System.out.println("Testing the Class with @Test(timeout = 1000) as an Annotation");
    }


    @AfterClass
    public static void print2() {
        System.out.println("Testing Finished...!!🥳🥂");
    }


    @Test(timeout = 1000)
     public void testWithTimeout() throws InterruptedException{
        ft.waitFor(500);
     }

//This Failed Because the Timeout Should be Before 1000 milliseconds Else it will throw TestTimedOutException
     @Ignore
     @Test(timeout = 1000)
     public void testWithTimeoutHavingMoreWaitThenTimeoutAnnotation()throws InterruptedException{
        ft.waitFor(1500);
    
    /* STACK TRACE 🙂
    org.junit.runners.model.TestTimedOutException: test timed out after 1000 milliseconds
        at java.base/java.lang.Thread.sleep0(Native Method)
        at java.base/java.lang.Thread.sleep(Thread.java:465)
        at src.F.waitFor(F.java:5)
        at src.FTest.testWithTimeoutHavingMoreWaitThenTimeoutAnnotation(FTest.java:30)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
        at java.base/java.lang.reflect.Method.invoke(Method.java:578)
        at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
        at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
        at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
        at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
        at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:299)
        at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:293)
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
        at java.base/java.lang.Thread.run(Thread.java:1589)
    */ 
    }
}
