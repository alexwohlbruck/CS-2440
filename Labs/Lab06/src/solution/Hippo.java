package solution;

/**
 * Class for Hippo.
 * 
 * @author Alex Wohlbruck
 * @version 2019-02-21
 *
 */
public class Hippo extends Animal
{
    /**
     * Constructor for Hippo.
     * @param myZoo myZoo
     * @param name name
     */
    public Hippo(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }

    /**
     * Make noise.
     */
    @Override
    public void makeNoise()
    {
        System.out.println("blub...");
    }

    /**
     * Eat.
     */
    @Override
    public void eat()
    {
        System.out.println("slurp...");
        setHungerLevel(getHungerLevel() - 1);
    }
}
