package Monsters;

import Additional.Random;

public class Zombie extends Monster{

    public Zombie(int health, int healthMax, int mana, int manaMax, double speedAttack, int lvl, String nameOfTheMonster, int expMin, int expMax, int coinDropMin, int coinDropMax, int damageMin, int damageMax, int minMagicDmg, int maxMagicDmg) {
        super(health + 60, healthMax + 60, mana, manaMax, speedAttack * 0.5, lvl, nameOfTheMonster, expMin * 1.05, expMax * 1.05, coinDropMin, coinDropMax, damageMin * 1.2, damageMax * 1.2, minMagicDmg * 0.4, maxMagicDmg * 0.4);
    }

    public static void fight() {
        double randomAttack = Random.RInt(1, 2);

        if (randomAttack == 1) {
            if (getMana() >= 20) {
                dealMagicDamage();
            }
            else {
                dealDamage();
            }
        }
        else {
            dealDamage();
        }
    }

    public static void dealDamage() {
        physicAttack(getDamageMin(), getDamageMax());
    }

    public static void dealMagicDamage() {
        MonsterMagic.useReinforcedAttack(Monster.getDamageMin(), Monster.getDamageMax());
    }


}
