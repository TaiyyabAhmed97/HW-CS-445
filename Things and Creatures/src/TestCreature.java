public class TestCreature {

    public static final int THING_COUNT = 10;
    public static final int CREATURE_COUNT = 10;

    public static void main(String [] args)
    {
        Things [] thingarray = new Things[THING_COUNT];
        thingarray[0] = new Things("banana");
        thingarray[1] = new Things("apple");
        Tiger Tiger1 = new Tiger("Sabertooth");
        Tiger Tiger2 = new Tiger("jungleCat");
        Tiger Tiger3 = new Tiger("ForestCat");
        thingarray[2] = new Things("cellphone");
        thingarray[3] = Tiger3;
        thingarray[4] = new Things("human");
        thingarray[5] = Tiger1;
        thingarray[6] = new Things("keyboard");
        thingarray[7] = new Things("mouse");
        thingarray[8] = Tiger2;
        thingarray[9] = new Things("shell");
        System.out.println("Things:\n\n");
        for(int i =0;i<thingarray.length;i++)
        {
            System.out.println(thingarray[i]);
        }
        System.out.println("\n\n");
        System.out.println("Creatures:\n\n");
        Creatures [] CreatureArray = new Creatures[CREATURE_COUNT];
        Ant tempAnt = new Ant("forest");
        tempAnt.eat(thingarray[0]);
        CreatureArray[0] = Tiger1;
        Fly mosquito = new Fly("mosquito");
        mosquito.eat(thingarray[1]);
        CreatureArray[1] = Tiger2;
        Bat newBat = new Bat("darkbat");
        newBat.eat(thingarray[7]);
        CreatureArray[2] = Tiger3;
        Tiger Tiger4 = new Tiger("Striped");
        Tiger4.eat(thingarray[4]);
        CreatureArray[3] = Tiger4;

        Ant tempAnt1 = new Ant("red");
        tempAnt1.eat(thingarray[4]);
        CreatureArray[4] = tempAnt;
        Fly mosquito2 = new Fly("fruit");
        mosquito2.eat(thingarray[6]);
        CreatureArray[5] = mosquito;
        Bat newBat2 = new Bat("jungle");
        newBat2.eat(thingarray[6]);
        CreatureArray[6] = newBat;
        Tiger Tiger5 = new Tiger("forest");
        Tiger5.eat(thingarray[7]);
        CreatureArray[7] = Tiger5;

        Fly randfly = new Fly("bug");
        randfly.eat(tempAnt);
        Bat randbat = new Bat("Fruit");
        randbat.eat(newBat);
        CreatureArray[8] = randfly;
        CreatureArray[9] = randbat;
        System.out.println("\n\n");
        for(int j =0;j<CreatureArray.length;j++)
        {
            CreatureArray[j].move();
            System.out.println("\n");
            CreatureArray[j].whatDidYouEat();
            System.out.println("\n");
        }

    }
}
