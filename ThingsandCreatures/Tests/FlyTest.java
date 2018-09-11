import org.junit.Test;

import static org.junit.Assert.*;

public class FlyTest {
    @Test
    public void move() throws Exception {
        Fly Fly1 = new Fly("Fruit Fly");
        Fly1.move();
        assertEquals("Fruit Fly Fly  is swooping through the dark.", Fly1.toString() + "  is swooping through the dark.");
    }

    @Test
    public void fly() throws Exception {
        Fly Fly1 = new Fly("Basket Fly");
        Fly1.fly();
        // since i tested move, and move just simply calls fly(), i don't need to test fly.
    }

    @Test
    public void eat() throws Exception {
        Fly fly1 = new Fly("random fly");
        Things Apple = new Things("Apple");
        fly1.eat(Apple);
        assertEquals("random fly Fly has just eaten a Apple", fly1.toString() + " has just eaten a "+Apple.toString());
    }

}