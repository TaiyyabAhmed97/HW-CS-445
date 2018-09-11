public class Tiger extends Creatures {
    public Tiger(String name)
    {
        super(name);
    }

    public void move()
    {
        System.out.println(this.toString() + " has just pounced.");
    }
}