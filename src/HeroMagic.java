public class HeroMagic {

    double requiredMana;
    double spellDamage;
    double mana;
    double manaMax;
    double health;
    double healthMax;

    public double useFireBall(int lvl, double intelligence){
        requiredMana = 20;
        spellDamage = lvl * intelligence;

        if (requiredMana > mana){
            System.out.println("Ni mosz many na fajer bola");
            return 0;
        }
        else{
            System.out.println("Uzyles FireBalla! i zadales: " + spellDamage + " punktow obrazen!");
            Monster.setMana((mana-requiredMana), manaMax);
            return spellDamage;
        }
    }

    public double useIceSpike(int lvl, double intelligence){
        requiredMana = 40;
        spellDamage = lvl * intelligence;

        if (requiredMana > mana){
            System.out.println("Ni mosz many, skurwysynu, na ajs spajka!");
            return 0;
        }
        else{
            System.out.println("Uzyles IceSpike! i zadales: " + spellDamage + " punktow obrazen!");
            Monster.setMana((mana-requiredMana), manaMax);
            return spellDamage;
        }
    }

    public void useHeal(int lvl, double intelligence){
        requiredMana = 30;
        spellDamage = lvl * intelligence;

        if (requiredMana > mana){
            System.out.println("Nie uleczysz dzis swej pizdy");
        }
        else{
            if (spellDamage >= healthMax - health){
                spellDamage = healthMax - health;
                System.out.println("Uzyles Heala! uleczyles sie o: " + spellDamage);
                Monster.setHealth(health + spellDamage, healthMax);
                Monster.setMana(mana-requiredMana, manaMax);
                System.out.println("Heal byl wiekszy niz Twoje hp");

            }
            else{
                System.out.println("Uzyles Heala! uleczyles sie o: " + spellDamage);
                Monster.setHealth(health + spellDamage, healthMax);
                Monster.setMana(mana-requiredMana, manaMax);
            }
        }
    }

    public void useStealHealth(int lvl, double intelligence){
        requiredMana = 15;
        spellDamage = lvl * intelligence;

        if (requiredMana > mana){
            System.out.println("Juz chcioles zajebac hapsy");
        }
        else{
            if (spellDamage >= healthMax - health){
                spellDamage = healthMax - health;
                System.out.println("Uleczyles sie za: " + spellDamage + " jego punktow zycia");
                Monster.setHealth(health + spellDamage, healthMax);
                Monster.setMana(mana-requiredMana, manaMax);
                System.out.println("Heal byl wiekszy niz Twoje hp");
            }
            else{
                System.out.println("Uleczyles sie za: " + spellDamage + " Twoich punktow zycia");
                Monster.setHealth(health + spellDamage, healthMax);
                Monster.setMana(mana-requiredMana, manaMax);
            }

        }

    }

    public double useReinforcedAttack(int minDmg, int maxDmg){
        double damage = Random.RInt(minDmg * 5, maxDmg * 2);
        return damage;
    }

}
