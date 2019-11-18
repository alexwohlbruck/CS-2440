package solution;

/**
 * Interface for AnimalLocation.
 * 
 * @author Alex Wohlbruck
 * @version 2019-02-21
 *
 */
public interface AnimalLocation
{
    /**
     * Getter for name.
     * @return name name
     */
    String getName();
    
    /**
     * Setter for name.
     * @param name name
     */
    void setName(String name);
    
    /**
     * Getter for number of animals.
     * @return size number of animals
     */
    int getNumOfAnimals();
}
