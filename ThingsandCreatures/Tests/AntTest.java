import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.Test;

import static org.junit.Assert.*;

public class AntTest {
    @Test
    public void testmove() throws Exception {
        Ant tempAnt = new Ant("Fire");
        tempAnt.move();
        assertEquals("Fire Ant is moving around.", tempAnt.toString()+" is moving around.");
    }

}