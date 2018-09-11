public abstract class Creatures extends Things {
    public String stomach;
    public Creatures(String name) {
        super(name);
    }

    public void eat(Things aThings)
    {
        this.stomach = aThings.toString();
        System.out.println(this.toString()+ " has just eaten a " + aThings.toString());
    }

    public abstract void move();

    public void whatDidYouEat()
    {
        if(this.stomach==null)
        {
            System.out.println(this.toString() +" has had no Things to eat!");
            return;
        }
        System.out.println(this.toString() +" has just eaten a " + stomach);
    }

}