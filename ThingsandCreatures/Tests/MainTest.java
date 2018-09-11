import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMain() throws Exception  {
        Things thing = new Things("Rocky");
        assertEquals("Rocky",thing.toString());

    }

}