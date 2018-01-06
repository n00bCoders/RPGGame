package Items;

public class Shields extends Items {


    int improveDefense;
    int improveArmor;
    int improveHP;
    double improveMana;

    int requireStrength;
    boolean requireDualWielding;

    int durablity;



    public Shields(int dimension_x, int dimension_y, String name, int id,
                   int improveDefense, int improveArmor,
                   int improveHP, double improveMana,
                   int requireStrength, boolean requireDualWielding,
                   int durablity){
        super(name, dimension_x, dimension_y, id);


        this.improveDefense = improveDefense;
        this.improveArmor = improveArmor;
        this.improveHP = improveHP;
        this.improveMana = improveMana;
        this.requireStrength = requireStrength;
        this.requireDualWielding = requireDualWielding;
        this.durablity = durablity;


    }

}
