public class Fight {

    public static void Fight(){

        if (Monster.getHealth() > 0 && Postac.getHealth() > 0){
            Postac.dealDamage();
            if (Monster.getHealth() > 0){
                Goblin.dealDamage(); //Musi atakowac z Monstera, do poprawy
            }
            System.out.println("------------------------------------------");
            Fight();
        }
        else{
            System.out.println("Koniec walki");
        }
    }

}
