package Items;

public class Jewelery extends Items{

    int improveHP;
    int improveMana;
    int improveDeffence;
    int improveAttack;

    int improveAgility;
    int improveStrength;
    int improveIntelligence;
    int improveVitality;
    int improveCrit;

    public Jewelery(int dimension_x, int dimension_y, String name, int id, int improveHP, int improveMana, int improveDeffence,
                    int improveAttack, int improveAgility, int improveStrength, int improveIntelligence, int improveVitality, int improveCrit){
        super(name, dimension_x, dimension_y, id);

        this.improveHP = improveHP;
        this.improveMana = improveMana;
        this.improveDeffence = improveDeffence;
        this.improveAttack = improveAttack;

        this.improveAgility = improveAgility;
        this.improveStrength = improveStrength;
        this.improveIntelligence = improveIntelligence;
        this.improveVitality = improveVitality;
        this.improveCrit = improveCrit;
    }



}
