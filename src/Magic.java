public class Magic {

    String name = Monster.getNameOfTheMonster();
    int spellDamage;
    int requiredMana;
    int mana = Monster.getMana();
    int manaMax = Monster.getManaMax();
    int health = Monster.getHealth();
    int maxHealth = Monster.getHealthMax();

    public int useFireBall(int lvl, int minMagicDamage, int maxMagicDamage){
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

    public int useIceSpike(int lvl, int minMagicDamage, int maxMagicDamage){
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

    public void useHeal(int lvl, int minMagicDamage, int maxMagicDamage){
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

    public void useStealHealth(int lvl, int minMagicDamage, int maxMagicDamage){
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

    public int useReinforcedAttack(int minDmg, int maxDmg){
        int damage = Random.RInt(minDmg * 5, maxDmg * 2);
        return damage;
    }
}
