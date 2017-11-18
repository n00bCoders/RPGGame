public class Skeleton extends Monster {

    public Skeleton(int health, int healthMax, int mana, int manaMax, double speedAttack, int lvl, String nameOfTheMonster, int expMin, int expMax, int coinDropMin, int coinDropMax, int damageMin, int damageMax, int minMagicDmg, int maxMagicDmg) {
        super(health - 40, healthMax - 40, mana, manaMax, speedAttack, lvl, nameOfTheMonster, expMin, expMax, coinDropMin, coinDropMax, damageMin, damageMax, minMagicDmg, maxMagicDmg);
    }

    public void dealDamage(){

        double typeOfAttack = Random.RInt(1,2);

        if (getMana() >= 20) {
            if (typeOfAttack == 1){
                physicalAttack(getDamageMin(), getDamageMax());
            }
            else{
                magicalAttack(getMana());
            }
        }
        else{
            physicalAttack(getDamageMin(), getDamageMax());
        }
    }
}