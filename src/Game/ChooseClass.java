package Game;

import Classes.Wojownik;

import java.util.Scanner;

public class ChooseClass {

    static Scanner scanner = new Scanner(System.in);

    public static void setNameAndClass(){
        System.out.println("Podaj imie bohatera");
        String name = scanner.nextLine();

        System.out.println("Wybierz klasę (Wpisz numer klasy) :");
        System.out.println("1 - Wojownik: Zdrowie + 50, Mana - 20, Obrona + 5, Atak + 5, Inteligencja - 3, Witalność + 2");
        System.out.println("2 - Łotr");
        System.out.println("3 - Mag");

        int playerClass = scanner.nextInt();

        if (playerClass == 1 ){
            Wojownik wojownik = new Wojownik (100, 100, 30, 30, 0.8, 5, 5, 3, 5, 5, 5, name);
            System.out.println("Wybrałeś wojownika, powodzenia!");
            System.out.println("Twe imie, chuju, to!: " + Postac.getName());
        }
        else if (playerClass == 2){
        }
        else if (playerClass == 3){
        }
        else {
            System.out.println("Podałeś złą cyfrę, popraw.");
        }
    }

}
