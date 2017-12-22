package Fighting;

import Additional.Random;
import Monsters.Monster;

public class Magic {

    String name = Monster.getNameOfTheMonster();
    double spellDamage;
    double requiredMana;
    double mana = Monster.getMana();
    double manaMax = Monster.getManaMax();
    double health = Monster.getHealth();
    double maxHealth = Monster.getHealthMax();

    public double useFireBall(int lvl, double minMagicDamage, double maxMagicDamage){
        requiredMana = 20;
        spellDamage = lvl * Random.RInt(minMagicDamage, maxMagicDamage);

        if (requiredMana > mana){
            System.out.println(name + " ni mosz many na fajer bola");
            return 0;
        }
        else{
            System.out.println(name + " uzyl FireBall! i zadal Ci: " + spellDamage + " punktow obrazen!");
            Monster.setMana((mana-requiredMana), manaMax);
            return spellDamage;
        }
    }

    public double useIceSpike(int lvl, double minMagicDamage, double maxMagicDamage){
        requiredMana = 40;
        spellDamage = lvl * Random.RInt(minMagicDamage, maxMagicDamage);

        if (requiredMana > mana){
            System.out.println(name + " ni mosz many, skurwysynu, na ajs spajka!");
            return 0;
        }
        else{
            System.out.println(name + " uzyl IceSpike! i zadal Ci: " + spellDamage + " punktow obrazen!");
            Monster.setMana((mana-requiredMana), manaMax);
            return spellDamage;
        }
    }

    public void useHeal(int lvl, double minMagicDamage, double maxMagicDamage){
        requiredMana = 30;
        spellDamage = lvl * Random.RInt(minMagicDamage, maxMagicDamage);

        if (requiredMana > mana){
            System.out.println(name + " nie uleczysz dzis swej pizdy");
        }
        else{
            if (spellDamage >= maxHealth - health){
                spellDamage = maxHealth - health;
                System.out.println(name + " uzyl Heal! uleczyl sie o: " + spellDamage);
                Monster.setHealth(health + spellDamage, maxHealth);
                Monster.setMana(mana-requiredMana, manaMax);
                System.out.println("Heal byl wiekszy niz Twoje hp");

            }
            else{
                System.out.println(name + " uzyl Heal! uleczyl sie o: " + spellDamage);
                Monster.setHealth(health + spellDamage, maxHealth);
                Monster.setMana(mana-requiredMana, manaMax);
            }
        }
    }

    public void useStealHealth(int lvl, double minMagicDamage, double maxMagicDamage){
        requiredMana = 15;
        spellDamage = lvl * Random.RInt(minMagicDamage, maxMagicDamage);

        if (requiredMana > mana){
            System.out.println(name + " juz chciol zajebac Ci hapsy");
        }
        else{
            if (spellDamage >= maxHealth - health){
                spellDamage = maxHealth - health;
                System.out.println(name + " uleczyl sie za: " + spellDamage + " Twoich punktow zycia");
                Monster.setHealth(health + spellDamage, maxHealth);
                Monster.setMana(mana-requiredMana, manaMax);
                System.out.println("Heal byl wiekszy niz Twoje hp");
            }
            else{
                System.out.println(name + " uleczyl sie za: " + spellDamage + " Twoich punktow zycia");
                Monster.setHealth(health + spellDamage, maxHealth);
                Monster.setMana(mana-requiredMana, manaMax);
            }

        }

    }

    public double useReinforcedAttack(double minDmg, double maxDmg){
        double damage = Random.RInt(minDmg * 5, maxDmg * 2);
        return damage;
    }
}
