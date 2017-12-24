package Fighting;

import Additional.Random;
import Game.Postac;
import Monsters.Monster;

public class Fight {

    public static void startBattle(){
        System.out.println("------------------------------------------");
        System.out.println("Zostales zaatakowany przez: " + Monster.getNameOfTheMonster());
        System.out.println("------------------------------------------");
        continueBattle();
    }

    public static void continueBattle(){
        double a = Random.RInt(1,2);

        if (Monster.getHealth() > 0 && Postac.getHealth() > 0){
            Postac.dealDamage();
            if (Monster.getHealth() > 0){
                if (a == 1 && Monster.getMana() > 15){
                    System.out.println(a);
                    Monster.magicAttack(Monster.getMana());
                }
                else{
                    System.out.println(a);
                    Monster.physicAttack(Monster.getDamageMin(), Monster.getDamageMax());
                }
            }
            System.out.println("------------------------------------------");
            continueBattle();
        }
        else{
            System.out.println("Koniec walki");
            //freeMemory();
        }
    }

    /*public static void freeMemory(){
        Monster. = null;
    }
    */

}
