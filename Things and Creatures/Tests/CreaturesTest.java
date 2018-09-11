import org.junit.Test;

import static org.junit.Assert.*;

public class CreaturesTest {
    @Test
    public void eat() throws Exception {
        Tiger Tiger1 = new Tiger("Jungle");
        Things aThing = new Things("Lion");
        Tiger1.eat(aThing);
        assertEquals("Lion",Tiger1.stomach);
    }

    @Test
    public void testmove() throws Exception {
        Fly fly1 = new Fly("bug");
        fly1.move();
        assertEquals(("bug Fly is buzzing around in flight."),fly1.toString()+ " is buzzing around in flight.");
    }

    @Test
    public void whatDidYouEat() throws Exception {
        Tiger Tiger1 = new Tiger("Jungle");
        Things aThing = new Things("Lion");
        Tiger1.eat(aThing);
        Tiger1.whatDidYouEat();
        assertEquals(("Jungle Tiger has just eaten a Lion"),(Tiger1.toString() +" has just eaten a " + Tiger1.stomach));
    }

}