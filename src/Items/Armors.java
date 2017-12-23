package Items;

import Game.Postac;

public class Armors {

    int id;
    String name;
    double health;
    double deffence;
    double crit;

    public Armors(int id, String name, double health, double deffence) {
        this.id = id;
        this.name = name;
        this.health = health;
        Postac.setHealth(Postac.getHealth() + health, Postac.getHealthMax() + health);
        this.deffence = deffence;
        Postac.setDeffence(deffence);
    }

    public Armors(){

    }

    public static Armors[] armors = new Armors[] {
            new Armors(0, "Chujowa zbroja", 1000, 500),
            new Armors(1, "Gowniana zbroja", 2000, 1000)
    };

    public static void stats(int weaponID){
        System.out.println("Id: " + armors[weaponID].id);
        System.out.println("Nazwa: " + armors[weaponID].name);
        System.out.println("Zdrowie: " + armors[weaponID].health);
        System.out.println("Obrona: " + armors[weaponID].deffence);
        System.out.println();
    }
}
