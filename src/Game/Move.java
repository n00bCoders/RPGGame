package Game;

import java.util.Scanner;

/**
 * Created by Przykład Jan on 07.11.2017.
 */
public class Move {

    static Scanner scanner = new Scanner(System.in);
    static String a = scanner.nextLine(); // nasz glowny scanner

    public static void Camp() {

        switch (a) {
            case "idz na polnoc":
                System.out.println("Idziesz do Forest <FLAGA>");
                Forest();

            case "idz na poludnie":
                System.out.println("Idziesz na Battlefield");
                Battlefield();

            case "idz na wschod":
                System.out.println("Idziesz na Field1");
                Field1();

            case "idz na zachod":
                System.out.println("Idziesz do Well");
                Well();

            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }
    }

    public static void Well(){

        switch (a) {
            case "idz na polnoc":
                System.out.println("Nie da się tam iść");
                Well();

            case "idz na poludnie":
                System.out.println("Nie da się tam iść");
                Well();

            case "idz na wschod":
                System.out.println("Wracasz do Camp");
                Camp();

            case "idz na zachod":
                System.out.println("Idziesz do Field2");
                Field2();

            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }

    public static void Field1(){

        switch (a) {
            case "idz na polnoc":
                System.out.println("Nie da się tam iść");
                Field1();

            case "idz na poludnie":
                System.out.println("Nie da się tam iść");
                Field1();

            case "idz na wschod":
                System.out.println("Idziesz do Camp");
                Camp();

            case "idz na zachod":
                System.out.println("Idziesz do Hut");
                Hut();

            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }

    public static void Field2(){

        switch (a) {
            case "idz na polnoc":
                System.out.println("Nie da się tam iść");
                Field2();

            case "idz na poludnie":
                System.out.println("Nie da się tam iść");
                Field2();

            case "idz na wschod":
                System.out.println("Idziesz do Graveyard");
                Graveyard();

            case "idz na zachod":
                System.out.println("Idziesz do Well");
                Field2();

            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }

    public static void Graveyard(){

        switch (a) {
            case "idz na polnoc":
                Mansion();

            case "idz na poludnie":
                System.out.println("tam nic nie ma");


            case "idz na wschod":
                System.out.println("tam nic nie ma");


            case "idz na zachod":
                Field2();

            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }

    public static void Mansion(){

        switch (a) {
            case "idz na polnoc":
                System.out.println("tam nic nie ma");


            case "idz na poludnie":
                Graveyard();

            case "idz na wschod":
                System.out.println("tam nic nie ma");

            case "idz na zachod":
                System.out.println("tam nic nie ma");


            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }

    public static void Battlefield(){

        switch (a) {
            case "idz na polnoc":
                Camp();

            case "idz na poludnie":
                System.out.println("tam nic nie ma");


            case "idz na wschod":
                System.out.println("tam nic nie ma");


            case "idz na zachod":
                System.out.println("tam nic nie ma");


            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }

    public static void Forest(){

        switch (a) {
            case "idz na polnoc":
                Dungeon();

            case "idz na poludnie":
                Camp();

            case "idz na wschod":
                System.out.println("tam nic nie ma");


            case "idz na zachod":
                System.out.println("tam nic nie ma");


            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }

    public static void Dungeon(){

        switch (a) {
            case "idz na polnoc":
                System.out.println("tam nic nie ma");

            case "idz na poludnie":
                Forest();

            case "idz na wschod":
                System.out.println("tam nic nie ma");

            case "idz na zachod":
                System.out.println("tam nic nie ma");

            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }

    public static void SecretRoom(){

        switch (a) {
            case "idz na polnoc":


            case "idz na poludnie":


            case "idz na wschod":


            case "idz na zachod":


            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }

    public static void Hut(){

        switch (a) {
            case "idz na polnoc":
                SwordPlace();

            case "idz na poludnie":
                System.out.println("tam nic nie ma");

            case "idz na wschod":
                Field1();

            case "idz na zachod":
                System.out.println("tu bedzie jakas zagadka albo klucz");

            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }

    public static void SwordPlace(){

        switch (a) {
            case "idz na polnoc":
                System.out.println("tam nic nie ma");

            case "idz na poludnie":
                Hut();

            case "idz na wschod":
                System.out.println("tam nic nie ma");


            case "idz na zachod":
                System.out.println("tam nic nie ma");


            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }
}


