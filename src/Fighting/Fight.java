package Fighting;

import Additional.Random;
import Game.Player;
import Monsters.Goblin;
import Monsters.Monster;
import Monsters.Skeleton;
import Monsters.Zombie;

public class Fight {

    public static void startBattle(){
        if (Monster.getIsDead() == false){
            System.out.println("------------------------------------------");
            System.out.println("Zostales zaatakowany przez: " + Monster.getNameOfTheMonster());
            System.out.println("------------------------------------------");

            if (Monster.getNameOfTheMonster().equals("Goblin")){
                goblinFight();
            }
            else if (Monster.getNameOfTheMonster().equals("Szkielet")){
                skeletonFight();
            }
            else if (Monster.getNameOfTheMonster().equals("Zombie")){
                zombieFight();
            }
            else {
                continueBattle();
            }
        }
        else {
            isDead();
        }
    }

    public static void continueBattle(){
        double attack = Random.RInt(1,2);

        if (Monster.getHealth() > 0 && Player.getHealth() > 0){
            Player.dealDamage();
            if (Monster.getHealth() > 0){
                if (attack == 1 && Monster.getMana() > 15){
                    Monster.magicAttack();
                }
                else{
                    Monster.physicAttack(Monster.getDamageMin(), Monster.getDamageMax());
                }
            }
            System.out.println("------------------------------------------");
            continueBattle();
        }
        else{
            endFight();
        }
    }

    public static void goblinFight(){
        if (Monster.getHealth() > 0 && Player.getHealth() > 0){
            Player.dealDamage();
            if (Monster.getHealth() > 0){
                Goblin.fight();
            }
            System.out.println("------------------------------------------");
            goblinFight();
        }
        else{
            endFight();
        }
    }

    public static void skeletonFight(){
        if (Monster.getHealth() > 0 && Player.getHealth() > 0){
            Player.dealDamage();
            if (Monster.getHealth() > 0){
                Skeleton.fight();
            }
            System.out.println("------------------------------------------");
            skeletonFight();
        }
        else{
            endFight();
        }
    }

    public static void zombieFight(){
        if (Monster.getHealth() > 0 && Player.getHealth() > 0){
            Player.dealDamage();
            if (Monster.getHealth() > 0){
                Zombie.fight();
            }
            System.out.println("------------------------------------------");
            zombieFight();
        }
        else{
            endFight();
        }
    }

    public static void endFight(){
        System.out.println("Koniec walki");
        isDead();
    }

    public static void isDead(){
        Monster.setIsDead(true);
    }

}
