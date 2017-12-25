package Game;

import Fighting.Fight;
import Monsters.Goblin;
import Monsters.Monster;
import Monsters.Zombie;

import java.util.Scanner;

/**
 * Created by Przykład Jan on 07.11.2017.
 */
public class Move{

    public static void Camp() {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine(); // nasz glowny scanner

        switch (a) {
            case "idz na polnoc":
                if(0==1) { //sprzwdza czy posiadamy dany item w eq
                    System.out.println("Droga jest zablokowana przez haszcze,");
                    System.out.println("jedyna opcja na przedostanie sie dalej");
                    System.out.println("to spalenie ich.");
                    System.out.println("Twoja pochodnia utworzyla niezly pozar,");
                    System.out.println("musisz go ugasic zeby przedostac sie dalej");
                    Camp();
                }else {
                    System.out.println("Droga jest zablokowana przez haszcze,");
                    System.out.println("jedyna opcja na przedostanie sie dalej");
                    System.out.println("to spalenie ich. Niestety nie posiadasz");
                    System.out.println("zadnego przedmiotu ktory by to umozliwial,");
                    System.out.println("wroc kiedy taki zdobedziesz.");
                    Camp();
                }


            case "idz na poludnie":
                if (Monster.getIsDead() == false){
                    Goblin goblinus = new Goblin(50, 50, 30, 30, 1.5, 1, "Goblin", 100, 200, 5, 10, 10, 20, 7, 18, false);
                    Fight.startBattle();
                    if (Monster.getIsDead() == true){
                        goblinus = null;
                    }
                    System.out.println("Widzisz pobojowiski z setkami zwlok.");
                    System.out.println("To tutaj stoczyla sie walka Twoich wrogow");
                    System.out.println("i ludzi ktorzy Cie uwolnili.");
                    Fild();
                }
                else {
                    System.out.println("Goblin rozjebany, idziemy do Filda");
                    Fild();
                }


            case "idz na wschod":
                if (Monster.getIsDead() == false){
                    Zombie zombie = new Zombie(50, 50, 30, 30, 1, 1, "Zombie", 100, 200, 5, 40, 15, 25, 5, 10, false);
                    System.out.println("isDead: " + Monster.getIsDead());
                    Fight.startBattle();
                    if (Monster.getIsDead() == true){
                        System.out.println("isDead: " + Monster.getIsDead());
                        zombie = null;
                    }
                    System.out.println("Podazajac na wschod widzisz duzy plac a na jego srodku studnie");
                    System.out.println("Znalazles miecz");
                    Well();
                }
                else {
                    System.out.println("Juz zajebałes ziombiaczka, idziemy do studni");
                    Well();
                }


            case "idz na zachod":
                System.out.println("Wchodzisz na przepiekna lake, w oddali rozciagaja sie pasma gorskie.");
                Meadow(); //Tymczasowo

            case "stats":
                Player.getStats();
                Camp();

            case "exit":
                System.exit(1);

            case "plecak":
                System.out.println("Plecak");
                Camp();

            case "eq":
                //zalozone.showWear();
                Camp();

            case "przeszukaj oboz":
                System.out.println("Znalazles zardzewialy miecz oraz pochodnie");
                System.out.println("-------------------------------");
                //System.out.println("+"+""+others.othe(0));
                //System.out.println("+"+""+Weapon.weapon(0));
                System.out.println("-------------------------------");
                //System.out.println("Czy chcesz załozyć "+Weapon.weapon(0));
                String b = scanner.nextLine();
                if (b.equals("tak")){
                    Goblin.setDamage(40, 80);
                    //zalozone.equipWeapon(0,6,0);// dodaje item z eq do tablicy "zalozone"
                    System.out.println(Player.getAttack());
                   // System.out.println("zalozyles "+ Weapon.weapon(0));
                    //Weapon.SendStats(); // wysyla statystyki broni do postaci
                    System.out.println("Atak: " + Player.getAttack());
                }else{
                    System.out.println("to sie pierdol");
                }
                Camp();

            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }
    }

    public static void Well() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("Tam nic nie ma, mozesz jedynie zawrocic do obozowiska.");
                Well();

