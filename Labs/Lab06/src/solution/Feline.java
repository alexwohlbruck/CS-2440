package solution;

/**
 * Class for Feline.
 * 
 * @author Alex Wohlbruck
 * @version 2019-02-21
 *
 */
public abstract class Feline extends Animal
{
    /**
     * Constructor for Feline.
     * @param myZoo myZoo
     * @param name name
     */
    public Feline(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    
    /**
     * Roam.
     */
    @Override
    public void roam()
    {
        System.out.println("felines like to roam alone...");
        setHungerLevel(getHungerLevel() + 1);
    }
}
