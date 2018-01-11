import Items.Armors;
import Items.Weapons;
import Items.WeaponsList;

public class Main {
    public static void main(String args[]) {

        //Wypisywanie statystyk z Weapons
        System.out.println("Miecze:");


        //Wypisywanie statystyk z Armors
        System.out.println("Zbroje:");

        //Eq.Equip.get_ItemEq(4);
        WeaponsList.FindInArray();

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
}
