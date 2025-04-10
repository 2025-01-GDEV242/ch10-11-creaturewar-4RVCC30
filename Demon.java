

/**
 * The Demon class implements a wrapper for the base Creature class with the following additions
 * the attack class has a 5% chance to add an extra 50 base damage to the attack damage
 * 
 * @author Emery Vallejo
 * @version 2025-04 v1.1
 */
public class Demon extends Creature
{
    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Demon(int maxStr,int minStr, int maxHp, int minHp)
    {
        super(
            Randomizer.nextInt(maxStr-minStr)+ minStr,
            Randomizer.nextInt(maxHp-minHp)+ minHp        
        );
    }
    @Override
    public int attack()
    {
        if( (Randomizer.nextInt(101) -1) <= 5) return (super.attack() + 50);
        else return super.attack();
    }
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}
