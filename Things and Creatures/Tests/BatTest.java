import org.junit.Test;

import static org.junit.Assert.*;

public class BatTest {
    @Test
    public void move() throws Exception {
        Bat fly1 = new Bat("Fruit");
        fly1.move();
        assertEquals(("Fruit Bat is swooping through the dark."),fly1.toString()+ " is swooping through the dark.");
    }

    @Test
    public void eat() throws Exception {
        Fly fly1 = new Fly("bob");
        Bat bat1 = new Bat("Scary bat");
        assertEquals("Scary bat Bat has just eaten a bob Fly", bat1.toString() + " has just eaten a "+ fly1.toString());
        Things banana = new Things("banana");
        assertEquals("Scary bat Bat won't eat banana", bat1.toString() + " won't eat "+ banana.toString());

    }

    @Test
    public void donteat() throws Exception {
        Bat bat1 = new Bat("Scary bat");
        Things banana = new Things("banana");
        assertEquals("Scary bat Bat won't eat banana", bat1.toString() + " won't eat "+ banana.toString());

    }

}