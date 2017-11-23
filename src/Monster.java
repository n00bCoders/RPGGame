import java.util.ArrayList;


public class Monster {


    //Constants
    private static final int HEALTH_POTIONS_MAX = 2;
    private static final int HEALTH_POTIONS_MIN = 0;


    //Enemy list
    public static final ArrayList<Monster> arrayEnemy = new ArrayList<>();


    //Static variables
    private static Monster current;

    //Properties (Constant)
    private static double healthMax;
    private static double manaMax;
    private static double speedAttack;     //Znalezc sensowne zastosowanie
    private static int lvl;        //Znalezc sensowne zastosowanie
    private static String nameOfTheMonster;
    private static double expMin;
    private static double expMax;
    private static double coinDropMin;
    private static double coinDropMax;
    private static double damageMin;
    private static double damageMax;
    private static double minMagicDmg;
    private static double maxMagicDmg;
    private static double deffence;
    private static double resistance;


    //Variables
    private static double health;
    private static double mana;       //Znalezc sensowne zastosowanie
    private int healthPotions;


    //Getters
    public static double getDeffence(){
        return deffence;
    }

    public static double getResistance(){
        return resistance;
    }

    public int getHealtPotion(int amount) {
        return this.healthPotions;
    }

    public static double getHealth() {
        return health;
    }

    public static double getHealthMax() {
        return healthMax;
    }

    public String getHealthStatusBar() {
        return (health + "/" + healthMax);
    }

    public static double getMana() {
        return mana;
    }

    public static double getManaMax() {
        return manaMax;
    }

    public String getManaStatusBar() {
        return (mana + "/" + manaMax);
    }

    public static String getNameOfTheMonster() {
        return nameOfTheMonster;
    }

    public static Monster get() {
        return current;
    }

    public static int getLvl() {
        //return lvl *= heroLvl;
        return lvl;
    }

    public static double getMinMagicDmg() {
        return minMagicDmg;
    }

    public static double getMaxMagicDmg() {
        return maxMagicDmg;
    }

    public static double getDamageMin() {
        return damageMin;
    }

    public static double getDamageMax() {
        return damageMax;
    }

    public String getDamageStatusBar(){
        return("Minimalny atak: " + getDamageMin() + ", maksymalny atak: " + getDamageMax());
    }


    //Setters
    public void setHealthPotions(int amount) {
        this.healthPotions = amount;
    }

    public static void setDamage(double min, double max) {
        damageMin = min;
        damageMax = max;
    }

    public void setCoinDrop(int min, int max) {
        this.coinDropMin = min;
        this.coinDropMax = max;
    }

    public static void setHealth(double current, double max) {
        health = current;
        healthMax = max;
    }

    public static void setMana(double current, double max) {
        mana = current;
        manaMax = max;
    }


    //Monster constructor
    public Monster(double health, double healthMax, double mana, double manaMax, double speedAttack, int lvl, String nameOfTheMonster, double expMin, double expMax, double coinDropMin, double coinDropMax, double damageMin, double damageMax, double minMagicDmg, double maxMagicDmg) {
        this.health = health;
        this.healthMax = healthMax;
        this.mana = mana;
        this.manaMax = manaMax;
        this.speedAttack = speedAttack;
        this.lvl = lvl;
        this.nameOfTheMonster = nameOfTheMonster;
        this.expMin = expMin;
        this.expMax = expMax;
        this.coinDropMin = coinDropMin;
        this.coinDropMax = coinDropMax;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.minMagicDmg = minMagicDmg;
        this.maxMagicDmg = maxMagicDmg;
    }

    //Other methods

    public static boolean takeDamage(double damage) {
        health = health - damage;
        System.out.println(getNameOfTheMonster() + " przyjal obrazenia w wysokosci: " + damage + ", ma teraz: " + health + " punktow zycia");
        if (health <= 0) {
            die();
            return true;
        }
        return false;
    }

    public static void dealDamage(double damage) {
        damage = Random.RInt(getDamageMin(), getDamageMax());
    }

    private static void die() {
        //Rewards
        double coin = Random.RInt(coinDropMin, coinDropMax);
        double exp = Random.RInt(expMin, expMax);

        System.out.println("Zajebałeś stworka, dostajesz: " + coin + " monet i " + exp + " punktów doświadczenia!");
        Postac.setMoney(coin);
        Postac.setExp(exp);
    }

    public boolean useHealthPotions() {
        if (this.healthPotions <= 0) {
            return false;
        } else {
            this.healthPotions--;
            setHealth(this.health + 20, getHealthMax());
            return true;
        }
    }

    public static void magicAttack(double mana){
        Magic Magic = new Magic();
        double typeOfAttack;
        double damage;

        if (mana >= 20 && mana < 30){
            damage = Magic.useFireBall(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
            Postac.takeDamage(damage);
            System.out.println("Zadales obrazenia magiczne w wysokosci: " + damage);
        }
        else if (mana >= 30 && mana < 40){
            typeOfAttack = Random.RInt(1,2);

            if (typeOfAttack == 1){
                damage = Magic.useFireBall(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
                Postac.takeDamage(damage);
            }
            else if (typeOfAttack == 2 && health < healthMax){
                Magic.useHeal(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
            }
        }
        else if(mana >=40){
            typeOfAttack = Random.RInt(1,3);

            if (typeOfAttack == 1){
                damage = Magic.useFireBall(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
                Postac.takeDamage(damage);
            }
            else if (typeOfAttack == 2 && health < healthMax){
                Magic.useHeal(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
            }
            else{
                damage = Magic.useIceSpike(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
                Postac.takeDamage(damage);
            }
        }
    }

    public static void physicAttack(double damageMin, double damageMax){
        double damage = Random.RInt(damageMin, damageMax);
        Postac.takeDamage(damage);
    }

}
