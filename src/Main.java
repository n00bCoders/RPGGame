public class Main {
    public static void main(String args[]){

        Skeleton szkieletus = new Skeleton(100, 100, 30, 30, 1.0, 1, "Szkielet", 5, 40, 1, 20, 5, 20, 4, 40);

        szkieletus.takeDamage(15);
        szkieletus.dealDamage();
        System.out.println(szkieletus.getHealthStatusBar());

        Goblin goblinus = new Goblin(46, 50, 30, 30, 1.5, 1, "Goblin", 5, 10, 5, 10, 5, 16, 7, 18);

        System.out.println();
        goblinus.takeDamage(10);
        goblinus.dealDamage();
        //System.out.println(goblinus.getHealthStatusBar());
        //System.out.println(goblinus.getDamageStatusBar());


    }
}
