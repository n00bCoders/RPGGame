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
    private double speedAttack;     //Znalezc sensowne zastosowanie
    private int lvl;        //Znalezc sensowne zastosowanie
    private static String nameOfTheMonster;
    private static double expMin;
    private static double expMax;
    private static double coinDropMin;
    private static double coinDropMax;
    private static double damageMin;
    private static double damageMax;
    private static double minMagicDmg;
    private static double maxMagicDmg;


    //Variables
    private static double health;
    private static double mana;       //Znalezc sensowne zastosowanie
    private int healthPotions;


    //Getters
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

    public static int getIndex(Monster i) {
        return arrayEnemy.indexOf(i);
    }

    public int getLvl() {
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
        return("Minimalny atak: " + getMinMagicDmg() + ", maksymalny atak: " + getMaxMagicDmg());
    }


    //Setters
    public void setHealthPotions(int amount) {
        this.healthPotions = amount;
    }

    public static void setDamage(int min, int max) {
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

    public static void set(int i) {
        current = arrayEnemy.get(i);
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
    public static void encounterNew() {
        current = arrayEnemy.get(Random.RInt(0, arrayEnemy.size()));
        current.health = current.healthMax;
        current.healthPotions = Random.RInt(HEALTH_POTIONS_MIN, HEALTH_POTIONS_MAX);
    }

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
        System.out.println(nameOfTheMonster + " zadal Ci: " + damage + " punktow obrazen");
        /* Dodac przyjmowanie obrazen - coś w stylu playerHealth.takeDamage(damage) */
    }

    private static void die() {
        /* złapać pomysł do napisana */

        //Rewards
        double coin = Random.RInt(coinDropMin, coinDropMax);
        double exp = Random.RInt(expMin, expMax);

        System.out.println("Zajebałeś stworka, dostajesz: " + coin + " monet i " + exp + " punktów doświadczenia!");

        //Dodać monety i expa do bohatera

        //Walka z kolejnym
        //encounterNew(); -> nie wiem czemu nie działa :/
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

    public void magicalAttack(int mana){
        Magic Magic = new Magic();
        double typeOfAttack;
        double damage;

        if (mana >= 20 && mana < 30){
            damage = Magic.useFireBall(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
            dealDamage(damage);
            System.out.println("Zadal Ci obrazenia magiczne w wysokosci: " + damage);
            System.out.println("Mana miedzy 20 a 30");
        }
        else if (mana >= 30 && mana < 40){
            typeOfAttack = Random.RInt(1,2);

            System.out.println("Mana miedzy 30 a 40, a randomowa liczba to: " + typeOfAttack);
            if (typeOfAttack == 1){
                damage = Magic.useFireBall(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
                dealDamage(damage);
            }
            else if (typeOfAttack == 2){
                Magic.useHeal(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
            }
        }
        else if(mana >=40){
            typeOfAttack = Random.RInt(1,3);

            System.out.println("Mana wieksza niz 40");
            if (typeOfAttack == 1){
                damage = Magic.useFireBall(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
                dealDamage(damage);
            }
            else if (typeOfAttack == 2){
                Magic.useHeal(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
            }
            else{
                damage = Magic.useIceSpike(getLvl(), getMinMagicDmg(), getMaxMagicDmg());
                dealDamage(damage);
            }
        }
    }

    public void physicalAttack(int damageMin, int damageMax){
        double damage = Random.RInt(damageMin, damageMax);
        dealDamage(damage);
    }

}
