import org.junit.Test;

import static org.junit.Assert.*;

public class TigerTest {
    @Test
    public void move() throws Exception {

        Tiger Tiger1 = new Tiger("Tigger");
        Tiger1.move();
        assertEquals("Tigger Tiger has just pounced.", Tiger1.toString()+ " has just pounced.");
    }

}