public class Fight {

    public static void Fight(){

        if (Monster.getHealth() > 0 && Postac.getHealth() > 0){
            Postac.dealDamage();
            if (Monster.getHealth() > 0){
                Monster.dealDamage(15);
            }

            Fight();
        }
        else{
            System.out.println("Koniec walki");
        }
    }

}
