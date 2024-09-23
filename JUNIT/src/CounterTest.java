package src;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CounterTest {

     Counter counter;

    // Set up the counter object before each test
    @Before
    public void setUp() {
        counter = new Counter();
    }

    // Reset the counter after each test
    @After
    public void tearDown() {
        counter.reset();
        System.out.println("Counter reset after test");
    }

    @Test
    public void testIncrement() {
        counter.increment();
        assertEquals(1, counter.getCount());
    }

    @Test
    public void testIncrementTwice() {
        counter.increment();
        counter.increment();
        assertEquals(2, counter.getCount());
    }
}
