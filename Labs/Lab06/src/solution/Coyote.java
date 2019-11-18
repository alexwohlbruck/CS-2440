package solution;

/**
 * Class for Coyote.
 * 
 * @author Alex Wohlbruck
 * @version 2019-02-21
 *
 */
public class Coyote extends Canine
{
    /**
     * Constructor for Coyote.
     * @param myZoo myZoo
     * @param name name
     */
    public Coyote(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }

    /**
     * Make noise.
     */
    @Override
    public void makeNoise()
    {
        System.out.println("howl...");
    }

    /**
     * Eat.
     */
    @Override
    public void eat()
    {
        System.out.println("gnaws...");
        setHungerLevel(getHungerLevel() - 2);
    }
}
