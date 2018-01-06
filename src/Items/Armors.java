package Items;

public class Armors extends Items {

    double improveHP;
    double improveDeffence;
    double improveBlock;
    double improveMana;

    double requireStrength;

    int durablity;

    public Armors(int dimension_x, int dimension_y, String name, int id,
                   int improveHP, int improveDeffence,
                   double improveBlock, int improveMana,
                   int requireStrength, int durablity){
        super(name, dimension_x, dimension_y, id);

        this.improveHP = improveHP;
        this.improveDeffence = improveDeffence;
        this.improveBlock = improveBlock;
        this.improveMana = improveMana;
        this.requireStrength = requireStrength;
        this.durablity = durablity;

    }

}
