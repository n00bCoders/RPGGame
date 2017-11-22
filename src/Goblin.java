public class Goblin extends Monster {

    public Goblin(int health, int healthMax, int mana, int manaMax, double speedAttack, int lvl, String nameOfTheMonster, int expMin, int expMax, int coinDropMin, int coinDropMax, int damageMin, int damageMax, int minMagicDmg, int maxMagicDmg) {
        super(health, healthMax, mana, manaMax, speedAttack, lvl, nameOfTheMonster, expMin, expMax, coinDropMin, coinDropMax, damageMin, damageMax, minMagicDmg, maxMagicDmg);
    }

    public static void dealDamage(){
        Magic magic = new Magic();

        //magic.useStealHealth(getLvl(),getMinMagicDmg(), getMaxMagicDmg()); //Kradziez zycia
        physicAttack(getDamageMin(), getDamageMax()); //Normalny atak
        //dealDamage(magic.useReinforcedAttack(getDamageMin(), getDamageMax())); //Wzmocniony atak
    }
}
