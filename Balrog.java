

/**
 * The Balrog class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the Demon type [100/50]
 * Implements a maximum/minimum hitpoint total for the Demon type [200/80]
 * Can attack twice
 * 
 * @author Emery Vallejo
 * @version 2025-04 v1.1
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
        MAX_BALROG_STR,
        MIN_BALROG_STR,
        MAX_BALROG_HP,
        MIN_BALROG_HP
        );
          
    }
    
    @Override
    public int attack()
    {
        return (super.attack() + super.attack());
    }
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}