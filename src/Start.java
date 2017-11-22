import java.util.Scanner;

/**
 * Created by Przykład Jan on 27.10.2017.
 */
public class Start {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w Gothic 8 nie arkania");
        System.out.println("Podaj imie bohatera");
        //String imie = scanner.nextLine();
        String imie = "x";

        Wojownik wojownik = new Wojownik(100, 100, 30, 30, 1.0, 5, 1, 5, 5, 5, 1, imie);

        System.out.println("Twoje imie to: " + Postac.getName());
        System.out.println("Twoja przygoda zaczyna sie w zrujnowanym obozowisku,");
        System.out.println("Byles jencem wojennym a obozowisko Twoich wrogow zostalo zaatakowane.");
        System.out.println("Budzisz sie rano i jedyne co pamietasz to tajemnicza postac w kapturze,");
        System.out.println("ktora Cie oswobodzila.");
        System.out.println("Co robisz ?");

        //Random.Cryt();

        //Lokacja startowa
        Move.Camp();
    }
}











