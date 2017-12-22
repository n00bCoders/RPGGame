package Fighting;

import Additional.Random;
import Game.Postac;
import Monsters.Monster;

public class Fight {

    public static void Fight(){
        double a = Random.RInt(1,2);

        if (Monster.getHealth() > 0 && Postac.getHealth() > 0){
            Postac.dealDamage();
            if (Monster.getHealth() > 0){
                if (a == 1 && Monster.getMana() > 15){
                    System.out.println(a);
                    Monster.magicAttack(Monster.getMana()); //Musi atakowac z Monstera, do poprawy
                }
                else{
                    System.out.println(a);
                    Monster.physicAttack(Monster.getDamageMin(), Monster.getDamageMax());
                }
            }
            System.out.println("------------------------------------------");
            Fight();
        }
        else{
            System.out.println("Koniec walki");
        }
    }

}
