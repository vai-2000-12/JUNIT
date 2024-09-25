/*
 Method Used ↪️ : static void :	fail(String message)
        Work 😊 :   Fails a test with the given message.

    Also Tried 🔽 :
       static void : fail()
          Fails a test with no message.
*/
package src;
import static org.junit.Assert.fail;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class NTest {
    @BeforeClass
    public static void print(){
        System.out.println("Testing Is started..!");
    }

    @Test
    public void checkIsEven(){
        N n = new N();
        if(!n.isEven(2)){
            fail("Expected 2 to be Even , it was Not");
            // fail();  No parameterized Version If the Value is Odd then Only Asssertion Error Will Come Since we are not Specifying the Number
        }
    }

    @AfterClass
    public static void print1(){
        System.out.println("Testing Finished..!!");
    }
}

/*   
     // Case for Failure 🚫🔽 (●'◡'●)
     if(!n.isEven(3)){
            fail("Expected 2 to be Even , it was Not");
        }

     Since 3 is Not An Even Number then this message with the Assertion Error Will get Printed
  
java.lang.AssertionError: Expected 2 to be Even , it was Not
        at org.junit.Assert.fail(Assert.java:89)
        at src.NTest.checkIsEven(NTest.java:20)
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
        at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)
        at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)
        at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:530)
        at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:758)
        at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:453)
        at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:211)

*/