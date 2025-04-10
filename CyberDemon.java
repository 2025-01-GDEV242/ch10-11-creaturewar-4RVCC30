

/**
 * The CyberDemon class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the Demon type [100/25]
 * Implements a maximum/minimum hitpoint total for the Demon type [100/25]
 * 
 * @author Emery Vallejo
 * @version 2025-04 v1.1
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 100;
    private static final int MIN_CYBERDEMON_STR = 25;

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public CyberDemon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
        MAX_CYBERDEMON_STR,
        MIN_CYBERDEMON_STR,
        MAX_CYBERDEMON_HP,
        MIN_CYBERDEMON_HP
        );
          
    }
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}