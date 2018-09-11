import org.junit.Test;

import static org.junit.Assert.*;

public class BatTest {
    @Test
    public void testmove() throws Exception {
        Bat fly1 = new Bat("Fruit");
        fly1.move();
        assertEquals("Fruit Bat is swooping through the dark.",fly1.toString() + " is swooping through the dark.");
    }

    @Test
    public void eat() throws Exception {
        Ant ant1 = new Ant("bob");
        Bat bat1 = new Bat("Scary bat");
        bat1.eat(ant1);
        assertEquals("Scary bat Bat has just eaten a bob Ant", bat1.toString() + " has just eaten a "+ ant1.toString());


    }

}