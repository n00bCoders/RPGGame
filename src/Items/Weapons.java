package Items;

public class Weapons extends Items {

    int attack;
    int speedAttack;
    int health;
    double improveCritRating;

    int strength;

    int durablity;



    public Weapons(int dimension_x, int dimension_y, String name, int id,
                   int attack, int speedAttack,
                   double improveCritRating, int health,
                   int strength, int durablity){
        super(name, dimension_x, dimension_y, id);

        this.attack = attack;
        this.speedAttack = speedAttack;
        this.health = health;
        this.improveCritRating = improveCritRating;
        this.strength = strength;
        this.durablity = durablity;

    }

}

