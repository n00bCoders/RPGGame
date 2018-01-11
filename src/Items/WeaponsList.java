package Items;

import java.io.Console;
import java.util.Arrays;

public class WeaponsList {

    public static Weapons Weapon0 = new Weapons(1, 1, "Raw steel", 1, 3,
            0, 0.3, 0, 5, 1, 1,
            1, 1, 1, 1,1, 50);

    public static Weapons Weapon1 = new Weapons(1, 2, "Rust Sword", 2, 5,
            2, 0.6, 2, 2, 1, 1,
            1, 1, 1, 1,1, 50);

    public static Weapons Weapon2 = new Weapons(1, 3, "Steel Sword", 3, 3,
            0, 0.3, 0, 0, 2, 1,
            1, 1, 1, 5,1, 50);

    public static Weapons Weapon3 = new Weapons(1, 4, "Double Axe", 4, 3,
            0, 0.3, 0, 0, 3, 5,
            8 ,12, 4, 5,1, 50);

    public static Weapons Weapon4 = new Weapons(1, 5, "Staff of Fire", 5, 3,
            0, 0.3, 0, 0, 2, 5,
            6, 5, 4, 2,1, 50);

    public static Weapons Weapon5 = new Weapons(1, 6, "Metal Claws", 6, 3,
            0, 0.3, 0, 0, 4, 8,
            4, 1, 1, 5,1, 50);

    public static Weapons Weapon6 = new Weapons(1, 7, "Staff of Death", 7, 3,
            0, 0.3, 0, 0, 2, 8,
            12, 8, 2, 4,1, 50);

    public static Weapons Weapon7 = new Weapons(1, 8, "Sword of Sorrows", 8, 3,
            0, 0.3, 0, 0, 11, 1,
            4, 5, 1, 4,1, 50);

    public static Weapons Weapon8 = new Weapons(1, 9, "Kupa na kiju", 9, 3,
            0, 0.3, 0, 0, 45, 1,
            15, 1, 4, 5,1, 50);
// Tablica obiektów.




    public static Weapons SwordsArray[] = {Weapon1, Weapon2, Weapon3, Weapon4, Weapon5, Weapon6, Weapon7, Weapon8};


    // Metoda testowa

    public static void ShowAllWeaponParams(int id) {

        System.out.println("Basic info");
        System.out.println("X = " + SwordsArray[id].dimension_x);
        System.out.println("Y = " + SwordsArray[id].dimension_y);
        System.out.println("ID = " + SwordsArray[id].id);
        System.out.println("Name = " + SwordsArray[id].name);

        System.out.println(" ");

        System.out.println("Stats improve");
        System.out.println("Attack improve= " + SwordsArray[id].improveAttack);
        System.out.println("Attack Speed Improve = " + SwordsArray[id].improveSpeedAttack);
        System.out.println("Crit Rating improve =" + SwordsArray[id].improveCrit);
        System.out.println("HP improve = " + SwordsArray[id].improveHealth);

        System.out.println("");

        System.out.println("Requires");
        System.out.println("Strenght Require = " + SwordsArray[id].requireStrength);

        System.out.println("");

        System.out.println("Others");
        System.out.println("Durability = " + SwordsArray[id].durablity);

    }




  public static void FindInArray(){




    }

}