
/**
 * The Druid class implements a wrapper for the base Elf class with the following additions
 * the attack method also heals the druid for attack * 4 because the balrog is stupid strong
 * @author Emery Vallejo
 * @version 2025-04 v1.1
 */
public class Druid extends Elf
{
    @Override
    public int attack()
    {
        int atk = super.attack();
        int heal = super.attack() * 4;
        System.out.println("The Druid healed for " + heal + " Hp!");
        takeDamage(-heal);
        return atk;
    }
    
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}
