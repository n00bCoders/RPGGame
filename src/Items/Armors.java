package Items;

public class Armors extends Items {

    public double health;
    public double deffence;
    public double block;
    public double mana;
    public double strength;

    public int durablity;


    private static double health;
    private static double mana;
    private static double speedAttack;
    private static double deffence;
    private static double attack;
    private static double block;

    private static double agility;
    private static double intelligence;
    private static double vitality;
    private static double strength;
    private static double crit;
    int durablity;


    public Armors(int dimension_x, int dimension_y, String name, int id,
                   double health, double mana, double speedAttack,
                   double deffence, double attack, double money, double block, double agility, double intelligence,
                   double vitality, double strength, double crit, int durablity){
        super(name, dimension_x, dimension_y, id);

        this.health = health;
        this.healthMax = healthMax;
        this.mana = mana;
        this.manaMax = manaMax;
        this.speedAttack = speedAttack;
        this.deffence = deffence;
        this.attack = attack;
        this.block = block;
        this.agility = agility;
        this.intelligence = intelligence;
        this.vitality = vitality;
        this.strength = strength;
        this.crit = crit;
        this.durablity = durablity;

    }

}
