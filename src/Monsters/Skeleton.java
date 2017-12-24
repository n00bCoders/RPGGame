package Monsters;

import Additional.Random;
import Fighting.Magic;

public class Skeleton extends Monster {

    public Skeleton(int health, int healthMax, int mana, int manaMax, double speedAttack, int lvl, String nameOfTheMonster, int expMin, int expMax, int coinDropMin, int coinDropMax, int damageMin, int damageMax, int minMagicDmg, int maxMagicDmg) {
        super(health - 40, healthMax - 40, mana, manaMax, speedAttack, lvl, nameOfTheMonster, expMin, expMax, coinDropMin, coinDropMax, damageMin, damageMax, minMagicDmg, maxMagicDmg);
    }

    public static void fight() {
        double randomAttack = Random.RInt(1, 2);

        if (randomAttack == 1) {
            if (getMana() >= 15) {
                dealMagicDamage();
            } else {
                dealDamage();
            }
        } else {
            dealDamage();
        }
    }

    public static void dealDamage() {
        physicAttack(getDamageMin(), getDamageMax()); //Normalny atak
    }

    public static void dealMagicDamage() {
        Magic magic = new Magic();

        magic.useFireBall(getLvl(), getMinMagicDmg() * 1.5, getMaxMagicDmg() * 1.5);
    }

}