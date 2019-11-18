package solution;

/**
 * Class for FeralCat.
 * 
 * @author Alex Wohlbruck
 * @version 2019-02-21
 *
 */
public class FeralCat extends Feline
{
    /**
     * Constructor for FeralCat.
     * @param myZoo myZoo
     * @param name name
     */
    public FeralCat(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }

    /**
     * Make noise.
     */
    @Override
    public void makeNoise()
    {
        System.out.println("meow...");
    }

    /**
     * Eat.
     */
    @Override
    public void eat()
    {
        System.out.println("pick...");
        setHungerLevel(getHungerLevel() - 3);
    }
}
