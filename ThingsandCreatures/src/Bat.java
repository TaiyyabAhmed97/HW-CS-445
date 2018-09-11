public class Bat extends Creatures implements  Flyer{
    public Bat(String name)
    {
        super(name);
    }

    public void move()
    {
        this.fly();
    }

    public void fly()
    {
        System.out.println(this.toString()+ " is swooping through the dark.");
    }

    public void eat(Things aThing)
    {
        String classname = aThing.getClass().getSimpleName();
        if(classname.equals("Creatures"))
        {
            super.eat(aThing);
        }
        else if(classname.equals("Things"))
        {
            System.out.println(this.toString()+" won't eat "+aThing.toString());
        }
        else
        {

        }
    }
}
