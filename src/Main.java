import Items.Armors;
import Items.Weapons;

public class Main {
    public static void main(String args[]) {

        //Wypisywanie statystyk z Weapons
        System.out.println("Miecze:");
        Weapons.stats(1);
        Weapons.stats(0);

        //Wypisywanie statystyk z Armors
        System.out.println("Zbroje:");
        Armors.stats(0);
        Armors.stats(1);

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
//chuj