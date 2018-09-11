public class Ant extends Creatures {
    public Ant(String name)
    {
        super(name);
    }
    public void move()
    {
        System.out.println(this.toString() + " is crawling around.");
    }
}
