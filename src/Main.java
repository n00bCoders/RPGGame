import Items.Armors;
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

}
