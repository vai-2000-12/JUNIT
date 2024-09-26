package src;

import org.hamcrest.StringDescription;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class STest {

    @BeforeClass
    public static void Print() {
        System.out.println("Test Is Started");
    }

    @Test
    public void LearningAppendMethod() {
        S s = new S();
        String str = s.Check();

        StringDescription description = new StringDescription();
        description.appendText("Hello");

        assertThat(str, is(description.toString()));
    }

    @AfterClass
    public static void print1(){
        System.out.println("All test Case Passed");
    }
}
// Basically This AppendText(String str) checks if the String that is Appended is Same as The in the Java Class then it will pass the Test Case
// else it will Fail and will provide the Assertion Error in the Test Results 🙂 basically the stack trace 😐🫡😣..