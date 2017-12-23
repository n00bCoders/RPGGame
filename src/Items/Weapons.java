package Items;

import Game.Postac;

public class Weapons{

    int id;
    String name;
    double atk;
    double str;
    double crit;

    public Weapons(int id, String name, double atk, double str, double crit) {
        this.id = id;
        this.name = name;
        this.atk = atk;
        Postac.setAttack(atk);
        this.str = str;
        Postac.setStrength(str);
        this.crit = crit;
        Postac.setCrit(crit);
    }

    public Weapons(){

    }

    public static Weapons[] weaponzs = new Weapons[] {
            new Weapons(0, "chujogrom", 5, 4, 3),
            new Weapons(1, "dupochuj", 9, 5, 9)
    };

    public static void stats(int weaponID){
        System.out.println("Id: " + weaponzs[weaponID].id);
        System.out.println("Nazwa: " + weaponzs[weaponID].name);
        System.out.println("Atak: " + weaponzs[weaponID].atk);
        System.out.println("Sila: " + weaponzs[weaponID].str);
        System.out.println("Krytyk: " + weaponzs[weaponID].crit);
        System.out.println();
    }

}

