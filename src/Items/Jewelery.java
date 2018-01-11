package Items;

public class Jewelery extends Items{

    int health;
    int mana;
    int deffence;
    int attack;

    int agility;
    int strength;
    int intelligence;
    int vitality;
    int crit;

    public Jewelery(int dimension_x, int dimension_y, String name, int id, int health, int mana, int deffence,
                    int attack, int agility, int strength, int intelligence, int vitality, int crit){
        super(name, dimension_x, dimension_y, id);

        this.health = health;
        this.mana = mana;
        this.deffence = deffence;
        this.attack = attack;

        this.agility = agility;
        this.strength = strength;
        this.intelligence = intelligence;
        this.vitality = vitality;
        this.crit = crit;
    }

}
