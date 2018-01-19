package Monsters;

import Player.Player;
import Additional.Random;


public class Monster {


    //Constants
    private static final int HEALTH_POTIONS_MAX = 2;
    private static final int HEALTH_POTIONS_MIN = 0;


    //Static variables
    private static Monster current;

    //Properties (Constant)
    private static double healthMax;
    private static double manaMax;
    private static double speedAttack;
    private static int lvl;
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
    private static double mana;
    private static int healthPotions;


    //Getters
    public static double getDeffence(){
        return deffence;
    }

    public static double getResistance(){
        return resistance;
    }

    public static int getHealtPotion(int amount) {
        return healthPotions;
    }

    public static double getHealth() {
        return health;
    }

    public static double getHealthMax() {
        return healthMax;
    }

    public static String getHealthStatusBar() {
        return (health + "/" + healthMax);
    }

    public static double getMana() {
        return mana;
    }

    public static double getManaMax() {
        return manaMax;
    }

    public static String getManaStatusBar() {
        return (mana + "/" + manaMax);
    }

    public static String getNameOfTheMonster() {
        return nameOfTheMonster;
    }


    public static int getLvl() {
        return lvl *= Player.getLvl();
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

    public static String getDamageStatusBar(){
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
        System.out.println(getNameOfTheMonster() + " ma teraz: " + getHealthStatusBar() + " punktow zycia");
        if (health <= 0) {
            die();
            return true;
        }
        return false;
    }

    private static void die() {
        //Rewards
        double coin = Random.RInt(coinDropMin, coinDropMax);
        double exp = Random.RInt(expMin, expMax);

        System.out.println("Zajebałeś stworka, dostajesz: " + coin + " monet i " + exp + " punktów doświadczenia!");
        Player.setMoney(coin);
        Player.setExp(exp);
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

    public static void magicAttack(){
        MonsterMagic.useMagic();
    }

    public static void physicAttack(double damageMin, double damageMax){
        double damage = Random.RInt(damageMin, damageMax);
        System.out.println(getNameOfTheMonster() + " zadał Ci: " + damage + " punktów obrażeń");
        Player.takeDamage(damage);
    }

}