            case "idz na polodnie":
                System.out.println("Tam nic nie ma, mozesz jedynie zawrocic do obozowiska.");
                Well();

            case "idz na wschod":
                System.out.println("Tam nic nie ma, mozesz jedynie zawrocic do obozowiska.");
                Well();

            case "idz na zachod":
                System.out.println("Wracasz to zrujnowanego obozowiska.");
                Move.Camp();

            case "stats":
                Player.getStats();
                Well();

            case "exit":
                System.exit(1);

            case "plecak":
                System.out.println("Plecak");
                Well();

            case "eq":
                //zalozone.showWear();
                Well();

            case "podejdz do studni":
                System.out.println("Podchodzisz do studni, widzisz stare wiaderko przymocowane lina do kolowrotka.");
                System.out.println("Na jedym z kamieni widzisz wyryta cyfre 2 ");
                Well();

            case "zagladnij do srodka":
                System.out.println("W ciemnosci studni widzisz maleniki blysk");
                Well();

            case "nabierz wody":
                System.out.println("nabierasz wody w srodku wiaderka dostrzegasz klucz");
                Well();

            case "wez klucz":
                System.out.println("Zabierasz klucz");
                //Tool1.addkeys(0,0,0);
                System.out.println("-------------------------------");
                //System.out.println("+"+""+Key1.klucz(0));
                System.out.println("-------------------------------");
                Well();

            case "Zabierz wiaderko":
                System.out.println("Zabierasz wiaderko z woda");
                System.out.println("item + 1");
                Well();

            default:
                System.out.println("Co Ty odpierdalasz ?");
                Well();
        }
    }

    public static void Fild() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("Wracasz do zrujnowanego obozowiska.");
                Move.Camp();

            case "idz na poludnie":
                System.out.println("Na południe od pobojowiska jest skarpa,");
                System.out.println("Jedyne co mozesz zrobic to z niej skoczyc");
                System.out.println("ale tego osobisicie nie doradzam.");
                Fild();

            case "idz na zachod":
                System.out.println("Tam nic nie ma, mozesz jedynie wrocic do obozowiska.");
                Camp();

            case "idz na wschod":
                System.out.println("Tam nic nie ma, mozesz jedynie wrocic do obozowiska.");
                Camp();

            case "stats":
                Player.getStats();
                Fild();

            case "exit":
                System.exit(1);

            case "plecak":
                System.out.println("Plecak");
                Fild();

            case "eq":
                //zalozone.showWear();
                Fild();

            case "przeszukaj zwloki":
                System.out.println("Przeszukujac zwloki natrafiasz na kilka mikstur leczniczych");
                System.out.println("|HP| Potion + 2");
                Fild();

            default:
                System.out.println("Co Ty odpierdalasz?");
                Fild();
        }
    }

    public static void Meadow() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "idz na wschod":
                System.out.println("Wracasz sie do zrujnowanego obozowiska");
                Move.Camp();

            case "idz na poludnie":
                System.out.println("Tam nic nie ma, pozostan na tej drodze.");
                Meadow();

            case "idz na polnoc":
                System.out.println("Tam nic nie ma, pozostan na tej drodze.");
                Meadow(); //Pozniej sie zmieni na jakas jaskinie czy cus

            case "idz na zachod":
                System.out.println("Wchodzisz do starej jaskini, wyglada na opuszczana.");
                System.out.println("Miej się na bacznosci nigdy nie wiesz co moze Cie spotkac.");
                Move.Cave();

            case "stats":
                Player.getStats();
                Meadow();

            case "exit":
                System.exit(1);

            case "plecak":
                System.out.println("Plecak");
                Meadow();

            case "eq":
                //zalozone.showWear();
                Meadow();

            case "zbieraj kwiatki":
                System.out.println("Andrzej co Ty pedal jestes ? #nohomo");
                Meadow();

            default:
                System.out.println("Co Ty odpierdalasz?");
                Meadow();
        }
    }

    public static void Cave() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Na tym koniec");

        switch (a) {
            case "dasdasda":
                System.out.println("Wracasz sie do zrujnowanego obozowiska");
                Move.Camp();
        }
    }

}

