import java.util.ArrayList;

/**
 * war creates 2 sides of the war and pits them agaisnt each other. the good army has 100 creatures and the bad army has 50
 *
 * @author Emery Vallejo
 * @version 2025_04 2025-04 v1.0
 */
public class War
{
    Creature BadActive;
    Creature GoodActive;
    int ArmyBadSize;
    int ArmyGoodSize;
    Randomizer rand;
    War()
    {
        rand = new Randomizer();
        startWar();
    }
    void startWar()
    {
        Creature goodCreature = CreateArmyGood();
        Creature badCreature = CreateArmyBad();
        ArmyBadSize = 50;
        ArmyGoodSize = 100;
        int round = 0;
        while(ArmyGoodSize >= 0 && ArmyBadSize >= 0)
        {
            round++;
            System.out.println("Round " + round);
            System.out.println("Good army size: " + ArmyGoodSize + "\n" + "Bad army size: " + ArmyBadSize);
            System.out.println("__________________________________________________________________________");
            if(goodCreature.isKnockedOut())
            {
                ArmyGoodSize--;
                goodCreature = CreateArmyGood();
                System.out.println("A " + badCreature.getClass().getName() +" has entered the battle!");
            }
            if(badCreature.isKnockedOut())
            {
                ArmyBadSize--;
                badCreature = CreateArmyBad();
                System.out.println("A " + badCreature.getClass().getName() +" has entered the battle!");
            }
            System.out.println("__________________________________________________________________________");
            int turns = 0;
            while(goodCreature.isAlive() && badCreature.isAlive())
            {
                turns++;
                System.out.println("_________________________________________________________________________________");
                System.out.println("Turn " + turns);
                System.out.println("_________________________________________________________________________________");
                int badAtk = badCreature.attack();
                int goodAtk = goodCreature.attack();
                System.out.println("_________________________________________________________________________________");
                System.out.println("bad creature's turn\n_________________________________________________________________________________");
                System.out.println("The " + goodCreature.getClass().getName() + " has " + goodCreature.getHp() + " out of " + goodCreature.getMaxHp() + " Hp!");
                System.out.println("The " + badCreature.getClass().getName() + " swings at the " + goodCreature.getClass().getName() + " for " + badAtk + " Damage!");
                goodCreature.takeDamage(badAtk);
                System.out.println("The " + goodCreature.getClass().getName() + " has " + goodCreature.getHp() + " out of " + goodCreature.getMaxHp() + " Hp!");
                System.out.println("_________________________________________________________________________________");
                System.out.println("good creature's turn\n_________________________________________________________________________________");
                System.out.println("The " + badCreature.getClass().getName() + " has " + badCreature.getHp() + " out of " + badCreature.getMaxHp() + " Hp!");
                System.out.println("The " + goodCreature.getClass().getName() + " swings at the " + badCreature.getClass().getName() + " for " + goodAtk + " Damage!");
                badCreature.takeDamage(goodAtk);
                System.out.println("The " + badCreature.getClass().getName() + " has " + badCreature.getHp() + " out of " + badCreature.getMaxHp() + " Hp!");
            }
            System.out.println("__________________________________________________________________________");
            if(goodCreature.isKnockedOut()) System.out.println("The " + goodCreature.getClass().getName() +" has been slain!");
            if(badCreature.isKnockedOut())  System.out.println("The " + badCreature.getClass().getName() +" has been slain!");
            System.out.println("__________________________________________________________________________");
        }
        
        if(ArmyGoodSize > ArmyBadSize) System.out.println("The good army wins!");
        if(ArmyBadSize > ArmyGoodSize) System.out.println("The bad army wins!");
    }
    Creature CreateArmyGood()
    {
        for(int i = 100; i > 0; i++)
        {
            int random = rand.nextInt(10);
            
            if(random <= 6)
            {
                return new Human();
            }else if(random <= 7)
            {
                return new Elf();
            }else if(random <= 9)
            {
                return new Druid();
            }
        }
        return new Human();
    }
    Creature CreateArmyBad()
    {
        for(int i = rand.nextInt(50-30) + 30; i > 0; i++)
        {
            int random = rand.nextInt(25);
            
            if(random <= 18)
            {
                return new Human();
            }else if(random <= 24)
            {
                return new CyberDemon();
            }else if(random <= 25)
            {
                return new Balrog();
            }
        }
        return new Human();
    }
}
