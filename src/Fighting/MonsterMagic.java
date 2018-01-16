package Fighting;

import Additional.Random;
import Game.Player;
import Monsters.Monster;

public class MonsterMagic {

    public static void useFireBall()    {
        int requiredMana = 20;
        double spellDamage = Monster.getLvl() * Random.RInt(Monster.getMinMagicDmg(), Monster.getMaxMagicDmg());

        System.out.println(Monster.getNameOfTheMonster() + " uzyl FireBall! i zadal Ci: " + spellDamage + " punktow obrazen!");
        Monster.setMana((Monster.getMana() - requiredMana), Monster.getManaMax());

        Player.takeDamage(spellDamage);
    }

    public static void useIceSpike() {
        int requiredMana = 40;
        double spellDamage = Monster.getLvl() * Random.RInt(Monster.getMinMagicDmg(), Monster.getMaxMagicDmg());

        System.out.println(Monster.getNameOfTheMonster() + " uzyl IceSpike! i zadal Ci: " + spellDamage + " punktow obrazen!");
        Monster.setMana((Monster.getMana() - requiredMana), Monster.getManaMax());

        Player.takeDamage(spellDamage);
    }

    public static void useHeal() {
        int requiredMana = 30;
        double spellDamage = Monster.getLvl() * Random.RInt(Monster.getMinMagicDmg(), Monster.getMaxMagicDmg());

        if (requiredMana > Monster.getMana()) {
            System.out.println(Monster.getNameOfTheMonster() + " nie uleczysz dzis swej pizdy");
        } else {
            if (spellDamage >= Monster.getHealthMax() - Monster.getHealth()) {
                spellDamage = Monster.getHealthMax() - Monster.getHealth();
                System.out.println(Monster.getNameOfTheMonster() + " uzyl Heal! uleczyl sie o: " + spellDamage);
                Monster.setHealth(Monster.getHealth() + spellDamage, Monster.getHealthMax());
                Monster.setMana(Monster.getMana() - requiredMana, Monster.getManaMax());
                System.out.println("Heal byl wiekszy niz Twoje hp");

            } else {
                System.out.println(Monster.getNameOfTheMonster() + " uzyl Heal! uleczyl sie o: " + spellDamage);
                Monster.setHealth(Monster.getHealth() + spellDamage, Monster.getHealthMax());
                Monster.setMana(Monster.getMana() - requiredMana, Monster.getManaMax());
            }
        }
    }

    public static void useStealHealth() {
        int requiredMana = 15;
        double spellDamage = Monster.getLvl() * Random.RInt(Monster.getMinMagicDmg(), Monster.getMaxMagicDmg());

        if (Monster.getNameOfTheMonster().equals("Goblin"))
            spellDamage *= 1.5;

        if (spellDamage >= Monster.getHealthMax() - Monster.getHealth()) {
            spellDamage = Monster.getHealthMax() - Monster.getHealth();
            System.out.println(Monster.getNameOfTheMonster() + " użył kradzieży życia! i zabrał Ci: " + spellDamage + " punktow zycia");
            Monster.setHealth(Monster.getHealth() + spellDamage, Monster.getHealthMax());
            Monster.setMana(Monster.getMana() - requiredMana, Monster.getManaMax());
            Player.setHealth(Player.getHealth() - spellDamage, Player.getHealthMax());
        }
        else {
            System.out.println(Monster.getNameOfTheMonster() + " użył kradzieży życia! i zabrał Ci: " + spellDamage + " punktow zycia");
            Monster.setHealth(Monster.getHealth() + spellDamage, Monster.getHealthMax());
            Monster.setMana(Monster.getMana() - requiredMana, Monster.getManaMax());
            Player.setHealth(Player.getHealth() - spellDamage, Player.getHealthMax());
        }

    }

    public static void useReinforcedAttack(double minDmg, double maxDmg) {
        int requiredMana = 20;
        Monster.setMana(Monster.getMana() - requiredMana, Monster.getManaMax());

        double damage = Random.RInt(minDmg * 2, maxDmg * 5);
        if (Monster.getNameOfTheMonster().equals("Zombie"))
            damage *= 2;

        System.out.println(Monster.getNameOfTheMonster() + " użył wzmocnionego ataku i zadał Ci: " + damage + " punktów obrażeń!");
        Player.takeDamage(damage);
    }

    public static void useMagic() {
        double typeOfAttack;

        if (Monster.getMana() >= 20 && Monster.getMana() < 30) {
            useFireBall();
        }
        else if (Monster.getMana() >= 30 && Monster.getMana() < 40) {
            typeOfAttack = Random.RInt(1, 2);

            if (typeOfAttack == 1) {
                useFireBall();
            } else if (typeOfAttack == 2 && Monster.getHealth() < Monster.getHealthMax()) {
                useHeal();
            }

        }
        else if (Monster.getMana() >= 40) {
            typeOfAttack = Random.RInt(1, 3);

            if (typeOfAttack == 1) {
                useFireBall();
            } else if (typeOfAttack == 2 && Monster.getHealth() < Monster.getHealthMax()) {
                useHeal();
            } else {
                useIceSpike();
            }
        }

    }
}
