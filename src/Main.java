import Items.Armors;
import Items.ArmorsList;
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

        String name = ArmorsList.ArmorsArray[armorId].name;
        int id = ArmorsList.ArmorsArray[armorId].id;
        double improveHealth = ArmorsList.ArmorsArray[armorId].improveHealth;
        double improveMana = ArmorsList.ArmorsArray[armorId].improveMana;
        double improveSpeedAttack = ArmorsList.ArmorsArray[armorId].improveSpeedAttack;
        double improveDeffence = ArmorsList.ArmorsArray[armorId].improveDeffence;
        double improveAttack = ArmorsList.ArmorsArray[armorId].improveAttack;
        double improveBlock = ArmorsList.ArmorsArray[armorId].improveBlock;
        double improveAgility = ArmorsList.ArmorsArray[armorId].improveAgility;
        double improveIntelligence = ArmorsList.ArmorsArray[armorId].improveIntelligence;
        double improveVitallity = ArmorsList.ArmorsArray[armorId].improveVitality;
        double improveStrength = ArmorsList.ArmorsArray[armorId].improveStrength;
        double improveCrit = ArmorsList.ArmorsArray[armorId].improveCrit;

    }
}
