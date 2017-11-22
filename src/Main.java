public class Main {
    public static void main(String args[]){

        Goblin goblinus = new Goblin(46, 50, 30, 30, 1.5, 1, "Goblin", 5, 10, 5, 10, 5, 16, 7, 18);

        System.out.println();

        String a = "chuj";

        Wojownik wojownik = new Wojownik(100, 100, 30, 30, 1.0, 5, 1, 5, 5, 5, 1, a);
        //wojownik.dealDamage();
        //goblinus.dealDamage();
        //System.out.println(wojownik.getHealthBar());
        //goblinus.takeDamage(10);
        //goblinus.dealDamage();
        //System.out.println(goblinus.getHealthStatusBar());
        Fight.Fight();
    }
}
