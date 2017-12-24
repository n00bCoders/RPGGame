package Game;

import Classes.Rogue;
import Classes.Warrior;

import java.util.Scanner;

public class MakePlayer {

    static Scanner scanner = new Scanner(System.in);

    public static void setNameAndClass(){
        System.out.println("Podaj imie bohatera");
        String name = scanner.nextLine();

        System.out.println("Wybierz klasę (Wpisz numer klasy) :");
        System.out.println("1 - Warrior: Zdrowie * 1.3, Mana * 0.4, Obrona + 5, Atak + 5, Inteligencja - 3, Witalność + 2");
        System.out.println("2 - Łotr");
        System.out.println("3 - Mag");

        int playerClass = scanner.nextInt();

        if (playerClass == 1 ){
            Warrior warrior = new Warrior(100, 100, 30, 30, 0.8, 5, 5, 3, 5, 5, 5, name);
            System.out.println("Wybrałeś wojownika, powodzenia!");
            System.out.println("Twe imie, chuju, to: " + Postac.getName() + "!");
        }
        else if (playerClass == 2){
            Rogue rogue = new Rogue(100, 100, 30, 30, 1, 5, 5, 5, 5, 5, 5, name);
        }
        else if (playerClass == 3){
            //Shaman do stworzenia
        }
        else {
            System.out.println("Podałeś złą cyfrę, popraw.");
        }
    }

}
