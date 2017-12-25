package Monsters;

import Additional.Random;
import Fighting.Magic;
import Game.Player;
import Monsters.Monster;

public class Goblin extends Monster {

    public Goblin(int health, int healthMax, int mana, int manaMax, double speedAttack, int lvl, String nameOfTheMonster, int expMin, int expMax, int coinDropMin, int coinDropMax, int damageMin, int damageMax, int minMagicDmg, int maxMagicDmg, boolean isDead) {
        super(health, healthMax, mana, manaMax, speedAttack, lvl, nameOfTheMonster, expMin, expMax, coinDropMin, coinDropMax, damageMin, damageMax, minMagicDmg, maxMagicDmg, isDead);
    }

    public static void fight(){
        double randomAttack = Random.RInt(1,2);

        if (randomAttack == 1){
            if (getMana() >= 15){
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

    public static void dealDamage(){
        physicAttack(getDamageMin(), getDamageMax()); //Normalny atak
    }

    public static void dealMagicDamage(){
        Magic.useStealHealth();
    }
}
