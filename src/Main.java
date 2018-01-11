import Items.Armors;
import Items.JeweleryList;
import Items.Weapons;
import Items.WeaponsList;

import static Items.WeaponsList.SwordsArray;

public class Main {

    public static void main(String args[]) {



        /*
        TO DO:
        1. Zrobić ekwipunek.
        2. Zrobić lvlowanie postaci.
        3. Program się sypie, jeśli ziomek wybierze klasę z poza listy.
        4. Łotrowi nie daje bonusowego crita.
        5. Zrobić jakiś warunek w booleanie, żeby sprawdzał czy zabiliśmy już tego przeciwnika. np. idę na wschód, zabiję Zombie
            i chcę żeby było coś w stylu isZombieDead = true;
         */
    }

    public static void getWeapon(int weaponId){

        String name = WeaponsList.SwordsArray[weaponId].name;
        int id = WeaponsList.SwordsArray[weaponId].id;
        double improveAttack = WeaponsList.SwordsArray[weaponId].attack;
        double improveAttackSpeed = WeaponsList.SwordsArray[weaponId].speedAttack;

    }

    public static void getArmor(int armorId){

        String name = WeaponsList.SwordsArray[armorId].name;
        int id = WeaponsList.SwordsArray[armorId].id;
        double improveAttack = WeaponsList.SwordsArray[armorId].improveAttack;
        double improveAttackSpeed = WeaponsList.SwordsArray[armorId].improveAttackSpeed;

    }

    public static void getJewelery(int jeweleryId) {
        String name = JeweleryList.JeweleryArray[jeweleryId].name;
        int id = JeweleryList.JeweleryArray[jeweleryId].id;
        double improveHealth = JeweleryList.JeweleryArray[jeweleryId].improveHealth;
        double improveMana = JeweleryList.JeweleryArray[jeweleryId].improveMana;;
        double improveSpeedAttack = JeweleryList.JeweleryArray[jeweleryId].improveSpeedAttack;;
        double improveDeffence = JeweleryList.JeweleryArray[jeweleryId].improveDeffence;
        double improveAttack = JeweleryList.JeweleryArray[jeweleryId].improveAttack;
        double improveBlock = JeweleryList.JeweleryArray[jeweleryId].improveBlock;
        double improveAgility = JeweleryList.JeweleryArray[jeweleryId].improveAgility;
        double improveIntelligence = JeweleryList.JeweleryArray[jeweleryId].improveIntelligence;
        double improveVitality = JeweleryList.JeweleryArray[jeweleryId].improveVitality;
        double improveStrength = JeweleryList.JeweleryArray[jeweleryId].improveStrength;
        double improveCrit = JeweleryList.JeweleryArray[jeweleryId].improveCrit;
        double durablity = JeweleryList.JeweleryArray[jeweleryId].durablity;



    }
}
