package Items;

public class Armors extends Items {

    double health;
    double deffence;
    double block;
    double mana;
    double strength;

    int durablity;

    public Armors(int dimension_x, int dimension_y, String name, int id,
                   int health, int deffence,
                   double block, int mana,
                   int strength, int durablity){
        super(name, dimension_x, dimension_y, id);

        this.health = health;
        this.deffence = deffence;
        this.block = block;
        this.mana = mana;
        this.strength = strength;
        this.durablity = durablity;

    }

}
