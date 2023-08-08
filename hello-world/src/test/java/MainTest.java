import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getMessageCorrect() {
        assertEquals("Hello World!", Main.getMessage());
    }

    @Test
    public void testAlwaysTrue() {
        assertTrue(true);
    }
    
    @Test
    public void testThrowException() {
        int x = 5 / 0;
    }
}
