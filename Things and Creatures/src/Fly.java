public class Fly extends Creatures implements Flyer {
    public Fly(String name)
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
        String classname = this.getClass().getSimpleName();
        if(classname.equals("Creatures"))
        {
            System.out.println(this.toString()+" won't eat "+aThing.toString());
        }
        else
        {
            super.eat(aThing);
        }
    }
    //comment
}
