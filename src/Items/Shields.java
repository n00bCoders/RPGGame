package Items;

public class Shields extends Items {

    int deffence;
    int improveArmor;
    int health;
    double mana;

    int strength;
    boolean requireDualWielding;

    int durablity;



    public Shields(int dimension_x, int dimension_y, String name, int id,
                   int deffence, int improveArmor,
                   int health, double mana,
                   int strength, boolean requireDualWielding,
                   int durablity){
        super(name, dimension_x, dimension_y, id);


        this.deffence = deffence;
        this.improveArmor = improveArmor;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.requireDualWielding = requireDualWielding;
        this.durablity = durablity;


    }

}
