import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void getMessageCorrect() {
        assertEquals("Hello World!", Main.getMessage());
    }
}
