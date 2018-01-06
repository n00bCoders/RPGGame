package Items;

public class Weapons extends Items {

    int improveAttack;
    int improveAttackSpeed;
    int improveHP;
    double improveCritRating;

    int requireStrength;

    int durablity;



    public Weapons(int dimension_x, int dimension_y, String name, int id,
                   int improveAttack, int improveAttackSpeed,
                   double improveCritRating, int improveHP,
                   int requireStrength, int durablity){
        super(name, dimension_x, dimension_y, id);

        this.improveAttack = improveAttack;
        this.improveAttackSpeed = improveAttackSpeed;
        this.improveHP = improveHP;
        this.improveCritRating = improveCritRating;
        this.requireStrength = requireStrength;
        this.durablity = durablity;

    }

}

