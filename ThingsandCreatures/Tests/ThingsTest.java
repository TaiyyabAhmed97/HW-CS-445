import org.junit.Test;

import static org.junit.Assert.*;

public class ThingsTest {
    @Test
    public void testtoString() throws Exception  {
        Things thing = new Things("Rocky");
        assertEquals("Rocky",thing.toString());
    }

}